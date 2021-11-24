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
public class ProgramaPrincipal {

    public static void main(String[] args) {
        AlumnoGrado alumno1 = new AlumnoGrado("informatica", 35267756, "facundo aquino");
        AlumnoDoctorado alumno2 = new AlumnoDoctorado("programador ", " unlp ", 1718555, "juana gonzalez");

        Materia materia1 = new Materia(9, "programacion 1", "nov 2021");

        alumno1.agregarMateria(0, materia1);
        alumno1.agregarMateria(1, materia1);
        alumno1.agregarMateria(2, materia1);
        alumno1.agregarMateria(3, materia1);

        alumno2.agregarMateria(0, materia1);
        alumno2.agregarMateria(2, materia1);
        alumno2.agregarMateria(3, materia1);
        alumno2.agregarMateria(5, materia1);

        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
    }

}
