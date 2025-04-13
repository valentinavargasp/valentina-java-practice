/**
 * The main method generates a Christmas tree pattern using asterisks ('*').
 * 
 * The height of the tree is determined by the variable `altura`. The tree is
 * constructed using nested loops:
 * 
 * - The outer loop iterates through each row of the tree, up to the specified
 * height.
 * - The first inner loop prints spaces to align the tree properly.
 * - The second inner loop prints the asterisks to form the tree structure.
 * 
 * After constructing each row, a newline is printed to move to the next row.
 * 
 * Example output for `altura = 4`:
       *
 *    ***
 *   *****
 *  *******
 * 
 * The height of the tree can be adjusted by changing the value of the `altura`
 * variable.
 */
public class ChristmasTree {

    public static void main(String[] args) {

        /* Qué altura va a tener el arbol? */
        int altura = 10;

        // Bucle para la altura del arbol
        for (int fila = 0; fila < altura; fila++) {

            // Bucle para los espacios vacíos
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {

                System.out.print(" ");
            }

            // Bucle para los asteríscos
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.print("*");
            }

            // Salto de línea
            System.out.println();
        }

        // Bucle para el tronco del árbol
        int largoTronco = 3;
        for (int base = 0; base < largoTronco; base++) {

            // Espacio
            for (int espacio = 0; espacio < (altura - 2); espacio++) {
                System.out.print(" ");
            }
            // Tronco
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }
            System.out.println();
        }

    }
}
