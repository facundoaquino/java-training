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
public class ProgramaPrincipal {

    public static void main(String[] args) {
        GrupoAlfa grupoalfa = new GrupoAlfa();
        GrupoBeta grupobeta = new GrupoBeta();

        Paciente paciente1 = new Paciente("pepe", 15.2, 3.4);
        Paciente paciente5 = new Paciente("pepe", 15.2, 3.4);
        Paciente paciente2 = new Paciente("pepe", 15.2, 3.4);
        Paciente paciente3 = new Paciente("pepe", 15.2, 3.4);
        Paciente paciente4 = new Paciente("pepe", 15.2, 3.4);

        grupoalfa.agregarPaciente(paciente1);
        grupoalfa.agregarPaciente(paciente2);
        grupoalfa.agregarPaciente(paciente3);
        grupoalfa.agregarPaciente(paciente4);

        grupobeta.agregarPaciente(paciente4);
        grupobeta.agregarPaciente(paciente1);
        grupobeta.agregarPaciente(paciente2);
        grupobeta.agregarPaciente(paciente3);

        double dosisAAplicar;
        dosisAAplicar = Lector.leerDouble();

        grupoalfa.dosisATodos(dosisAAplicar);
        grupobeta.dosisATodos(dosisAAplicar);

        System.out.println(grupoalfa.toString());
    }
}
