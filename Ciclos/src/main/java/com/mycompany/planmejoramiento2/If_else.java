/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class If_else {
    public static void main(String[] args) {
        
       /** int totalEpisodios = 1;
        
        // Tiene que cumplir alguna condicion
        
        if (totalEpisodios > 1){
            System.out.println("Es una pelicula");
        }else if(totalEpisodios == 1){ // == igualdad o comparacion
            System.out.println("Es una serie");
        }else{
            System.out.println("Debe tener al menos un episodio.");
        }*/
       
       // IF-ELSE CON MULTIPLES COMPARACIONES
       
       /**int totalEpisodios = 1;
       int totalTemporadas = 4;
       // IF ANIDADOS
       
       if (totalEpisodios > 1 || totalTemporadas > 1){ // || sirve para decir "O" 
           if (totalEpisodios <= 10){
           System.out.println("Es una miniserie");
           }else{
            System.out.println("Es una serie"); 
           }
        } else if(totalEpisodios == 1){ // == igualdad o comparacion
            System.out.println("Es una pelicula");
        }else{
            System.out.println("Debe tener al menos un episodio.");
        }*/
       
       int totalEpisodios = 1;
      
     
       
       if (totalEpisodios > 1 && totalEpisodios <=10){ // && sirve para decir "y" 
           System.out.println("Es una miniserie");
       }else if (totalEpisodios > 10){
           System.out.println("Es una serie");
       }else if(totalEpisodios == 1){ // == igualdad o comparacion
            System.out.println("Es una pelicula");
        }else{
            System.out.println("Debe tener al menos un episodio.");
        }
    }
    
}
