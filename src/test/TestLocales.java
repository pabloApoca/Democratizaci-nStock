package test;

import negocio.LocalAbm;
import negocio.PersonaAbm;
import datos.Local;
import datos.Persona;

public class TestLocales {

	public static void main(String[] args) {
		LocalAbm localAbm = new LocalAbm();	
		PersonaAbm personaAbm = new PersonaAbm();
		
		
		long idPersona = 3;
		System.out.println("Traer persona por id: "+ idPersona);
		Persona pe = personaAbm.traerPersona(idPersona);
		System.out.println();
		
		//Agregar local
	//	long idLocal =localAbm.agregarLocal("Pasaje 123" , 2112.555, 2221.444, 1111111, 42881100);
//		System.out.println("Id local agregado: " + idLocal);
	//	long idLocal =localAbm.agregarLocal("Pasaje 002" , 3223.2222, 2221.2222, 5555555, 42551874, pe);
	//	System.out.println("Id local agregado: " + idLocal);
		
	//	long idLocal =localAbm.agregarLocal("Pasaje 456" , 4114.4444, 3333.555, 2222222, 58552001);	
	//	System.out.println("Id local agregado: " + idLocal);
		long idLocal =localAbm.agregarLocal("Pasaje 003" , 4334.1111, 3223.2112, 6666666, 42551874, pe);
		System.out.println("Id local agregado: " + idLocal);
		
		//Traer locales
		
		 idLocal = 1;
		System.out.println(localAbm.traerLocal(idLocal));					
		 idLocal = 2;
		System.out.println(localAbm.traerLocal(idLocal));
		
		System.out.println("\nTraer lista de locales");
		for(Local l : localAbm.traerLocal()) {
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
