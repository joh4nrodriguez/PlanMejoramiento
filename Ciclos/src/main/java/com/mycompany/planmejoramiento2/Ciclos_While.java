/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Ciclos_While {
    
    public static void main(String[] args) {

       int i = 0;
       int duracion = 10;
       //SIRVE PARA HACER TAREAS REPETITIVAS HASTA QUE SE CUMPLA CIERTA CONDICION
       
       while(i <= duracion){ // Condicion
           if(i < 3){
               System.out.println("Reproduciendo intro, segundo = "+i);
           }else if(i < 7){
               System.out.println("Reproduciendo pelicula, segundo = "+i);
           }else{
               System.out.println("Reproduciendo creditos, segundo = "+i);
           }       
           i++; // Incrementa la variable de 1 + 1
       }
    }
}
