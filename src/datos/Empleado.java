package datos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Empleado extends Persona {
	private long idEmpleado;
	private String franjaHoraria;
	private  double sueldoBasico;

	public Empleado() {
		super();
	}


	public Empleado(String nombre, String apellido, int dni, LocalDate fechaDeNacimiento, String franjaHoraria,
			double sueldoBasico) {
		super(nombre, apellido, dni, fechaDeNacimiento);
		this.franjaHoraria = franjaHoraria;
		this.sueldoBasico = sueldoBasico;
	}



	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getFranjaHoraria() {
		return franjaHoraria;
	}

	public void setFranjaHoraria(String franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}




	@Override
	public String toString() {
		return "Empleado [IdPersona=" + getIdPersona() + ", Nombre=" + getNombre() + ", Apellido="
				+ getApellido() + ", Dni=" + getDni() + ", FechaDeNacimiento=" + getFechaDeNacimiento() + 
				", franjaHoraria=" + franjaHoraria + ", sueldoBasico=" + sueldoBasico + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
