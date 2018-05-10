/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion;

/**
 *
 * @author Gabriel
 */
public class Circulo {
     public double  calcularArea (double r){
        
        
        return Math.PI*Math.pow(r, 2);
        
    }
    public double calcuarSuperficie (double radio){
    
       return 2*Math.PI*radio;        
        
    }
}
