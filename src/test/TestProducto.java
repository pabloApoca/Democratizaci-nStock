package test;

import java.time.LocalDate;

import datos.Empleado;
import datos.Local;
import datos.Lote;
import datos.Producto;
import negocio.LocalAbm;
import negocio.LoteAbm;
import negocio.ProductoAbm;

public class TestProducto {

	public static void main(String[] args) {
		LoteAbm loteAbm = new LoteAbm();
		LocalAbm localAbm = new LocalAbm();
		ProductoAbm productoAbm = new ProductoAbm();
		
//------------------Agregar producto--------------------------
	/*	long idLote=2;
		Lote lot = loteAbm.traerLote(idLote);
		System.out.println("\n"+lot);
		
		int idProd = productoAbm.agregarProducto("Arroz", 15.00, LocalDate.now(), 7, lot);
		System.out.println("Id producto ingresado: " +idProd); 
		
		long idProducto= idProd;
		Producto p = productoAbm.traerProducto(idProducto);
		System.out.println(p);
		
		
		 idProd = productoAbm.agregarProducto("Fideos", 18.50, LocalDate.now(), 20, lot);
		System.out.println("Id producto ingresado: " +idProd); 
		 idProducto= idProd;
		 p = productoAbm.traerProducto(idProducto);
		System.out.println(p);
		
		 idProd = productoAbm.agregarProducto("Manteca", 40.50, LocalDate.now(), 30, lot);
		System.out.println("Id producto ingresado: " +idProd); 
		 idProducto= idProd;
		 p = productoAbm.traerProducto(idProducto);
		System.out.println(p);*/
		
		
//------------------Traer lista de productos--------------------------
	//	System.out.println("Traer lista de productos del lote ID: " + lot.getIdLote());
		System.out.println("\nTraer lista de productos");
		for(Producto pr : productoAbm.traerProducto())System.out.println(pr);
		
		
//------------------Traer lista de productos por id local--------------------------
		long idLote=1;
		Lote lot = loteAbm.traerLote(idLote);
		System.out.println("\nTraer lista de productos del lote ID: "+idLote );
		for(Producto pr : productoAbm.traerProductoLote(idLote))System.out.println(pr);
		
		
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
			for(Producto pr : productoAbm.traerProductoLote(el.getIdLote())) {
				System.out.println(pr);
			}
			
		}
		
		
		
		
		

	}

}
