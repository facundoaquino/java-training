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
public class LibroElectronico extends Libro {

    private String formato;
    private double tamanio;

    public LibroElectronico(String formato, double tamanio, String titulo, double precioBase) {
        super(titulo, precioBase);
        this.formato = formato;
        this.tamanio = tamanio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public double precioFinal() {
        double impuestoPorMb = 2.5;
        double impuestoFinal = this.tamanio * impuestoPorMb;
        return super.getPrecioBase() + impuestoFinal;
    }

}
