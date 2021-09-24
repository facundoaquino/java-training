/*
 1- Escriba un programa que imprima en consola el factorial de un número N (ingresado por teclado, N > 0). Ejemplo: para N=5 debería imprimir 5! = 120
 */
package tema1;

import PaqueteLectura.Lector;

/**
 *
 * @author facun
 */
public class Practica_PrimeraParte_1 {

    public static void main(String[] args) {
        int num, fact;
        System.out.println("ingrese un numero entero para ver su factorial");
        num = Lector.leerInt();
        fact = 1;
        for (int i = num; i > 1; i--) {
            fact = i * fact;

        }

        System.out.println("el factorial de " + num + " es  " + fact);

    }

}
