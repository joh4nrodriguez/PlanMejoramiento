/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class SobrecargaMetodos {
    public static void main(String[] args) {
        String[] tituloArray = new String[]{"La naranja mecanica","Buscando a nemo","Mision imposible","Star war",
            "Troya","Yo robot","Ant Man"};
        
        String titulo = play(tituloArray, 5);
        String titulo2 = play(tituloArray);// Metodo sobrecargado
        System.out.println("");
        pausa(titulo);
        System.out.println("");
        pausa(titulo2);// Imprime el metodo sobrecargado
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
    //Sobre Carga de Metodos, Se pueden Utilizar el nombre para artos metodos pero con diferentes argumentos.
    public static String play(String[] tituloArray) { // Los argumentos van dentro de los()
     Random Aleatorio = new Random();// Generar aleatoriamente
     int index = Aleatorio.nextInt(tituloArray.length-1);
     String titulo = tituloArray[index];
     
     for(int i = 0; i<10; i++){
             System.out.println("Viendo pelicula: "+ titulo);
         }
     return titulo;
    }
    //
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){ //Chequea si el titulo esta vacio
            System.out.println("No estas viendo la pelicula");
        }else{
        System.out.println("Movie pausada: "+ titulo);
        }
    }
}
