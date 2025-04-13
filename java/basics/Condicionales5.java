//**Determina la categoría de una persona según su edad: bebé (<2), niño (2-12), adolescente (13-18), adulto (19-64), anciano (65+).

import java.util.Scanner;

public class Condicionales5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la edad de la persona: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida");
        } else if (edad < 2) {
            System.out.println("Bebé");
        } else if (edad <= 12) {
            System.out.println("Niño");
        } else if (edad <= 18) {
            System.out.println("Adolescente");
        } else if (edad <= 64) {
            System.out.println("Adulto");
        } else {
            System.out.println("Anciano");
        }
        scanner.close();
    }
}
