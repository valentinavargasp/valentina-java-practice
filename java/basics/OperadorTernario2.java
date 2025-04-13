//**Determina si una persona es mayor de edad** con un operador ternario.

import java.util.Scanner;

public class OperadorTernario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introuduce tu edad: ");
        int edad = sc.nextInt();

        String resultado = (edad >= 18) ? "Sos mayor de edad." : "Sos menor de edad.";
        System.out.println(resultado);

        sc.close();
    
    }
}
