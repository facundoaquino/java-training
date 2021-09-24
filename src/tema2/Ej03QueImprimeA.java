package tema2;

/**
 *
 * @author vsanz
 */
public class Ej03QueImprimeA {
    // porque si creo los dos strings sin el new con el mismo valor ahi si da da true

    public static void main(String[] args) {

        String saludo1 = new String("hola");
        String saludo2 = new String("hola");
        System.out.println(saludo1 == saludo2);
        System.out.println(saludo1 != saludo2);
        System.out.println(saludo1.equals(saludo2));
    }
}
