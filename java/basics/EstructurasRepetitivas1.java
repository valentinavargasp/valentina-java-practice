//Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.  

public class EstructurasRepetitivas1 {
    public static void main(String[] args) {
        int i = 8; 
        while (i <= 500) {
            System.out.println(i + " -");
            i += 8; //Incremento i de a 8
        }
    }
}
