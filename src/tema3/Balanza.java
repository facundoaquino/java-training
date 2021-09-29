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
    private String resumen;

    public void iniciarCompra() {
        montoTotal = 0;
        cantidadProductos = 0;
        resumen = "";
    }

    public void registrarProducto(Producto producto, double precioPorKg) {
        // montoTotal = montoTotal + (pesoEnKg * precioPorKg);
        double montoPorProducto = (producto.getPesoEnKg() * precioPorKg);
        montoTotal = montoTotal + montoPorProducto;

        resumen = resumen + producto.getDescripcion() + " " + montoPorProducto + " pesos" + " - ";
        cantidadProductos++;
    }

    public double devolverMontoAPagar() {
        return montoTotal;
    }

    public String devolverResumenDeCompra() {
        String aux = resumen + " Total a pagar " + montoTotal + " por la compra de  " + cantidadProductos + " productos ";

        return aux;

    }

}
