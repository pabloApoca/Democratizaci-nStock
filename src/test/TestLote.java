package test;

import java.time.LocalDate;

import datos.Empleado;
import datos.Local;
import datos.Lote;
import negocio.LocalAbm;
import negocio.LoteAbm;

public class TestLote {

	public static void main(String[] args) {
		LoteAbm loteAbm = new LoteAbm();
		LocalAbm localAbm = new LocalAbm();
		
//--------------------------Agregar lote----------------------------------------------
	/*	long idLocal = 1;
		Local l = localAbm.traerLocal(idLocal);
		System.out.println("\n"+l);	
		int lote = loteAbm.agregarLote(2, LocalDate.now(), l);
		System.out.println("Ultimo id lote ingresado: " + lote);*/
		
	/*	long idLocal = 1;
		Local l = localAbm.traerLocal(idLocal);
		System.out.println("\n"+l);	
		int lote = loteAbm.agregarLote(5, LocalDate.now(), l);
		System.out.println("Ultimo id lote ingresado: " + lote);*/
		
		
//--------------------------Traer lote----------------------------------------------
		long idLote=1;
		Lote lot = loteAbm.traerLote(idLote);
		System.out.println("\n"+lot);
		
		 idLote=2;
		 lot = loteAbm.traerLote(idLote);
		System.out.println("\n"+lot);
		
		System.out.println("-------Traer lista de lotes-------");
		for(Lote l : loteAbm.traerLote())System.out.println(l);
		
		
		
		long idLocal = 1;
		Local l = localAbm.traerLocal(idLocal);
		System.out.println("\n"+l);	
		System.out.println("CLIENTE -> "+l.getCliente());
		System.out.println("Lista de empleados del local ID: "+l.getIdLocal());
		for(Empleado e : l.getEmpleados()) {
			System.out.println(e);
		}
		System.out.println("Lista de lotes del local ID: "+l.getIdLocal());
		for(Lote el : loteAbm.traerLoteLocal(idLocal)) {
			System.out.println(el);
		}
		
	}

}
