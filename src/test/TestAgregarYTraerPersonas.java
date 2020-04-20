package test;

import java.time.LocalDate;
import java.util.List;

import datos.Cliente;
import datos.Empleado;
import datos.Local;
import datos.Persona;
import negocio.LocalAbm;
import negocio.PersonaAbm;

public class TestAgregarYTraerPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaAbm  personaAbm =new  PersonaAbm();
		LocalAbm  localAbm = new LocalAbm();
		
		//long persona = personaAbm.agregarPersona("Pablo", "Lopez", 38554122, LocalDate.of(1990,8, 11), "pablo@gmial.com");
		//System.out.println("Id persona ingresada: " + persona);
		//long persona = personaAbm.agregarPersona("Eduardo", "Perales", 18477522, LocalDate.of(1980,12, 7), "eduardo80@gmail.com");
		//System.out.println("Id persona ingresada: " + persona);
		
		//long persona = personaAbm.agregarPersona("Maria", "Perez", 22554107, LocalDate.of(1997,5, 21),"Gerente", "8am - 15pm", 20000.00);
		//System.out.println("Id persona ingresada: " + persona);
		//long persona = personaAbm.agregarPersona("Martin", "Rodriguez", 22846254, LocalDate.of(2000,7,1),"Gerente", "8am - 15pm", 20000.00);
		//System.out.println("Id persona ingresada: " + persona);
		

		
		 
	/*	long idLocal = 1;
		Local l = localAbm.traerLocal(idLocal);
		long persona = personaAbm.agregarPersona("Luciano", "Villareal", 38552110, LocalDate.of(1993,5, 17),"Vendedor", "8am - 17pm", 15000.00, l);
		System.out.println("Id persona ingresada: " + persona);
		
		idLocal = 3;
		 l = localAbm.traerLocal(idLocal);
		 persona = personaAbm.agregarPersona("Aldana", "Lozada", 40211044, LocalDate.of(1995,9,21),"Vendedor", "8am - 17pm", 15000.00, l);
		System.out.println("Id persona ingresada: " + persona);*/
		
		
		
		long idPersona = 1;
		System.out.println("Traer persona por id: "+ idPersona);
		Persona p1 = (Cliente)personaAbm.getInstance().traerPersonaYLocales(idPersona);
		System.out.println(p1);
		System.out.println("Lista de locales de cliente ID: " + idPersona);
		for (Local lo :((Cliente) p1).getLocales()) System.out.println(lo);
		
		idPersona = 2;
		System.out.println("\nTraer persona por id: "+ idPersona);
		 p1 =personaAbm.traerPersona(idPersona);//getInstance().traerPersonaYLocales(idPersona);
		System.out.println(p1);
	//	for(Local lo: p1.getLocales())System.out.println(lo);
		
		 idPersona = 3;
		System.out.println("\nTraer persona por id: "+ idPersona);
		 p1 =personaAbm.getInstance().traerPersonaYLocales(idPersona);
		System.out.println(p1);
		System.out.println("Lista de locales de cliente ID: " + idPersona);
		for (Local lo : ((Cliente) p1).getLocales()) System.out.println(lo);
		
	//	for(Local lo: p1.getLocales())System.out.println(lo);
		
	/*	idPersona = 2;
		System.out.println("\nTraer persona por id: "+ idPersona);
		p1 =personaAbm.traerPersonaYLocales(idPersona);//getInstance().traerPersonaYLocales(idPersona);
		System.out.println(p1);
		for(Local lo: p1.getLocales())System.out.println(lo);*/
		
		
	/*	 idPersona = 2;
		System.out.println("\nTraer persona por id: "+ idPersona);
		p1 =personaAbm.getInstance().traerPersonaYLocales(idPersona);
		System.out.println(p1);
		for(Local lo: p1.getLocales())System.out.println(lo);
		
		System.out.println("\nTraer lista de personas");
		for (Persona p : personaAbm.getInstance().traerPersona() ) {
			System.out.println(p);
		}*/
		
		System.out.println("\n\nTraer lista de personas");
		List<Persona> personas = personaAbm.getInstance().traerPersona();
		for(Persona p : personas) {
			System.out.println(p);
		}
		
		
		
		

	}

}
