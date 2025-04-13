//**Asigna una nota** en función de la calificación: A (>=90), B (>=80), C (>=70), D (>=60), F (<60).

import java.util.Scanner;

public class Condicionales6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la calificación: ");
        int calificacion = scanner.nextInt();
        
        if (calificacion >= 90) {
            System.out.println("Su nota es A");
        } else if (calificacion >= 80) {
            System.out.println("Su nota es B");
        } else if (calificacion >= 70) {
            System.out.println("Su nota es C");
        } else if (calificacion >= 60) {
            System.out.println("Su nota es D");
        } else {
            System.out.println("Su nota es F");
        }
        scanner.close();

    }
}
