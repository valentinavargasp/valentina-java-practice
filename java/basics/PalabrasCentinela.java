/*Realizar un programa que muestre en pantalla palabras que sean ingresadas 
 * por teclado hasta que se ingrese la palabra "salir".
 */

import java.util.Scanner;

public class PalabrasCentinela {
    public static void main(String[] args) {
        
        System.out.println("Ingrese una palabra (escriba 'salir' para terminar): ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();

        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es: " + palabra);
            System.out.println("Ingrese otra palabra (escriba 'salir' para terminar): ");
            palabra = sc.next();
        }

    sc.close();
    }
}

