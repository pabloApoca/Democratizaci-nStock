package datos;

import java.util.Set;

public class Local {
	private long idLocal;
	private String direccion;
	private double latitud;
	private double longitud;
	private int codLocal;
	private int nroTelefono;
	private Cliente cliente;
	private Set<Empleado> empleados;
	private Set<Lote> lotes;

	
	public Local() {
		super();
	}

	public Local(String direccion, double latitud, double longitud, int codLocal, int nroTelefono,Cliente cliente) {
		super();
		this.direccion = direccion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.codLocal = codLocal;
		this.nroTelefono = nroTelefono;
		this.cliente = cliente;
	}

	public long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(long idLocal) {
		this.idLocal = idLocal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getCodLocal() {
		return codLocal;
	}

	public void setCodLocal(int codLocal) {
		this.codLocal = codLocal;
	}

	public int getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(int nroTelefono) {
		this.nroTelefono = nroTelefono;
	}


	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	

	public Set<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(Set<Lote> lotes) {
		this.lotes = lotes;
	}

	@Override
	public String toString() {
		return "Local [idLocal=" + getIdLocal() + ", direccion=" + direccion + ", latitud=" + latitud + ", longitud="
				+ longitud + ", codLocal=" + codLocal + ", nroTelefono=" + nroTelefono + "]";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//1125441145

	
	
	
	
	

}
