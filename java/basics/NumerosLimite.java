import java.util.Scanner;

public class NumerosLimite {
    public static void main(String[] args) {

        System.out.println("Ingrese el límite hastta donde quiere contar: ");
        Scanner sc = new Scanner(System.in);
        int limite = sc.nextInt();
        int i = 1;

        while ( i <= limite) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }

}
