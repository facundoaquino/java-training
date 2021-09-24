/*
 *4- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide nombre, DNI y edad y se la debe asignar en un día y turno de la
siguiente manera: las personas primero completan el primer día en turnos sucesivos, luego el segundo día y así siguiendo.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona y pensar en la estructura de datos a utilizar.
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author facun
 */
public class Practica_SegundaParte_4 {
    //como hago para evitar que se imprima null y de error en tal caso (solucionado pero como se haria)
    // porque me pide que este inicializado turno cuando lo esta dentro del while ?????

    public static void main(String[] args) {
        Persona[][] castings = new Persona[5][8];
        int dia, turno, dni, edad;
        String nombre;

        System.out.println("Ingrese nombre , con ZZZ se sale del programa");
        nombre = Lector.leerString();
        dia = 0;
        turno = 0;
        while (!nombre.equals("ZZZ") && (dia < 5)) {
            turno = 0;

            while (!nombre.equals("ZZZ") && (turno < 8)) {
                System.out.println("Ingrese Dni");
                dni = Lector.leerInt();
                System.out.println("Ingrese Edad");
                edad = Lector.leerInt();
                castings[dia][turno] = new Persona(nombre, dni, edad);
                System.out.println("Ingrese nombre , con ZZZ se sale del programa");
                nombre = Lector.leerString();
                turno++;
            }
            dia++;
        }

        for (int i = 0; i < dia; i++) {
            for (int j = 0; j < turno; j++) {
                System.out.println("el dia " + (i + 1) + " se entrevistara a " + castings[i][j].getNombre() + " en el turno : " + (j + 1));
            }

        }

    }

}
