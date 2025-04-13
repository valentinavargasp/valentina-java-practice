//**Determina si una persona puede votar** (mayor de 18 años) o no.

import java.util.Scanner;

public class Condicionales2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }
        scanner.close();
    }
}
