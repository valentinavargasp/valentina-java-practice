//Se ingresan un conjunto de n alturas de personas por teclado, ingresar n por teclado. Mostrar la altura promedio de las persona

import java.util.Scanner;

public class EstructurasRepetitivas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas:");
        int n = sc.nextInt();

        double sumaAlturas = 0;
        int contador = 0;

        while (contador < n) {
            System.out.println("Ingrese la altura de la persona:");
            double altura = sc.nextDouble();
            sumaAlturas += altura; 
            contador++;
        }

        double promedioAlturas = sumaAlturas / n;
        System.out.println("La altura promedio de las personas es: " + promedioAlturas);

        sc.close();
    }
}
