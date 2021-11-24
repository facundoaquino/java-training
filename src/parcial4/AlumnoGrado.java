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
public class AlumnoGrado extends Alumno {

    private String carrera;

    public AlumnoGrado(String carrera, int dni, String nombre) {
        super(dni, nombre, 4);
        this.carrera = carrera;
    }

    public boolean estaGraduado() {
        boolean tieneLasMaterias = super.estaGraduado();
        Materia materias[] = super.getMaterias();
        boolean materiaMasQueCinco = false;
        if (materias[3] != null) {
            materiaMasQueCinco = materias[3].getNota() > 5;
        }
        return tieneLasMaterias && materiaMasQueCinco;
    }
}
