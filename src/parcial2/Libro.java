/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author facun
 */
public abstract class Libro {

    private String titulo;
    private double precioBase;
    private Autor[] autores;

    public Libro(String titulo, double precioBase) {
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.autores = new Autor[8];
    }

    public void agregaAutor(String nombreAutor) {
        Autor autor = new Autor(nombreAutor);
        int i = 0;
        while (autores[i] != null) {
            i++;
        }
        autores[i] = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public abstract double precioFinal();

    public String autoresCadena() {
        String aux = "";
        int i = 0;
        while (this.autores[i] != null) {
            aux = aux + "  " + this.autores[i].getNombre();
            i++;
        }
        return aux;
    }

    @Override
    public String toString() {
        String aux;
        aux = this.titulo + " " + this.precioFinal() + " " + " Autores : " + this.autoresCadena();

        return aux;

    }

}
