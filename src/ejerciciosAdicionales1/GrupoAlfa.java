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
public class GrupoAlfa extends Grupo {

    @Override
    public void dosisATodos(double dosis) {
        System.out.println("diml del grupo " + super.getDimL());
        for (int i = 0; i < super.getDimL(); i++) {
            super.obtenerPaciente(i + 1).aplicarDosis(dosis);
        }
    }

}
