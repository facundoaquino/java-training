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
public class Entrenador {

    private String nombre;
    private double sueldoBasico;
    private int campeonatosGanados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }

    public double calcularSueldoACobrar() {
        double plus = 0;
        if (campeonatosGanados > 0) {
            plus = 5000;
            if (campeonatosGanados > 4) {
                plus = 30000;
            }
            if (campeonatosGanados > 9) {
                plus = 50000;
            }
        }
        return sueldoBasico + plus;
    }
}
