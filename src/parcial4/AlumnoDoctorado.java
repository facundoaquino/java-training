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
public class AlumnoDoctorado extends Alumno {

    private String tituloUniversitario;
    private String universidadOrigen;

    public AlumnoDoctorado(String tituloUniversitario, String universidadOrigen, int dni, String nombre) {
        super(dni, nombre, 8);
        this.tituloUniversitario = tituloUniversitario;
        this.universidadOrigen = universidadOrigen;
    }

    public boolean estaGraduado() {
        boolean tieneLasMaterias = super.estaGraduado();
        Materia materias[] = super.getMaterias();
        boolean materiaSiete = false;
        boolean materiaOcho = false;
        if (materias[7] != null && materias[8] != null) {
            materiaSiete = materias[7].getNota() > 7;
            materiaOcho = materias[8].getNota() > 8;
        }
        return tieneLasMaterias && materiaSiete && materiaOcho;
    }

}
