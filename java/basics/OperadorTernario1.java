//**Verifica si un número es par o impar** usando un operador ternario.

import java.util.Scanner;

public class OperadorTernario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Operador ternario para verificar si el número es par o impar
        String resultado = (numero % 2 == 0) ? "El número es par." : "El número es impar.";
        System.out.println(resultado);

        sc.close();

    }
}
