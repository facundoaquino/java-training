/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author facun
 */
public class Triangulo extends Figura {
     private double ladoUno;
    private double ladoDos;
    private double ladoTres;

    public Triangulo(String colorRelleno,String colorLinea , double ladoUno, double ladoDos, double ladoTres) {
        super(colorRelleno,colorLinea);        
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
        this.ladoTres = ladoTres;
    }
    
    
    
    public double calcularArea() {
           double s = (ladoUno + ladoDos + ladoTres) / 2;
        double area = Math.sqrt(s * (s - ladoUno) * (s - ladoDos) * (s - ladoTres));
        return area;
    }

  
    public double calcularPerimetro() {
       double p = ladoUno + ladoDos + ladoTres;
        return p;
    }

    public double getLadoUno() {
        return ladoUno;
    }
    
    
    @Override
     public String toString(){
       String aux = super.toString() + 
                    " Lado uno : " + getLadoUno()+
                    " Lado Dos: " + getLadoDos()+
                    " Lado Tres: " + getLadoTres();
       return aux;
    }

    public void setLadoUno(double ladoUno) {
        this.ladoUno = ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
    }

    public double getLadoTres() {
        return ladoTres;
    }

    public void setLadoTres(double ladoTres) {
        this.ladoTres = ladoTres;
    }
    
    
}
