package herencia;

public class Jefe extends Persona{
	
	private int idJefe;
	private String dptoJefe;
	
	public Jefe() {
	}

	public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int idJefe,
			String dptoJefe) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.idJefe = idJefe;
		this.dptoJefe = dptoJefe;
	}
	
	//Getters & Setters
	public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	public String getDptoJefe() {
		return dptoJefe;
	}

	public void setDptoJefe(String dptoJefe) {
		this.dptoJefe = dptoJefe;
	}
	
}
