/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CineboxPlayer  implements MediaDownloader.DownloadListener{ // Implementar la interfaz
   
    public void initialize(){
        /** Tpos de ArrayList
         * ArrayList<String> stringList = new ArrayList<>(); 
         * ArrayList<Integer> stringList = new ArrayList<>(); 
         * ArrayList<Boolean> booleanList = new ArrayList<>();
         * ArrayList<Double> stringList = new ArrayList<>();
        */
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("umbrella");
        stringList.add("Walkind");
        stringList.add("Pedro");
        System.out.println(stringList);
        
        System.out.println("Friends");
        System.out.println(stringList);
        
        boolean containsUmbrella = stringList.contains("Umbrella");
        System.out.println("Contains Umbrella"+containsUmbrella);
        int size = stringList.size();
        System.out.println(size);
        
        
        /**Movie toyStory= new Movie("titulo: Toy Story","Ciencia Ficcion",90);
        toyStory.setWonOscar(true);
        
        MediaDownloader.dowload(toyStory,this);
        
        Series umbrella = new Series("Umbrella", "Drama", 90, 10, 5);
        Series Walkind = new Series("Walkind", "Ciencia", 120, 7, 8);
        Series Pedro = new Series("Pedro", "Familiar", 45, 170, 1);

        if (umbrella == Walkind){ // Hacer una comparacion de objetos
            System.out.println("Umbrella y Walkind Series iguales");
        }else{
            System.out.println("Umbrella y Walkind Series diferentes");
        }
        
        Series WalkindGenero = new Series("Walkind", "Ficcion", 120, 7, 8);
         if (WalkindGenero == Walkind){
            System.out.println("Walkind Genero y Walkind Series iguales");
        }else{
            System.out.println("Walkind Genero y Walkind Series diferentes");
        }
         
        Series WalkindEqual = new Series("Walkind", "Ciencia", 50, 9, 10); 
         if (WalkindEqual == Walkind){
             System.out.println("Walkind Igual y Walkind Series diferentes");
         }else{
             System.out.println("Walkind Igual y Walkind Series iguales");
         }
        
        umbrella.setSypnosis("Personas con poderes");
        Walkind.setSypnosis("Zmbies");
        Pedro.setSypnosis("Pobre");
        
        printInstrucciones();
        
        Scanner scanner = new Scanner(System.in);
        int seleccion = scanner.nextInt();
        
        while (seleccion !=0){
            System.out.println("\n");
            if (seleccion == 1){
                System.out.println(umbrella.getSypnosis());
            }else if ( seleccion == 2){
                System.out.println(umbrella.getSypnosis());
            }else if (seleccion == 3){
                System.out.println(Pedro.getSypnosis());
            }else{
                System.out.println("Serie invalida, selecciona otra");
            }
            System.out.println("\n");
            printInstrucciones();
            seleccion = scanner.nextInt();
        }
        System.out.println("Fin");
    }*/
    
    private static void printInstrucciones(){
        System.out.println("Selecciona una serie para ver sus sipnosis");
        System.out.println("1) - Umbrella");
        System.out.println("2) - Walkind");
        System.out.println("3) - Pedro");
        System.out.println("0) - Salir");
    }
    
    public void onMediaDownloaded(String content){
        
    }

    @Override
    public void onMediaDownload(Media media, String content) { // Implementa los metodos de la interfaz
        media.setContent(content);
        media.play();
        System.out.println(content);
    }
    
}
