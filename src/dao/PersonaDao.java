package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Cliente;
import datos.Persona;


public class PersonaDao {
	private static Session session;
	private Transaction tx;
	private static PersonaDao instancia = null; // Patr�n Singleton

	public PersonaDao() {
	}

	public static PersonaDao getInstance() {
		if (instancia == null)
			instancia = new PersonaDao();
		return instancia;
	}

	protected void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	protected void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public Persona traerPersona(long idPersona) {
		Persona objeto = null;
		try {
			iniciaOperacion();//inner join fetch c.locales l
			objeto = (Persona) session.createQuery("from Persona c  where c.idPersona =" + idPersona).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public Persona traerPersonaYLocales(long idPersona) {
		Persona objeto = null;
		try {
			iniciaOperacion();//inner join fetch c.locales l
			objeto = (Persona) session.createQuery("from Persona c inner join fetch c.locales l where c.idPersona =" + idPersona).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public int agregarPersona(Persona objeto) {
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

	@SuppressWarnings("unchecked")
	public List<Persona> traerPersona() throws HibernateException {
		List<Persona> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Persona c order by c.idPersona").list();
		} finally {
			session.close();
		}
		return lista;
	}
}