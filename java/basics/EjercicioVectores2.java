/* En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades.
En el primer vector se guardan los nombres de las ciudades, 
en el segundo las temperaturas mínimas y en el tercero las temperaturas máximas.
Se necesita un progreama que permita la carga de las ciudades, y las temperaturas;
además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja 
y cuál con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados). 
*/

import java.util.Scanner;

public class EjercicioVectores2 {
    public static void main(String[] args) {

        // Definición de los vectores
        String ciudades[] = new String[5];
        Double tempMin[] = new Double[5];
        Double tempMax[] = new Double[5];

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        // Carga de los vectores
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad " + (i + 1) + " : ");
            ciudades[i] = sc.nextLine();
            System.out.println("Ingrese la temperatura mínima de la ciudad " + (i + 1) + " : ");
            tempMin[i] = sc2.nextDouble();
            System.out.println("Ingrese la temperatura máxima de la ciudad " + (i + 1) + " : ");
            tempMax[i] = sc2.nextDouble();
        }

        // Variable auxiliar mínima
        Double minima = 9999999.00;
        // Variable auxiliar posición mínima
        int posMin = 0;

        // Determinamos la ciudad con la temperatura mínima
        for (int i = 0; i < ciudades.length; i++) {
            if (tempMin[i] < minima) {
                minima = tempMin[i];
                posMin = i;
            }
        }

        // Variable auxiliar máxima
        Double maxima = -9999999.00;
        // Variable auxiliar posición máxima
        int posMax = 0;

        // Determinamos la ciudad con la temperatura máxima
        for (int i = 0; i < ciudades.length; i++) {
            if (tempMax[i] > maxima) {
                maxima = tempMax[i];
                posMax = i;
            }
        }

        System.out.println("Ciudad con temperatura mínima: " + ciudades[posMin] + " con " + minima + " grados.");
        System.out.println("Ciudad con temperatura máxima: " + ciudades[posMax] + " con " + maxima + " grados.");

        // Cierre de los scanners
        sc.close();
        sc2.close();
    }
}
