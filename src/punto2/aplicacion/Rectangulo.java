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
public class Rectangulo {
    public double calcularArea (double b,double h){
    
    double resultado =b*h;
    return resultado;
    }
   
  public double calcularSuperficie (double b , double h){ 
      
      double rsup = b*2 + h*2;
      return rsup;
  }    
    
}
