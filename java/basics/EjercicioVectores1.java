/* Llevar a cabo un programa que incluya un vector que almacene los nombres: 
Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
Realizar un recorrido del vector para mostrar los mismos por pantalla.
*/

public class EjercicioVectores1 {
    public static void main(String[] args) {
        
        String vector [] = new String[8];

        // Cargar el vector con los nombres
        vector [0] = "Alejandra";
        vector [1] = "Leonardo";
        vector [2] = "Rosa";
        vector [3] = "Guillermo";
        vector [4] = "Gabriel";
        vector [5] = "Daniel";
        vector [6] = "Luisa";
        vector [7] = "Ludmila";

        // Mostrar los nombres por pantalla
        System.out.println("Lista de nombres: ");
        for ( int i = 0; i < vector.length; i++) {
            System.out.println("El nombre es: " + vector[i]);
        }
    }
}
