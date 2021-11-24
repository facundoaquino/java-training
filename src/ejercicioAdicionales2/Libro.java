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
public class Libro {

    private String titulo;
    private int cantidadPaginas;
    private double peso;
    private Autor autor;

    public Libro(String titulo, int cantidadPaginas, double peso, Autor autor) {
        this.titulo = titulo;
        this.cantidadPaginas = cantidadPaginas;
        this.peso = peso;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
