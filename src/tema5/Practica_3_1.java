/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import PaqueteLectura.Lector;



/**
 *
 * @author facun
 */
public class Practica_3_1 {
    public static void main(String[] args) {
        System.out.println("ingrese color de relleno para");
         String cr = Lector.leerString();
        System.out.println("ingrese color de linea");
         String cl = Lector.leerString();
        System.out.println("ingrese lado 1");
        double ladoUno = Lector.leerDouble();
        System.out.println("ingrese lado 2");
        double ladoDos = Lector.leerDouble();
        System.out.println("ingrese lado 3");
        double ladoTres = Lector.leerDouble();
        Triangulo triangulo = new Triangulo(cr,cl,ladoUno,ladoDos,ladoTres);
        String description= triangulo.toString();
        System.out.println(description);
    }
}
