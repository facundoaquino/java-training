/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author facun
 */
public class Balanza {

    private double montoTotal;
    private int cantidadProductos;

    public void iniciarCompra() {
        montoTotal = 0;
        cantidadProductos = 0;
    }

    public void registrarProducto(double pesoEnKg, double precioPorKg) {
        montoTotal = montoTotal + (pesoEnKg * precioPorKg);
        cantidadProductos++;
    }

    public double devolverMontoAPagar() {
        return montoTotal;
    }

    public String devolverResumenDeCompra() {
        String aux = "Total a pagar " + montoTotal + " por la compra de  " + cantidadProductos + " productos ";

        return aux;

    }

}
