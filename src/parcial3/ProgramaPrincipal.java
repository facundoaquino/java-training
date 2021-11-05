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
public class ProgramaPrincipal {

    public static void main(String[] args) {

        Concurso concurso = new Concurso(20);
        Alumno alumno1 = new Alumno("pepe", 30, "viola");
        Alumno alumno2 = new Alumno("fede", 31, "bateria");
        Alumno alumno3 = new Alumno("ivo", 33, "viola2");
        Alumno alumno4 = new Alumno("pepi", 5, "viola3");

        concurso.inscribirAlumno(alumno1, 3);
        concurso.inscribirAlumno(alumno2, 3);
        concurso.inscribirAlumno(alumno3, 3);
        concurso.inscribirAlumno(alumno4, 1);

//        concurso.asignarPuntaje(12, "pepe");
//        concurso.asignarPuntaje(13, "ivo");
        concurso.asignarPuntaje(14, "pepi");
//        concurso.asignarPuntaje(22, "fede");

        int generoMax = concurso.generoConMasInscriptos();
        System.out.println("el genero con mas inscriptos es els numeros: " + generoMax);
    }
}
