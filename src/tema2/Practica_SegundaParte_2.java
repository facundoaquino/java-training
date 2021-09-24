/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author facun
 */
public class Practica_SegundaParte_2 {
    // a que se refiere con - Muestre la representación de la persona con menor DNI. ? hago una persona aux? lo hice pero si no la inicializo da error

    public static void main(String[] args) {
        String nombre;
        int dni, edad;
        int mayores = 0;
        int menorDni = 999999;
        Persona personaMenorDni = new Persona();

        Persona[] personas = new Persona[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese nombre");
            nombre = Lector.leerString();
            System.out.println("ingrese dni");
            dni = Lector.leerInt();
            System.out.println("ingrese edad");
            edad = Lector.leerInt();
            personas[i] = new Persona(nombre, dni, edad);
        }
        for (int i = 0; i < 5; i++) {
            if (personas[i].getEdad() > 65) {
                mayores++;
            }
            if (personas[i].getDNI() < menorDni) {
                menorDni = personas[i].getDNI();
                personaMenorDni = personas[i];
            }
        }
        System.out.println("cantidad de personas mayores de 65 " + mayores);
        System.out.println(personaMenorDni.toString());

    }

}
