/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosAdicionales1;

import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author facun
 */
public class Paciente {

    private String nombre;
    private double resultadoGlucosa;
    private double ultimaDosis;

    public Paciente(String nombre, double resultadoGlucosa, double ultimaDosis) {
        this.nombre = nombre;
        this.resultadoGlucosa = resultadoGlucosa;
        this.ultimaDosis = ultimaDosis;
    }

    public void aplicarDosis(double dosis) {
        double randomDouble = GeneradorAleatorio.generarDouble(1);
        this.resultadoGlucosa = this.resultadoGlucosa - randomDouble;
        this.ultimaDosis = dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getResultadoGlucosa() {
        return resultadoGlucosa;
    }

    public void setResultadoGlucosa(double resultadoGlucosa) {
        this.resultadoGlucosa = resultadoGlucosa;
    }

    public double getUltimaDosis() {
        return ultimaDosis;
    }

    public void setUltimaDosis(double ultimaDosis) {
        this.ultimaDosis = ultimaDosis;
    }

}
