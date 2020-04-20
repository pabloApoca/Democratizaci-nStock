package datos;

import java.time.LocalDate;
import java.util.Set;

public class Lote {
	private long idLote;
	private int cantidad;
	private LocalDate fechaIngreso;
	private Local local;
	private Set<Producto> productos;
	
	public Lote() {
		super();
	}

	public Lote(int cantidad, LocalDate fechaIngreso, Local local) {
		super();
		this.cantidad = cantidad;
		this.fechaIngreso = fechaIngreso;
		this.local = local;
	}

	public long getIdLote() {
		return idLote;
	}

	public void setIdLote(long idLote) {
		this.idLote = idLote;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", cantidad=" + cantidad + ", fechaIngreso=" + fechaIngreso + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}