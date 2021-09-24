/*
 * 2- Escriba un programa que imprima en consola el factorial de todos los números entre 1 y 9.
¿Qué modificación debe hacer para imprimir el factorial de los números impares solamente?
 */
package tema1;

/**
 *
 * @author facun
 */
public class Practica_PrimeraParte_2 {

    public static void main(String[] args) {
        int fact = 1;
        System.out.println("***** factoriales del 1 al 9 ***** ");
        for (int i = 1; i <= 9; i++) {
            fact = fact * i;
            if (i % 2 != 0) {
                System.out.println("el factorial de " + i + " es  " + fact);
            }
        }
    }
}
