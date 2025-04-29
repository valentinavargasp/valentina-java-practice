package practicehashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		
		//Lista de empleados, ID y Nombre
		
		Map<Integer, String> mapEmpleados = new HashMap<>();
		
		//Método put para agregar nuevos valores con clave valor.
		mapEmpleados.put(1523, "Juan Perez");
		mapEmpleados.put(1524, "Luis Gonzalez");
		mapEmpleados.put(1525, "Jose Torres");
		mapEmpleados.put(1526, "Shakira");
		mapEmpleados.put(1527, "Madonna");
		
		boolean isOrNot = mapEmpleados.containsValue("Luis Gonzalez");
		
		if (isOrNot == true) {
			System.out.println("El empleado está");
		} else {
			System.out.println("El empleado no está");
		}
		
		System.out.println(mapEmpleados.values());
		System.out.println(mapEmpleados.keySet());
		
		String nombre = mapEmpleados.get(1525);
		System.out.println("El empleado buscado es: " + nombre);
		
		//Eliminar empleado
		mapEmpleados.remove(1526);
		System.out.println(mapEmpleados.values());
		
	}

}
