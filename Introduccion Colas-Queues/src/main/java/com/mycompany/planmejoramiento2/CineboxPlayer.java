/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CineboxPlayer  implements MediaDownloader.DownloadListener{ // Implementar la interfaz
   
    public void initialize(){
        PriorityQueue<String> StringQueue = new PriorityQueue<>(); // Funcion para añadir una cola
        StringQueue.add("Hoola");
        StringQueue.add("Manzana");
        StringQueue.add("Hugo");
        System.out.println(StringQueue);
        
        String pollString = StringQueue.poll();// toma y borra el elemento de la cola
        System.out.println(pollString);
        System.out.println(pollString);
       
        /**Movie toyStory= new Movie("titulo: Toy Story","Ciencia Ficcion",90);
        
        Series umbrella = new Series("Umbrella", "Drama", 90, 10, 5);
        Series Walkind = new Series("Walkind", "Ciencia", 120, 7, 8);
        Series Pedro = new Series("Pedro", "Familiar", 45, 170, 1);
        
        umbrella.setSypnosis("Personas con poderes");
        Walkind.setSypnosis("ZoSmbies");
        Pedro.setSypnosis("Pobre");
        
        // Forma de integrar un ArrayList 
        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(umbrella); // Se agrega al ArrayList
        mediaList.add(Walkind);
        mediaList.add(Pedro);
        
        Collections.sort(mediaList);
        
        printInstrucciones(mediaList);
        
        Scanner scanner = new Scanner(System.in);
        int seleccion = scanner.nextInt();
        
        while (seleccion !=0){
            System.out.println("\n");
            int mediaListSize = mediaList.size();
            int index = seleccion -1;
             // Por si el usuario digita el index mayor al array le aparezca lo siguiente
            if( index >= mediaListSize){
                System.out.println("Serie invalida, selecciona otra");
            }else{
                Media media =mediaList.get(index);
                System.out.println(media.getSypnosis());
            }
            
            // Toca tener mucho cuiadado al tomar elementos de una lista atraves de sus indices
            Media media = mediaList.get(seleccion - 1);
            System.out.println(media.getSypnosis());
            
            
            System.out.println("\n");
            printInstrucciones(mediaList);
            seleccion = scanner.nextInt();
        }
        System.out.println("Fin");
    }
    
    private static void printInstrucciones(ArrayList<Media> mediaList ){
        System.out.println("Selecciona una serie para ver sus sipnosis");
        // Forma de iterar un ArrayList 
        
        for (int i = 0; i < mediaList.size(); i++) {
        Media media = mediaList.get(i); 
        int index = i + 1;
        System.out.println(index +") - " +media.getTitulo());
      
    }
       
        System.out.println("0) - Salir");
    }
    
    public void onMediaDownloaded(String content){
        
    }

    @Override
    public void onMediaDownload(Media media, String content) { // Implementa los metodos de la interfaz
        media.setContent(content);
        media.play();
        System.out.println(content);
    }*/
    }
}
