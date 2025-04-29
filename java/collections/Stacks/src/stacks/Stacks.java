package stacks;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		//Los stack cumplen con el modelo LIFO, Last In, Last Out
		Stack<Integer> listStack = new Stack<Integer>();
		
		System.out.println("Mi stack vacía: " + listStack);
		System.out.println("Está vacía? " + listStack.isEmpty());
		
		//Agregar NO se usa add como en ArrayList o LinkedList, se usa push
		listStack.push(1);
		listStack.push(2);
		listStack.push(3);
		listStack.push(4);
		listStack.push(5);
		
		//Recorrido
		for (Integer stack : listStack) {
			System.out.println(stack);
		}
		
		//Mostrar
		System.out.println("Stack: " + listStack);
		System.out.println("Stack vacía? " + listStack.isEmpty());
		
		//Eliminar el último registro
		System.out.println("Eliminando el último registro que ingresó.");
		listStack.pop();
		
		//Buscar un elemento 
		System.out.println("Está el 3? " + listStack.search(3));
		
		//Conocer el último agregado
		System.out.println("último agregado: " + listStack.peek());
	}

}
