/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.dominio;

import punto2.aplicacion.Circulo;
import punto2.aplicacion.Rectangulo;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Rectangulo r1=new Rectangulo();
        System.out.println("El area del rectangulo es "+(r1.calcularArea(5, 4)));
        System.out.println("El area del rectangulo es "+(r1.calcularSuperficie(5, 4)));
        Circulo c1=new Circulo();
        System.out.println("----------------------------------------");
        System.out.println("El area del circulo es "+(c1.calcularArea(6)));
        System.out.println("La superficie del circulo es "+(c1.calcuarSuperficie(6)));
    }
    
}
