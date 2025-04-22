package logic;

public class OOP {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno(5, "Sergio", "Campero");
		Alumno alumno2 = new Alumno ();
		
		System.out.println("El id del alumno 1 es: " + alumno1.getId());
		System.out.println("El nombre es: " + alumno1.getNombre());
		System.out.println("El apellido es: " + alumno1.getApellido());
		
		alumno2.setId(7);
		alumno2.setNombre("Ana");
		alumno2.setApellido("Vargas");
		
		System.out.println("------------------------------------");
		System.out.println("El id del alumno 2 es: " + alumno2.getId() );
		System.out.println("El nombre es: " + alumno2.getNombre());
		System.out.println("El apellido es: " + alumno2.getApellido());
		
		System.out.println("------------------------------------");
		alumno1.setId(35);
		System.out.println("El nuevo id del alumno 1 es: " + alumno1.getId());
	}
}
