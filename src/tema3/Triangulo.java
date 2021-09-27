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
public class Triangulo {

    private double ladoUno;
    private double ladoDos;
    private double ladoTres;
    private String colorRelleno;
    private String colorLinea;

    public double getLadoUno() {
        return ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public double getLadoTres() {
        return ladoTres;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setLadoUno(double l) {
        ladoUno = l;
    }

    public void setLadoDos(double l) {
        ladoDos = l;
    }

    public void setLadoTres(double l) {
        ladoTres = l;
    }

    public double calcularArea() {
        double s = (ladoUno + ladoDos + ladoTres) / 2;
        double area = Math.sqrt(s * (s - ladoUno) * (s - ladoDos) * (s - ladoTres));
        return area;

    }

    public double calcularPerimetro() {
        double p = ladoUno + ladoDos + ladoTres;
        return p;
    }
}
