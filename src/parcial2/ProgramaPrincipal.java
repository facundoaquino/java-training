/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author facun
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {
        Libro libro1 = new LibroImpreso(true, "titulo cualquiera", 32);
        libro1.agregaAutor("nombreAutor libro 1");
        libro1.agregaAutor("nombreAutor2 libro 1");
        libro1.agregaAutor("nombreAutor3 libro 1");

        Libro libroElectronico = new LibroElectronico("pdf", 10, "libro electronico", 150);
        libroElectronico.agregaAutor("autor electronico1");
        libroElectronico.agregaAutor("autor electronico2");
        libroElectronico.agregaAutor("autor electronico3");

        System.out.println(libro1.toString());
        System.out.println(libroElectronico.toString());

    }
}
