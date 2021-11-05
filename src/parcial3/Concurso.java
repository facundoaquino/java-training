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
public class Concurso {

    private int generosMusicales = 5;
    private Alumno[][] competencia;
    int cantidadAlumnos;

    public Concurso(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
        this.competencia = new Alumno[this.generosMusicales][this.cantidadAlumnos];
    }

    public void inscribirAlumno(Alumno alumno, int genero) {

        int lugarAlumno = 0;
        while (this.competencia[genero - 1][lugarAlumno] != null) {
            lugarAlumno++;
        }

        this.competencia[genero - 1][lugarAlumno] = alumno;
    }

    public void asignarPuntaje(double puntaje, String nombre) {

        int generoMusical = 0;
        int lugarAlumno = 0;
        while ((generoMusical < this.generosMusicales) && (!nombre.equals(this.competencia[generoMusical][lugarAlumno].getNombre()))) {
            lugarAlumno = 0;
            while ((lugarAlumno < this.cantidadAlumnos) && (!nombre.equals(this.competencia[generoMusical][lugarAlumno].getNombre()))) {
                lugarAlumno++;
            }
            if (lugarAlumno < this.cantidadAlumnos) {
                generoMusical++;
            }
        }
        if (generoMusical < this.generosMusicales) {
            this.competencia[generoMusical][lugarAlumno].setPuntajeObtenido(puntaje);
        }
    }

    public int generoConMasInscriptos() {
        int generoMax = 0;
        int inscriptosMax = 0;
        int inscriptosActual = 0;
        int generoMusical = 0;
        int lugarAlumno;
        while ((generoMusical < this.generosMusicales)) {
            lugarAlumno = 0;
            inscriptosActual = 0;
            while ((lugarAlumno < this.cantidadAlumnos) && (this.competencia[generoMusical][lugarAlumno] != null)) {
                System.out.println(this.competencia[generoMusical][lugarAlumno].getNombre());
                inscriptosActual++;
                lugarAlumno++;
            }
            if (inscriptosActual > inscriptosMax) {
                inscriptosMax = inscriptosActual;
                generoMax = generoMusical;
            }
            generoMusical++;

        }

        return generoMax + 1;
    }

}
