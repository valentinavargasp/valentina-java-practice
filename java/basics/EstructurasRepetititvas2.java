/*  Desarrollar un programa que permita cargar n números enteros y luego nos 
informe cuántos valores fueron pares y cuántos impares. 
Emplear el operador % en la condición de la estructura condicional: 
if (valor%2==0) Si el if da verdadero luego es par.  */

import java.util.Scanner;

public class EstructurasRepetititvas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a cargar: ");
        int n = sc.nextInt();

        int i = 0; // Contador
        int pares = 0;
        int impares = 0;

        while (i < n) {
            System.out.println("Ingrese un número: ");
            int valor = sc.nextInt();

            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            i++;
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        sc.close();
    }

}
