package datos;

import java.time.LocalDate;

public class Cliente extends Persona{
	private long idCliente;
	private String email;
	
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, int dni, LocalDate fechaDeNacimiento, String email) {
		super(nombre, apellido, dni, fechaDeNacimiento);
		//this.idCliente = idCliente;
		this.email = email;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [IdPersona=" + getIdPersona()+"  , Nombre=" + getNombre()
				+ ", Apellido=" + getApellido() + ", Dni=" + getDni() + ", FechaDeNacimiento="
				+ getFechaDeNacimiento() +" email=" + email +  "]";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
