/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class ArgumentosMetodos {
    public static void main(String[] args) {
        String[] tituloArray = new String[]{"La naranja mecanica","Buscando a nemo","Mision imposible","Star war",
            "Troya","Yo robot","Ant Man"};
        
        play(tituloArray, 1); // Los tipos de variables deben de estar en el mismo orden.
        System.out.println("");
        pausa();
    }
    public static void play(String[] tituloArray, int index) { // Los argumentos van dentro de los()
     if ( index < tituloArray.length){// con esto se protege el metodo por si el tamaño es mas grande el arreglo.
         String titulo = tituloArray[index];
         for(int i = 0; i<10; i++){
             System.out.println("Viendo pelicula: "+ titulo);
         }
     }else{
         System.out.println("Indice demasiado grande");
     }
    }
    public static void pausa() {
        System.out.println("Movie pausada");
    }
}
