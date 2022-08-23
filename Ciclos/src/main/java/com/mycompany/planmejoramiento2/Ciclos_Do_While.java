/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Ciclos_Do_While {
    public static void main(String[] args) {
 
       int k = 0;
       int duracion = 10;
       // Siempre se va a ejecutar lo que esta dentro de los corchetes del do
       // La condicion se evalua al final
       
        do{
            if (k < 3){
               System.out.println("Reproduciendo intro, segundo = "+k);
           }else if (k < 7){
               System.out.println("Reproduciendo pelicula, segundo = "+k);
           }else{
               System.out.println("Reproduciendo creditos, segundo = "+k);
           }
           k++; // Debemos de incrementar la variable para que no quede infinito por si las dos condiciones se cumplen
        }while(k <=duracion);
    }
}
