import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {

        // Declaración e inicialización
        int vector[] = new int[5]; // vector de 5 elementos

        /*
         * Asignación de valores manual
         * vector[0] = 1;
         * vector[1] = 35;
         * vector[2] = 23;
         * vector[3] = 12;
         * vector[4] = 99;
         */

        // Asignación por teclado
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor del índice " + i + ":");
            vector[i] = sc.nextInt();
        }

        // Recorrido del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el índice " + i + " y el valor es " + vector[i]);
            System.out.println("------------------------------------------------------------");
        }

        sc.close(); 

    }
}
