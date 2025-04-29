package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {

		List<Persona> lista = new LinkedList<Persona>();

		// agregar personas al final de la lista
		lista.add(new Persona(1, "Ana", 29));
		lista.add(new Persona(2, "Pedro", 28));
		lista.add(new Persona(3, "Juan", 79));
		lista.add(new Persona(4, "Luis", 84));

		// Agregar personas al principio de la lista
		lista.add(0, new Persona(5, "Lucía", 8)); // agregamos parámetro 0

		System.out.println("----------FOREACH-------------");
		// Recorremos con foreach
		for (Persona persona : lista) {
			System.out.println("Prueba: " + persona.getNombre());
		}

		// Remove en LinkedList
		String nameDelete = "Pedro";
		for (Persona persona : lista) {
			if (persona.getNombre().equals(nameDelete)) {
				lista.remove(persona);
				break; // para salir del bluque, porque cuando usamos un remove la lista se vuelve a
						// reacomodar.
			}
		}

		System.out.println("Luego de eliminar: ");
		// Recorremos con foreach
		for (Persona persona : lista) {
			System.out.println("Prueba: " + persona.getNombre());
		}

		// Para conocer el tamaño de la lista
		System.out.println("La cantidad de elementos es: " + lista.size());

		// Obtener primer y último objeto:
		System.out.println("Primer objeto: " + lista.getFirst().toString());
		System.out.println("Último objeto: " + lista.getLast().toString()); // nos trae un objeto, para ver el elemento
																			// completo usamos toString

		// Borrar toda la lista
		lista.clear();

		// Comprobar si está vacía.
		System.out.println("La lista está vacía?");
		System.out.println(lista.isEmpty());

	}

}
