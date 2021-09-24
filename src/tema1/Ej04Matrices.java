/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej04Matrices {

    public static void main(String[] args) {

        //1. definir la matriz de enteros de tamaño 10x10 e iniciarla con números aleatorios entre 0 y 200
        int[][] matriz = new int[10][10];
        GeneradorAleatorio.iniciar();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = GeneradorAleatorio.generarInt(200);
            }
        }
        //2. mostrar el contenido de la matriz en consola
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }

        //3. calcular e informar la suma de todos los elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3
        int sumas = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i >= 2)) {
                    sumas = sumas + matriz[i][j];
                }
                if ((j <= 3) && (i < 2)) {
                    sumas = sumas + matriz[i][j];
                }
            }

        }
        System.out.println(" la suma de todos los elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3 es " + sumas);
        //4. generar un vector de 10 posiciones donde cada posición i contiene la suma de la columna i de la matriz
        int[] vectorSuma = new int[10];
        for (int i = 0; i < 10; i++) {
            //vectorSuma[i] = 0;
            for (int j = 0; j < 10; j++) {
                vectorSuma[i] = vectorSuma[i] + matriz[j][i];
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("suma columna " + i + " " + vectorSuma[i]);
        }
        //5. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        System.out.println("ingrese un numero para buscar");
        int numABuscar = Lector.leerInt();
        boolean esta = false;
        int i = 0;
        int j = 0;
        while ((!esta) && (i < 10)) {
            j = 0;
            while ((!esta) && (j < 10)) {
                esta = matriz[i][j] == numABuscar;
                j++;
            }
            i++;
        }
        if (esta) {
            System.out.println("el elemento esta en la fila " + (i - 1) + " columna  " + (j - 1));

        } else {
            System.out.println("no se encontro el elemento");
        }
        //   y en caso contrario imprima "No se encontró el elemento".
    }
}
