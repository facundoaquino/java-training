/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosAdicionales1;

/**
 *
 * @author facun
 */
public class GrupoBeta extends Grupo {

    @Override
    public void dosisATodos(double dosis) {

        for (int i = 0; i < super.getDimL(); i++) {
            if (super.obtenerPaciente(i + 1).getResultadoGlucosa() > 2.5) {
                super.obtenerPaciente(i + 1).aplicarDosis(dosis);
            }
        }
    }

}
