package datos;

public class Local {
	private long idLocal;
	private String direccion;
	private double latitud;
	private double longitud;
	private int codLocal;
	private int nroTelefono;
	private Persona persona;
	
	public Local() {
		super();
	}

	public Local(String direccion, double latitud, double longitud, int codLocal, int nroTelefono,Persona persona) {
		super();
		this.direccion = direccion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.codLocal = codLocal;
		this.nroTelefono = nroTelefono;
		this.persona = persona;
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

/*	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}*/
	
	

	@Override
	public String toString() {
		return "Local [idLocal=" + idLocal + ", direccion=" + direccion + ", latitud=" + latitud + ", longitud="
				+ longitud + ", codLocal=" + codLocal + ", nroTelefono=" + nroTelefono + "]";
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	
	
	

}
