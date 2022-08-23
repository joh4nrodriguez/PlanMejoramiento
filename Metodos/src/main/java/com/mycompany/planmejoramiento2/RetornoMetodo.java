/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class RetornoMetodo {
    public static void main(String[] args) {
        String[] tituloArray = new String[]{"La naranja mecanica","Buscando a nemo","Mision imposible","Star war",
            "Troya","Yo robot","Ant Man"};
        
        String titulo = play(tituloArray, 5); // Los tipos de variables deben de estar en el mismo orden.
        System.out.println("");
        pausa(titulo);
    }
    public static String play(String[] tituloArray, int index) { // Los argumentos van dentro de los()
     if ( index < tituloArray.length){// con esto se protege el metodo por si el tamaño es mas grande el arreglo.
         String titulo = tituloArray[index];
         for(int i = 0; i<10; i++){
             System.out.println("Viendo pelicula: "+ titulo);
         }
         return titulo; // Regresar valores del titulo.
     }else{
         System.out.println("Indice demasiado grande");
         return "";// Regresa Valores vacio
     }
    }
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){ //Chequea si el titulo esta vacio
            System.out.println("No estas viendo la pelicula");
        }else{
        System.out.println("Movie pausada: "+ titulo);
        }
    }
}
