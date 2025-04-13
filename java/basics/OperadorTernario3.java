//**Calcula el mayor de dos números** usando un operador ternario.

public class OperadorTernario3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int mayor = (a>b) ? a : b; // Se asigna el mayor de los dos números a la variable mayor
        System.out.println("El mayor de los números " + a + " y " + b + " es: " + mayor);
        
        //Notas
        /*Se puede usar el operador ternario para asignar un valor a una variable dependiendo de una condición. 
        En este caso, se asigna el valor de a si a es mayor que b, o el valor de b en caso contrario*/ 

    }
}
