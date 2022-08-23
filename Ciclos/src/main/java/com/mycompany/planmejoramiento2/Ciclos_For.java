/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Ciclos_For {
     public static void main(String[] args) {
         int duracion = 10;
       // Su funcion es similar la ciclo while
       for ( int j = 0; j <= duracion; j++){ // j++ Incrementa 1+1
           if (j < 3){
               System.out.println("Reproduciendo intro, segundo = "+j);
           }else if (j < 7){
               System.out.println("Reproduciendo pelicula, segundo = "+j);
           }else{
               System.out.println("Reproduciendo creditos, segundo = "+j);
           }
       }
    }
}
