package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.ProductoDao;
import datos.Producto;
import datos.Local;
import datos.Lote;

public class ProductoAbm {
	ProductoDao productoDao = new ProductoDao();
	
	
	public int agregarProducto(String descripcion, double precioUnitario, LocalDate fechaAlta, int stock,Lote lote) {
	Producto producto = new Producto( descripcion,  precioUnitario,  fechaAlta,  stock , lote);	
	return productoDao.agregarProducto(producto);
}
	
	public Producto traerProducto(long idProducto) {
		return productoDao.traerProducto(idProducto);
	}

	public List<Producto> traerProducto() {
		return productoDao.traerProducto();
	}
	

	public List<Producto> traerProductoLote(long idProducto) {
		return productoDao.traerProductoLote(idProducto);
	}
	
	
	
	
	

}
