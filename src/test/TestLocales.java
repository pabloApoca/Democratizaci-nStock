package test;

import negocio.LocalAbm;
import negocio.PersonaAbm;
import datos.Cliente;
import datos.Empleado;
import datos.Local;
import datos.Persona;

public class TestLocales {

	public static void main(String[] args) {
		LocalAbm localAbm = new LocalAbm();	
		PersonaAbm personaAbm = new PersonaAbm();
		
		
	/*	long idPersona = 2;
		System.out.println("Traer persona por id: "+ idPersona);
		Empleado em = (Empleado)personaAbm.traerPersona(idPersona);
		//Persona pe = personaAbm.traerPersona(idPersona);
		System.out.println(em);
		
		idPersona = 1;*/
		//Cliente cli = (Cliente)personaAbm.traerPersona(idPersona);
		
		//Agregar local
	//	long idLocal =localAbm.agregarLocal("Pasaje 101" , 2112.555, 2221.444, 1111111, 42881100, cli);
	//	System.out.println("Id local agregado: " + idLocal);
	//	long idLocal =localAbm.agregarLocal("Pasaje 002" , 3223.2222, 2221.2222, 5555555, 42551874, cli);
	//	System.out.println("Id local agregado: " + idLocal);
		
	//	long idLocal =localAbm.agregarLocal("Pasaje 456" , 4114.4444, 3333.555, 2222222, 58552001, cli);	
	//	System.out.println("Id local agregado: " + idLocal);
	//	long idLocal =localAbm.agregarLocal("Pasaje 003" , 4334.1111, 3223.2112, 6666666, 42551874, cli);
	//	System.out.println("Id local agregado: " + idLocal);
		
		//Traer locales por id
		
		long idLocal = 1;
		Local l = localAbm.traerLocal(idLocal);
		System.out.println("\n"+l);	
		System.out.println("CLIENTE -> "+l.getCliente());
		System.out.println("Lista de empleados del local");
		for(Empleado e : l.getEmpleados()) {
			System.out.println(e);
		}
		
		 idLocal = 2;
		 l = localAbm.traerLocal(idLocal);
		System.out.println("\n"+l);	
		System.out.println("CLIENTE -> "+l.getCliente());
		System.out.println("Lista de empleados del local");
		for(Empleado e : l.getEmpleados()) {
			System.out.println(e);
		}
		
		 idLocal = 3;
		 l = localAbm.traerLocal(idLocal);
		System.out.println("\n"+l);	
		System.out.println("CLIENTE -> "+l.getCliente());
		System.out.println("Lista de empleados del local");
		for(Empleado e : l.getEmpleados()) {
			System.out.println(e);
		}
		
		//Traer la lista de los locales 
		
		System.out.println("\n\n-----------------Traer lista de locales-----------------");
		for(Local loc : localAbm.traerLocal()) {
			System.out.println(loc);
			System.out.println(loc.getCliente()+ "\n");
		/*	for(Empleado e: loc.getEmpleados()) {
				System.out.println(e);
			}
			System.out.println("\n");*/

		}
		
		
		
		
		
		
		
		
		
		

	}

}
