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
public class LibroImpreso extends Libro {

    private boolean esTapaDura;

    public LibroImpreso(boolean esTapaDura, String titulo, double precioBase) {
        super(titulo, precioBase);
        this.esTapaDura = esTapaDura;
    }

    public boolean isEsTapaDura() {
        return esTapaDura;
    }

    public void setEsTapaDura(boolean esTapaDura) {
        this.esTapaDura = esTapaDura;
    }

    @Override
    public double precioFinal() {
        if (this.esTapaDura) {
            return super.getPrecioBase() + 500;
        }
        return super.getPrecioBase();
    }

}
