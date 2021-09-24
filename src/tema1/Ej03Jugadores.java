package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej03Jugadores {

    public static void main(String[] args) {
        double alturaPromedio = 0;
        int CANT_JUGADORES = 3;
        int jugadoresPromedio = 0;
        //Paso 2: Declarar la variable vector de double
        double[] alturas;

        //Paso 3: Crear el vector para 15 double
        alturas = new double[CANT_JUGADORES];
        //Paso 4: Declarar indice

        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (int i = 0; i < CANT_JUGADORES; i++) {
            System.out.println("ingrese altura para el jugador numero " + (i + 1) + ":");
            alturas[i] = Lector.leerDouble();
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        for (int i = 0; i < CANT_JUGADORES; i++) {
            alturaPromedio = alturaPromedio + alturas[i];
        }
        alturaPromedio = alturaPromedio / CANT_JUGADORES;
        System.out.println("la altura promedio es de : " + alturaPromedio);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for (int i = 0; i < CANT_JUGADORES; i++) {
            if (alturas[i] > alturaPromedio) {
                jugadoresPromedio++;
            }
        }
        //Paso 9: Informar la cantidad.
        System.out.println(jugadoresPromedio + " jugadores superan la altura promedio");
    }

}
