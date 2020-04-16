package test;

import java.time.LocalDate;
import java.util.List;

import datos.Cliente;
import datos.Persona;
import negocio.PersonaAbm;

public class TestAgregarPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaAbm  personaAbm =new  PersonaAbm(); 
		
		//long persona = personaAbm.agregarPersona("Pablo", "Lopez", 38554122, LocalDate.of(1990,8, 11), "pablo@gmial.com");
		//System.out.println("Id persona ingresada: " + persona);
		
		//long persona = personaAbm.agregarPersona("Maria", "Perez", 22554107, LocalDate.of(1997,5, 21), "8am - 15pm", 20000.00);
		//System.out.println("Id persona ingresada: " + persona);
		
		long idPersona = 1;
		System.out.println("Traer persona por id: "+ idPersona);
		System.out.println(personaAbm.traerPersona(idPersona));
		 idPersona = 2;
		System.out.println("\nTraer persona por id: "+ idPersona);
		System.out.println(personaAbm.traerPersona(idPersona));
		
		System.out.println("\nTraer lista de personas");
		for (Persona p : personaAbm.getInstance().traerPersona() ) {
			System.out.println(p);
		}
		
		List<Persona> personas = personaAbm.traerPersona();
		for(Persona p : personas) {
			System.out.println(p);
		}
		
		
		
		
		
		

	}

}
