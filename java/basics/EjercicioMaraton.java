/* En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el marco de la Fiesta Nacional del Inmigrante.
El evento cuenta con un día de inscripciones el día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos
que puede llegar a haber.

Desde la Federación de Colectividades (Organismo que organiza), 
manifestaron que se solicitan los siguientes datos para la inscripción de cada participante: dni, nombre y edad.

En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:

Menores A (de 6 a 10 años)
Menores B (de 11 a 17 años)
Juveniles (de 18 a 30 años)
Adultos (de 31 a 50 años)
Adultos mayores (mayores de 50 años)
Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, 
se muestre por pantalla a qué categoría debe ser inscripto.

Cabe destacar que, al finalizar el día, para dar fin a las inscripciones,
se debe ingresar un dni con el valor 0 y un nombre con la palabra “fin”.*/

import java.util.Scanner;

public class EjercicioMaraton {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        //Pedir datos al usuario 
//DNI
        System.out.println("Ingrese el DNI del participante");
        String dni = sc.nextLine();
//Nombre
        System.out.println("Ingrese el nombre del participante");
        String nombre = sc.nextLine();

//Edad
        System.out.println("Ingrese la edad del participante");
        int edad = sc2.nextInt();

        while ((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin"))) {
            //Determinar la categoría
            if (edad >= 6 && edad <= 10) {
                System.out.println("El participante pertenece a la categoría Menores A");
            } else if (edad >= 11 && edad <= 17) {
                System.out.println("El participante pertenece a la categoría Menores B");
            } else if ( edad >= 18 && edad <= 30) {
                System.out.println("El participante pertenece a la categoría Juveniles"); 
            } else if (edad >= 31 && edad <= 50) {
                System.out.println("El participante pertenece a la categoría Adultos");
            } else if (edad > 50) {
                System.out.println("El participante pertenece a la categoría Adultos mayores");
            } else {
                System.out.println("Edad no válida. Por favor, ingrese una edad válida.");
            }

            //Pedir datos al usuario nuevamente
            //DNI
            System.out.println("Ingrese el DNI del participante");
            dni = sc.nextLine();
            //Nombre
            System.out.println("Ingrese el nombre del participante");
            nombre = sc.nextLine();
            //Edad
            System.out.println("Ingrese la edad del participante");
            edad = sc2.nextInt();
        }

        sc.close();
        sc2.close();
    }
}
