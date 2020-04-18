package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Cliente;
import datos.Local;

public class LocalDao {
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public int agregarLocal(Local objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}
	
	public Local traerLocal(long idLocal) throws HibernateException {
		Local obj = null;
		try {
			iniciaOperacion();
			String hQL = "from Local p inner join fetch p.cliente c  where p.idLocal=" + idLocal;
			obj = (Local) session.createQuery(hQL).uniqueResult();
			Hibernate.initialize( obj.getEmpleados());
		} finally {
			session.close();
		}
		return obj;
	}
	
	

	
	@SuppressWarnings("unchecked")
	public List<Local> traerLocal() throws HibernateException {
		List<Local> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Local c order by c.idLocal").list();
		} finally {
			session.close();
		}
		return lista;
	}
	
}