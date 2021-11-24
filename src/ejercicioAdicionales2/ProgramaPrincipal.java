/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioAdicionales2;

/**
 *
 * @author facun
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {

        Estanteria estanteria = new Estanteria(5, 3);
        Autor autor = new Autor("pepe", " un buen tipo");
        Libro libro1 = new Libro("harry potter 1 ", 15, 12, autor);
        Libro libro2 = new Libro("harry potter 1 ", 15, 12, autor);
        Libro libro3 = new Libro("harry potter 8 ", 150, 12, autor);
        Libro libro4 = new Libro("2001 Odisea del Espacio", 15, 12, autor);
        Libro libro5 = new Libro("harry potter 1 ", 15, 12, autor);

        estanteria.almacenarLibro(libro1, 0, 0);
        estanteria.almacenarLibro(libro2, 0, 1);
        estanteria.almacenarLibro(libro3, 1, 2);
        estanteria.almacenarLibro(libro3, 1, 2);
        estanteria.almacenarLibro(libro4, 1, 2);

        Libro libroMasGrande = estanteria.calcularLibroMasGrande();
        System.out.println("el libro mas grande es  " + libroMasGrande.getTitulo());

        int estanteMasPesado = estanteria.calcularEstanteMasPesado();
        System.out.println("el estante mas pesado es el numero :  " + estanteMasPesado);

    }
}
