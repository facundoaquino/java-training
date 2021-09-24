/*
 *1 – Se dispone de una clase Persona (ya implementada en la carpeta tema2). Un objeto persona puede crearse sin valores iniciales o enviando en el mensaje de creación
el nombre, DNI y edad (en ese orden). Un objeto persona responde a los siguientes mensajes:

Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego muestre en consola la representación de ese objeto en formato String.
Piense y responda: ¿Qué datos conforman el estado del objeto persona? ¿Cómo se implementan dichos datos? ¿Qué ocurre cuando se le envía un mensaje al objeto?
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author facun
 */
public class Practica_SegundaParte_1 {

    public static void main(String[] args) {
        String nombre;
        int dni, edad;
        System.out.println("ingrese nombre");
        nombre = Lector.leerString();
        System.out.println("ingrese dni");
        dni = Lector.leerInt();
        System.out.println("ingrese edad");
        edad = Lector.leerInt();
        Persona persona = new Persona(nombre, dni, edad);
        System.out.println(persona.toString());
    }
}
