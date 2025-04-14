//Llevar a cabo un programa que permite cargar completamente con números 5 una matriz de 4x5.

public class EjercicioMatrices1 {
    public static void main(String[] args) {

        //Definimos la matriz
        int matriz[][] = new int [4][5];

        /*Recorremos la matriz para cargarla con el número 5.
         * Usamos dos bucles for anidados, uno para las filas y otro para las columnas.
         * En cada iteración del bucle interno, asignamos el valor 5 a la posición actual de la matriz.
         */

        for (int f = 0; f < 4; f++) {
            for ( int c = 0; c < 5; c++) {
                matriz[f][c] = 5;
            }
        }

        //Imprimimos la matriz para verificar que se ha cargado correctamente
        
        for (int f = 0; f < 4; f++) {
            for ( int c = 0; c < 5; c++) {
                System.out.println(matriz[f][c]);
            }
        }
    }
}
