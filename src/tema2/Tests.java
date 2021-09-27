/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author facun
 */
public class Tests {

    public static void main(String[] args) {

        Celular c1 = new Celular();

        c1.setMarca("Samsung");

        c1.setModelo("Galaxy A01");

        c1.setPrecio(15500);

        Celular c2 = new Celular();

        c2.setMarca("Samsung");

        c2.setModelo("Galaxy A32");

        c2.setPrecio(45000);

        if (c1.getModelo().equals(c2.getModelo())) {

            c1.setPrecio(c2.getPrecio());

            c2.setPrecio(40000);

        }

        System.out.println(c2.toString());

        System.out.println(c1.toString());

    }

}
