/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.aplicacion;

/**
 *
 * @author Gabriel
 */
public class Raiz {
     public void CalcularRaices (double a,double b,double c){    
    double res;
    double x1,x2;
    res=Math.pow(b, 2)- 4*a*c;
    if (res <0){
        System.out.println("No tiene solucion en los reales");
    
         }else{
                if(res==0){
                    x1 = -b/(2*a);
                    System.out.println("x1 = x2"+x1);
                }else{
                    x1 = ((-b+ Math.sqrt(res))/2*a);
                    System.out.println("Raiz x1 :"+x1);
                    x2 = ((-b- Math.sqrt(res))/2*a);
                   System.out.println("Raiz x2 :"+x2);
                }
            }
    
    
    }
}
