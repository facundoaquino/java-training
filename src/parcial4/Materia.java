/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial4;

/**
 *
 * @author facun
 */
public class Materia {

    private double nota;
    private String nombre;
    private String fechaAprobacion;

    public Materia(double nota, String nombre, String fechaAprobacion) {
        this.nota = nota;
        this.nombre = nombre;
        this.fechaAprobacion = fechaAprobacion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(String fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

}
