package herencia;

public class Persona {
	
	private int id;
	private String dni;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String telefono;
	
	public Persona() {
	}

	public Persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}
	
//Getters y Setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//Otros métodos para persona 
	//(Sobrecarga de métodos)
	//Métodos con el mismo nombre pero que cada uno tiene diferentes parámetros.
	
	public void hablar () {
		System.out.println("La persona habla.");
	}
	
	public void hablar (String nacionalidad) {
		System.out.println("La persona que habla es " + nacionalidad);
	}
	
	public void hablar (String nacionalidad, String idioma) {
		System.out.println("La persona que es" + nacionalidad + " habla en " + idioma);
	}
	
	//Sobreescritura de métodos
	/* Si fuera una Clase abstracta
	
	public abstract void hablar ();
	
	Luego se utiliza en la clase hija con @Override
	*/
}
