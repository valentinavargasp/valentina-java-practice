//Intercambio de valores entre variables.

public class Variables {
    public static void main(String[] args) {

        int num1 = 40;
        int num2 = 20;
        int aux;

        System.out.println("Antes del intercambio: num1 = " + num1 + ", num2 = " + num2);

        aux = num2; // Guardamos el valor de num2 en aux
        num2 = num1; // Asignamos el valor de num1 a num2
        num1 = aux; // Asignamos el valor de aux (originalmente num2) a num1

        System.out.println("Después del intercambio: num1 = " + num1 + ", num2 = " + num2);
    }
}