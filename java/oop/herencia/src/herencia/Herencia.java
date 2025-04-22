package herencia;

public class Herencia {

	public static void main(String[] args) {

		Empleado empleado = new Empleado(15, "35658985", "Juan", "Perez", "Calle 234", "2876456634", 456, "Asistente",
				(double) 2300000);
		Empleado empleado2 = new Empleado(17, "35658775", "Ana", "Sosa", "Calle 897", "28764444434", 899, "Secretaria",
				(double) 2400000);
		
		
		System.out.println("Datos de " + empleado.getNombre());
		System.out.println(empleado.getNombre());
		System.out.println(empleado.getApellido());
		System.out.println(empleado.getNumLegajo());
		System.out.println(empleado.getCargo());
		System.out.println(empleado.getTelefono());
		System.out.println(empleado.getId());

		System.out.println("Datos de " + empleado2.getNombre());
		System.out.println(empleado2.getNombre());
		System.out.println(empleado2.getApellido());
		System.out.println(empleado2.getNumLegajo());
		System.out.println(empleado2.getCargo());
		System.out.println(empleado2.getTelefono());
		System.out.println(empleado2.getId());


		// Aplicando polimorfismo
		// En un vector que pertenezca a la clase padre yo puedo guardar diferentes
		// tipos que pertenezcan a las clases hijas.
		Persona vector[] = new Persona[5];
		vector[0] = new Persona();
		vector[1] = new Empleado();
		vector[2] = new Consultor();
		vector[3] = new Jefe();
		// vector[4] = "Hola"; NO se peude

		// Persona persona = new Persona ();
		// Consultor consultor = new Consultor();

		// persona = consultor; como consultor es hio de persona puedo hacer esta
		// asignación

	}
}
