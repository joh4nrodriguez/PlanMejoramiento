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
public class MaindelaClase {
    public static void main(String[] args) {
        CrearClases toyStory = new CrearClases();
        toyStory.nombre = "Toy Story";
        toyStory.genero = "Familiar";
        toyStory.duracion = 90;
        
        System.out.println(toyStory.nombre);
        System.out.println(toyStory.genero);
        System.out.println(toyStory.duracion);
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
