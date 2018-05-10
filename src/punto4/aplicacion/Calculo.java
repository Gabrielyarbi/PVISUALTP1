/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4.aplicacion;

/**
 *
 * @author Gabriel
 */
public class Calculo {
     public double calcularSumatoria(double m){
    double acum=0;
    for (double i = 1;i<=m;i++){
    
       acum=acum +(2*i-1);
        
        }
   return acum;
    }
    


public double calcularProductoria(double k){
    double acumulador=1;
    for (double j = 1;j<= k; j++){
    
       acumulador=(acumulador*j);
        
        }
   return acumulador;
    }
    
    
}
