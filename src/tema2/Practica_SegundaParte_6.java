/*
 * 6- Se dispone de la clase Partido (ya implementada en la carpeta tema2). Un objeto partido representa un encuentro entre dos equipos (local y visitante).
Un objeto partido puede crearse sin valores iniciales o enviando en el mensaje de creación el
nombre del equipo local, el nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). Un objeto partido sabe responder a los siguientes mensajes:
Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en el campeonato. La información de cada partido se lee desde teclado
hasta ingresar uno con nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga informar:
- La cantidad de partidos que ganó River. - El total de goles que realizó Boca jugando de local. - El porcentaje de partidos finalizados con empate.
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author facun
 */
public class Practica_SegundaParte_6 {

    public static void main(String[] args) {
        int MAX_PARTIDOS = 20;
        Partido[] partidos = new Partido[MAX_PARTIDOS];
        String local, visitante;

        int golesLocal, golesVisitante, dimL, ganadosRiver, golesBocaDeLocal, partidosEmpatados;

        System.out.println("ingrese equipo visitante , con ZZZ sale del programa");
        visitante = Lector.leerString();
        dimL = 0;

        while ((dimL < MAX_PARTIDOS) && (!visitante.equals("ZZZ"))) {

            System.out.println("ingrese equipo local");

            local = Lector.leerString();
            System.out.println("ingrese goles del local");
            golesLocal = Lector.leerInt();
            System.out.println("ingrese goles del visitante");
            golesVisitante = Lector.leerInt();
            partidos[dimL] = new Partido(local, visitante, golesLocal, golesVisitante);
            System.out.println("ingrese equipo visitante , con ZZZ sale del programa");
            visitante = Lector.leerString();
            dimL++;
        }
        ganadosRiver = 0;
        partidosEmpatados = 0;
        golesBocaDeLocal = 0;
        for (int i = 0; i < dimL; i++) {
            if (partidos[i].hayGanador()) {
                if (partidos[i].getGanador().equals("river")) {
                    ganadosRiver++;
                }
            } else {
                partidosEmpatados++;
            }
            if (partidos[i].getLocal().equals("boca")) {
                golesBocaDeLocal = golesBocaDeLocal + partidos[i].getGolesLocal();
            }
        }
        System.out.println("river gano " + ganadosRiver + " partidos");
        System.out.println("boca hizo " + golesBocaDeLocal + " goles de local");
        System.out.println("el porcentaje de partidos empatados fue del " + ((double) (partidosEmpatados * 100) / dimL) + "%");

    }
}
