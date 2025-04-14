import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //Declaración 
        int matriz [][] = new int [3][3]; // matriz de 3 filas y 4 columnas. 

        /*/Asignación manual
        matriz[0][0] = 1;
        matriz[0][1] = 15;
        matriz[0][2] = 12;
        matriz[1][0] = 35;
        matriz[1][1] = 99;
        matriz[1][2] = 45;
        matriz[2][0] = 5;
        matriz[2][1] = 8;
        matriz[2][2] = 23;*/

        Scanner sc = new Scanner(System.in);

        //Asignación teclado
        for (int f = 0; f < 3; f++) {
            for ( int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la posición f: " + f + " c: "  + c );
                matriz[f][c] = sc.nextInt(); //Se asigna el valor ingresado por teclado a la posición de la matriz.
        }
    }

        //Recorrido de la matriz
        /*Se ejecuta el for externo, luego 3 veces el for interno, 
        luego el for externo vuelve a ejecutarse y así sucesivamente.*/

        for (int f = 0; f < 3; f++) {
            for ( int c = 0; c < 3; c++) {
                System.out.println("El valor de la posición f: " + f + " c: "  + c + " es de: " + matriz[f][c]);
                System.out.println("------------------------------------------------------------");
            }
        }

        sc.close(); 
    }
}
