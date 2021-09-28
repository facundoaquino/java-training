/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author facun
 */
public class Practica_2_primeraParte_3 {

    public static void main(String[] args) {

        Entrenador entrenador = new Entrenador();

        entrenador.setNombre("pepe");
        System.out.println(entrenador.getNombre());

        entrenador.setSueldoBasico(100000);
        entrenador.setCampeonatosGanados(10);

        System.out.println("sueldo total del entrenador: " + entrenador.calcularSueldoACobrar());
    }

}
