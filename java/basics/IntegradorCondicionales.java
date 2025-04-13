/* Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 cattegorías:
1- Repositor. 2- Cajero. 3- Gerente.
Los sueldos de cada categoría son los siguientes:
-Los repositores cobran $15.890 + un bono del 10%
-Los cajeros cobran $25.630,89 fijos.
-Los gerentes cobran $35.560,20 en bruto al cual se le descuenta un 11% de jubilación.

Se necesita un programa que, dependiendo el tipo de empleado calcule y muestre en pantalla el sueldo a cobrar.
*/

import java.util.Scanner;

public class IntegradorCondicionales {
    public static void main(String[] args) {
        
        double sueldo = 0;
        int categoria;

        System.out.println("Ingrese la categoria del empleado (1- Repositor, 2- Cajero, 3- Gerente): ");
        Scanner sc = new Scanner(System.in);
        categoria = sc.nextInt();
        
        switch (categoria) {
            case 1: 
                sueldo = 15890 + (15890 * 0.10);
                System.out.println("El sueldo del repositor es: $" + sueldo);
                break;
            case 2:
                sueldo = 25630.89;
                System.out.println("El sueldo del cajero es: $" + sueldo);
                break;
            case 3:
                sueldo = 35560.20 - (35560.20 * 0.11);
                System.out.println("El sueldo del gerente es: $" + sueldo);
                break;
            default:
                System.out.println("Categoria no valida. Por favor ingrese 1, 2 o 3.");
                break;
        }

        sc.close();
    }
}
