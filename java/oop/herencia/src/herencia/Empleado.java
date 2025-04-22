package herencia;

public class Empleado extends Persona {
	
	private int numLegajo;
	private String cargo;
	private Double sueldo;
	
	public Empleado() {
	}


	public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
			int numLegajo, String cargo, Double sueldo) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.numLegajo = numLegajo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

//getters & Setters

	public int getNumLegajo() {
		return numLegajo;
	}


	public void setNumLegajo(int numLegajo) {
		this.numLegajo = numLegajo;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Double getSueldo() {
		return sueldo;
	}


	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	

	
}
