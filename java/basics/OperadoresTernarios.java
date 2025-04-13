import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {
        
        double promedio;
        String condicionFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el promedio del estudiante: ");
        promedio = sc.nextDouble();

        // Operador ternario
        condicionFinal = (promedio >=7) ? "Aprobado" : "Reprobado";

        System.out.println("El estudiante está: " + condicionFinal);

        sc.close();
    }
}
