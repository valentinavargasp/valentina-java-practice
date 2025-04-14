/* Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente,
uno por la mañana, otro al mediodía y otro por la noche. 
Para administrar estos datos utiliza una matriz, donde cada fila es un destino 
y en cada columna se guarda la cantidad de asientos disponibles.
1- Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.
2- Al mismo tiempo, el programa debe permitir al usuario ingresar el número de destino al que quiere dirigirse,
el número de vuelo (mañana, mediodía o noche) y la cantidad de pasajes que necesita. 
3- A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad de asientos disponibles
para la cantidad de pasajes solicitados. En caso de que así sea, se debe mostrar un cartel por pantalla que diga
"su reserva fue realizada con éxito" y se debe descontar del total de asientos los solicitados por el usuario.
En caso de que no haya asientos disponibles, se debe mostrar un cartel que diga "no hay asientos disponibles".

Desde la compañía de vuelos manifiestan que no conocen cuantas ventas/reservas se hacen por día, 
por lo cual, para finalizar las ventas se ingresa la palabra "finish".
*/

import java.util.Scanner;

public class EjercicioMatrices2 {
    public static void main(String[] args) {

        // Matriz de 6x3 > (6 destinos, 3 vuelos por día)
        int vuelos[][] = new int[6][3];

        Scanner sc = new Scanner(System.in);

        // Cargamos la matriz
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " horario: " + c);
                vuelos[f][c] = sc.nextInt();
            }
        }

        // Venta de asientos
        Scanner sc2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println(
                    "Ingrese el destino al que quiere dirigirse (0-Roma, 1-Pisa, 2-Milan, 3- Torino, 4-Madrid, 5-Buenos Aires): ");
            destino = sc.nextInt();
            System.out.println("Ingrese el horario (0: mañana, 1: mediodía, 2: noche): ");
            horario = sc.nextInt();
            System.out.println("Ingrese la cantidad de asientos que necesita: ");
            asientos = sc.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue reralizada con éxito.");
                        vuelos[destino][horario] -= asientos; // Descontamos los asientos solicitados. Es igual a
                                                              // vuelos[destino][horario] = vuelos[destino][horario]
                                                              // -asientos;
                    } else {
                        System.out.println("No hay asientos disponibles.");
                    }
                } else {
                    System.out.println("El horario ingresado no es correcto. Debe ser 0, 1 o 2.");
                }
            } else {
                System.out.println("El destino ingresado no es correcto. Debe ser entre 0 y 5.");
            }

            System.out.println(
                    "Desea continuar reservando? Ingrese 'finish' para salir o cualquier otra tecla para continuar.");
            bandera = sc2.next(); // Leemos la opción de continuar o salir
        }

        sc.close();
        sc2.close();
    }
}
