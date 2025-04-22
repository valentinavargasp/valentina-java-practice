package logic;

public class Alumno {
	
	int id;
	String nombre;
	String apellido;
	
	public Alumno() {
	}

	public Alumno(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//get : traer set: setear/colocar/establecer
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//Métodos

	public void mostarNombre() {
		System.out.println("Hola! soy un alumno");
	}
	
	public void saberAprobado(double nota) {
		if (nota >= 6) {
			System.out.println("Aprobé la materia :D ");
		} else {
			System.out.println("Uy, no aprobé! :( ");
		}
	}
	

	
}
