package negocio;

import java.time.LocalDate;
import java.util.List;
import dao.PersonaDao;
import datos.Cliente;
import datos.Empleado;
import datos.Local;
import datos.Persona;

public class PersonaAbm {
	private static PersonaAbm instancia = null; // Patrón Singleton

	PersonaDao personaDao = new PersonaDao();
	public PersonaAbm() {
	}

	public static PersonaAbm getInstance() {
		if (instancia == null)
			instancia = new PersonaAbm();
		return instancia;
	}

	public Persona traerPersona(long idPersona) {
		return personaDao.getInstance().traerPersona(idPersona);
	}
	
	public Persona traerPersonaYLocales(long idPersona) {
		return personaDao.getInstance().traerPersonaYLocales(idPersona);
	}

	public List<Persona> traerPersona() {
		return personaDao.getInstance().traerPersona();
	}
	//Persona Empleado 
	public int agregarPersona(String nombre, String apellido, int dni, LocalDate fechaDeNacimiento, String tipo,
			String franjaHoraria, double sueldoBasico, Local local) {
		return personaDao.agregarPersona(new Empleado (nombre,  apellido,  dni,  fechaDeNacimiento, tipo,  franjaHoraria,
				 sueldoBasico, local));	
	}
	
//Persona Cliente
	public int agregarPersona(String nombre, String apellido, int dni, LocalDate fechaDeNacimiento, String email) {
		return personaDao.agregarPersona(new Cliente( nombre,  apellido,  dni,  fechaDeNacimiento,  email));
	}
	
	
	
	
}