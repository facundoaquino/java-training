/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial4;

import java.util.Iterator;

/**
 *
 * @author facun
 */
public abstract class Alumno {

    private int dni;
    private String nombre;
    private Materia[] materias;
    private int cantidadMaterias;
    private int dimL = 0;

    public Alumno(int dni, String nombre, int cantidadMaterias) {
        this.dni = dni;
        this.nombre = nombre;
        this.cantidadMaterias = cantidadMaterias;
        this.materias = new Materia[cantidadMaterias];

    }

    public void agregarMateria(int codigo, Materia materia) {
        if (materias[codigo] == null) {
            dimL++;
        }
        materias[codigo] = materia;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public String infoMaterias() {
        String aux = "";
        for (int i = 0; i < cantidadMaterias; i++) {
            if (materias[i] != null) {
                aux = aux + " " + i + materias[i].getNota() + " " + materias[i].getFechaAprobacion();
            }
        }
        return aux;
    }

    public boolean estaGraduado() {
        System.out.println("diml" + dimL + " cantidad mateiras " + cantidadMaterias);
        return dimL == cantidadMaterias;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        String aux;
        String auxGraduado;
        boolean graduado = this.estaGraduado();
        if (graduado) {
            auxGraduado = "  esta graduado! ";
        } else {
            auxGraduado = " no esta graduado";
        }
        aux = "Dni " + getDni() + " " + getNombre() + " materias aprobadas: " + infoMaterias() + auxGraduado;
        return aux;
    }

}
