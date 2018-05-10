/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.dominio;

import java.util.Scanner;
import punto3.aplicacion.Numero;

/**
 *
 * @author Gabriel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero n1=new Numero();
        Scanner scaner = new Scanner(System.in);
        double c,d;
        
        System.out.println("Ingrese primer numero del rango (menor) ");
     c=scaner.nextDouble();
        System.out.println("Ingrese segundo numero del rango (mayor) ");
     d=scaner.nextDouble();
    if (c<d){
    n1.mostrarPrimos(c, d);
    }else{
        System.out.println("Error el primer numero del rango debe se menor que el segundo");
    }
        
    }
    
}
