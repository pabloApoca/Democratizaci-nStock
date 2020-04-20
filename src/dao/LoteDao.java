package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Lote;

public class LoteDao {
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

	public int agregarLote(Lote objeto) {
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
	
	public Lote traerLote(long idLote) throws HibernateException {
		Lote obj = null;
		try {
			iniciaOperacion();
			String hQL = "from Lote p  where p.idLote=" + idLote;
			obj = (Lote) session.createQuery(hQL).uniqueResult();
		//	Hibernate.initialize( obj.getEmpleados());
		} finally {
			session.close();
		}
		return obj;
	}
	
	

	
	@SuppressWarnings("unchecked")
	public List<Lote> traerLote() throws HibernateException {
		List<Lote> lista = null;
		try {
			iniciaOperacion();
			//lista = session.createQuery("from Local c inner join fetch c.cliente cli inner join fetch c.empleados order by c.idLocal").list();
			lista = session.createQuery("from Lote c order by c.idLote ").list();
		//	Hibernate.initialize( Local.getEmpleados());
		//	Hibernate.initialize ( lista.getClass(getEmpleados()));

		} finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Lote> traerLoteLocal(long idLocal) throws HibernateException {
		List<Lote> lista = null;
		try {
			iniciaOperacion();
			//lista = session.createQuery("from Local c inner join fetch c.cliente cli inner join fetch c.empleados order by c.idLocal").list();
			lista = session.createQuery("from Lote c inner join fetch c.local lo where lo.idLocal=" + idLocal+" order by c.idLote  ").list();
		//	Hibernate.initialize( Local.getEmpleados());
		//	Hibernate.initialize ( lista.getClass(getEmpleados()));

		} finally {
			session.close();
		}
		return lista;
	}
	
}