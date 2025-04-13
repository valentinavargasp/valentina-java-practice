/*Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre 
posteriormente la suma de los valores ingresados y su promedio.  */

import java.util.Scanner;

public class EstructuraFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, valor, promedio;

        for ( int i = 1; i <= 10; i++) {
            System.out.println("Ingrese valor: ");
            valor = sc.nextInt();
            suma += valor; // suma = suma + valor;
        }

        promedio = suma / 10;
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio de los valores es: " + promedio);
        sc.close();
    }
}
