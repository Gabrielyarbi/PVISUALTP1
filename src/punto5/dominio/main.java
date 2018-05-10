/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.dominio;

import java.util.Scanner;
import punto5.aplicacion.Raiz;

/**
 *
 * @author Gabriel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        Raiz cuadratica=new Raiz();
       double a,b,c;
        System.out.println("Ingrece coeficiente a ");
       a=scan.nextDouble();
        System.out.println("Ingrece coeficiente b ");
       b=scan.nextDouble();
        System.out.println("Ingrece coeficiente c ");
       c=scan.nextDouble();
        
       cuadratica.CalcularRaices(a, b, c);
          }
    }
    
