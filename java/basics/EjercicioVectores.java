/*Realizar un programa que permita cargar 15 números ern un vector. Una vez cargados, se necesita
 * que el programa cuente e informe por pantalla cuántas veces se cargó el número 3
 */

import java.util.Scanner;

public class EjercicioVectores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Declaramos el vector
        int vector[] = new int[15];
        // Declaramos la variable contador para contar cuantas veces se carga el número
        // 3

        // Cargamos el vector
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese un número: ");
            vector[i] = sc.nextInt();
        }
        // Contamos cuantas veces se carga el número 3
        int contador = 0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3) {
                contador++;
            }
        }
        // Mostramos el resultado por pantalla
        System.out.println("El número 3 se cargó " + contador + " veces.");

        sc.close();
    }
}
