/*En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria
 * Cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa que permita
 * a un profesor cargar, en las 3 posiciones (columnas) de cada fila las notas del alumno
 * y que la última columna se calculen los promedios.
 * Una vez realizados los cálculos, se deben mostrar las 3 notas de cada alumno y su promedio.
 */

import java.util.Scanner;

public class EjercicioMatrices {
    public static void main(String[] args) {

        Double matriz[][] = new Double[4][4];
        Scanner sc = new Scanner(System.in);
        Double suma = 0.0;

        // For para cargar las notas de los alumnos
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese las notas del alumno n° " + (f+1));
                matriz[f][c] = sc.nextDouble();
                suma += matriz[f][c]; // suma de las notas (+= es igual a suma = suma + matriz[f][c])
            }
            matriz[f][3] = suma / 3; // Promedio de las notas, antes de pasar al siguiente alumno
            suma = 0.0; // Reiniciamos la suma para el siguiente alumno
        }

        // For para recorrer
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno n° " + (f+1) + " son: " );
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota N° " + (c+1) + " " + matriz[f][c]);
            }
            System.out.println("El promedio del alumno es : " + matriz[f][3]);
        }

        sc.close();
    }
}
