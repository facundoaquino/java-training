/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.Lector;

/**
 *
 * @author facun
 */
public class Practica_2_primeraParte_4 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setColorLinea("rojo");
        circulo.setColorRelleno("amarillo");
        System.out.println("ingrese el radio del circulo para calcular area y perimetro ");
        circulo.setRadio(Lector.leerDouble());
        System.out.println("ingrese el color de la linea");
        circulo.setColorLinea(Lector.leerString());
        System.out.println("ingrese el radio del circulo para calcular area y perimetro ");
        circulo.setColorRelleno(Lector.leerString());

        System.out.println("el area del circulo es de : " + circulo.calcularArea());
    }

}
