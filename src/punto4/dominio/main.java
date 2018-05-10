/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4.dominio;

import java.util.Scanner;
import punto4.aplicacion.Calculo;

/**
 *
 * @author Gabriel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Calculo c1=new Calculo();
        Scanner scan = new Scanner(System.in);
        double m,k;
        double res;
        System.out.println("Ingrese numero parala sumatoria");
        m =scan.nextDouble();
                
                
      res =c1.calcularSumatoria(m);
        System.out.println("la sumatoria da "+res);
    
    
    
        System.out.println("Ingrese numero para la productoria");
        k =scan.nextDouble();
        res=c1.calcularProductoria(k);
        System.out.println("La poductoria da "+res);
    }
    
    }
    

