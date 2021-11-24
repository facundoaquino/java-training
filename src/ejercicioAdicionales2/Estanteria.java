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
public class Estanteria {

    private Libro estanteria[][];
    private int estantes;
    private int libros;

    public Estanteria(int estantes, int libros) {
        this.estantes = estantes;
        this.libros = libros;
        estanteria = new Libro[estantes][libros];
    }

    public Estanteria() {
        this.estantes = 5;
        this.libros = 10;
        estanteria = new Libro[estantes][libros];
    }

    public void almacenarLibro(Libro libro, int estante, int posLibro) {
        this.estanteria[estante][posLibro] = libro;
    }

    public Libro sacarLibro(String titulo) {
        Libro libro = null;
        for (int i = 0; i < this.estantes; i++) {
            for (int j = 0; j < this.libros; j++) {
                if (estanteria[i][j] != null) {
                    String aux = estanteria[i][j].getTitulo();
                    if (aux.equals(titulo)) {
                        libro = estanteria[i][j];
                        estanteria[i][j] = null;
                    }
                }
            }

        }
        return libro;
    }

    public Libro calcularLibroMasGrande() {
        double pesoMax = 0;
        Libro libroMax = null;
        for (int i = 0; i < this.estantes; i++) {
            for (int j = 0; j < this.libros; j++) {
                if (estanteria[i][j] != null) {
                    if (estanteria[i][j].getCantidadPaginas() > pesoMax) {
                        pesoMax = estanteria[i][j].getCantidadPaginas();
                        libroMax = estanteria[i][j];
                    }
                }
            }

        }
        return libroMax;
    }

    public int calcularEstanteMasPesado() {
        double pesoMax = 0;
        int estanteMax = 0;
        double estanteActual = 0;
        for (int i = 0; i < this.estantes; i++) {
            estanteActual = 0;
            for (int j = 0; j < this.libros; j++) {
                if (estanteria[i][j] != null) {
                    estanteActual = estanteActual + estanteria[i][j].getPeso();
                }
            }
            if (estanteActual > pesoMax) {
                pesoMax = estanteActual;
                estanteMax = i;
            }
        }
        return estanteMax + 1;
    }

}
