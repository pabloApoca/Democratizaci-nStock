package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Lote;
import datos.Producto;

public class ProductoDao {
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

	public int agregarProducto(Producto objeto) {
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
	
	public Producto traerProducto(long idProducto) throws HibernateException {
		Producto obj = null;
		try {
			iniciaOperacion();
			String hQL = "from Producto p  where p.idProducto=" + idProducto;
			obj = (Producto) session.createQuery(hQL).uniqueResult();
		//	Hibernate.initialize( obj.getEmpleados());
		} finally {
			session.close();
		}
		return obj;
	}
	
	

	
	@SuppressWarnings("unchecked")
	public List<Producto> traerProducto() throws HibernateException {
		List<Producto> lista = null;
		try {
			iniciaOperacion();
			//lista = session.createQuery("from Local c inner join fetch c.cliente cli inner join fetch c.empleados order by c.idLocal").list();
			lista = session.createQuery("from Producto c order by c.idProducto ").list();
		//	Hibernate.initialize( Local.getEmpleados());
		//	Hibernate.initialize ( lista.getClass(getEmpleados()));

		} finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> traerProductoLote(long idLote) throws HibernateException {
		List<Producto> lista = null;
		try {
			iniciaOperacion();
			//lista = session.createQuery("from Local c inner join fetch c.cliente cli inner join fetch c.empleados order by c.idLocal").list();
			lista = session.createQuery("from Producto c order by c.idProducto ").list();
lista = session.createQuery("from Producto c inner join fetch c.lote lo where lo.idLote=" + idLote+" order by c.idProducto  ").list();

		//	Hibernate.initialize( Local.getEmpleados());
		//	Hibernate.initialize ( lista.getClass(getEmpleados()));

		} finally {
			session.close();
		}
		return lista;
	}
	
/*	@SuppressWarnings("unchecked")
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
	}*/
	
}