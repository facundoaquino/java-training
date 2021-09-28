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
public class Practica_2_primeraParte_2 {

    public static void main(String[] args) {
        Balanza balanza = new Balanza();
        balanza.iniciarCompra();
        double pesoItem;
        double precioPorKilo;

        System.out.println("ingrese el peso de el o los items");
        pesoItem = Lector.leerDouble();
        System.out.println("ingrese el precio por kilo del item");
        precioPorKilo = Lector.leerDouble();
        while (pesoItem != 0) {
            balanza.registrarProducto(pesoItem, precioPorKilo);
            System.out.println("ingrese el peso de el o los items");
            pesoItem = Lector.leerDouble();
            if (pesoItem != 0) {
                System.out.println("ingrese el precio por kilo del item");
                precioPorKilo = Lector.leerDouble();
            }
        }

        System.out.println(balanza.devolverResumenDeCompra());

    }
}
