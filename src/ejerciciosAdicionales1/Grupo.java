/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosAdicionales1;

import PaqueteLectura.Lector;

/**
 *
 * @author facun
 */
public abstract class Grupo {

    private Paciente pacientes[] = new Paciente[10];
    private int dimL = 0;

    public int agregarPaciente(Paciente paciente) {
        pacientes[dimL] = paciente;
        dimL++;
        return dimL + 1;
    }

    public Paciente obtenerPaciente(int id) {
        if (id < 10 && id > 0) {
            return pacientes[id - 1];
        }
        return null;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public abstract void dosisATodos(double dosis);

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < dimL; i++) {
            aux = aux + " id : " + (i + 1) + " nombre " + pacientes[i].getNombre() + " ultima glucosa  " + pacientes[i].getResultadoGlucosa() + " ultima dosis " + pacientes[i].getUltimaDosis() + "\n";
        }
        return aux;
    }

    public int getDimL() {
        return dimL;
    }

}
