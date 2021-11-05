/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

/**
 *
 * @author facun
 */
class Alumno {

    String nombre;
    int edad;
    String instrumento;
    double puntajeObtenido;

    public Alumno(String nombre, int edad, String instrumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.instrumento = instrumento;
        this.puntajeObtenido = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuntajeObtenido(double puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }

}
