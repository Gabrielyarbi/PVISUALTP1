/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.aplicacion;

/**
 *
 * @author Gabriel
 */
public class Numero {
        public void mostrarPrimos(double a,double b){
        double acum;
        double cantidad=0;
        for (double i =a ; i <= b ;i++){
            acum=0;
                for(double j =1;j<=i;j++){
                   if ( i%j == 0){ 
                    acum=acum+1;
                }
              }
          if (acum == 2){
                System.out.println("El numero "+i+" es primo");
                cantidad= cantidad + 1;
             }
        }
        System.out.println("La cantidad de primos es: "+cantidad);
   }
    
}
