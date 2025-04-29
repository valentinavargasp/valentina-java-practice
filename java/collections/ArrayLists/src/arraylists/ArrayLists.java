package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(1, "Ana", 29));
		lista.add(new Persona(2, "Pedro", 28));
		lista.add(new Persona(3, "Juan", 79));
		lista.add(new Persona(4, "Luis", 84));

		// recorrer por índice, for clásico.

		System.out.println("----------FOR-------------");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Prueba: " + lista.get(i).getNombre());
		}

		System.out.println("----------FOREACH-------------");
		// Puedo recorrer elemento por elemento con el foreach
		for (Persona persona : lista) {
			System.out.println("Prueba: " + persona.getNombre());
		}

		// Remove en ArrayList
		lista.remove(1);

		System.out.println("Luego de eliminar: ");
		for (Persona persona : lista) {
			System.out.println("Prueba: " + persona.getNombre());
		}

		// Para conocer el tamaño de la lista
		System.out.println("La cantidad de elementos es: " + lista.size());

		// Borrar toda la lista
		lista.clear();

		// Comprobar si está vacía.
		System.out.println("La lista está vacía?");
		System.out.println(lista.isEmpty());

	}

}
