package datos;

import java.time.LocalDate;

public class Producto {
	private long idProducto;
	private String descripcion;
	private double precioUnitario;
	private LocalDate fechaAlta;
	private int stock;
	private Lote lote;
	
	public Producto() {
		super();
	}

	public Producto(String descripcion, double precioUnitario, LocalDate fechaAlta, int stock,Lote lote) {
		super();
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.fechaAlta = fechaAlta;
		this.stock = stock;
		this.lote = lote;

		
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", fechaAlta=" + fechaAlta + ", stock=" + stock + "]";
	}
	
	

}
