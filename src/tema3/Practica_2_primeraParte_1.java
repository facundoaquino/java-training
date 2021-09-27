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
public class Practica_2_primeraParte_1 {
    //el area me da 0.0 o nan ?? ver calcularArea en clase Triangulo

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        System.out.println("ingrese lado uno");
        triangulo.setLadoUno(Lector.leerDouble());
        System.out.println("ingrese lado dos");
        triangulo.setLadoDos(Lector.leerDouble());
        System.out.println("ingrese lado Tres");
        triangulo.setLadoTres(Lector.leerDouble());
        System.out.println("el area del triangulo es  " + triangulo.calcularArea());
        System.out.println("el perimetro del triangulo es  de " + triangulo.calcularPerimetro());

    }

}
