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
       
        Movie toyStory= new Movie("titulo: Toy Story","Ciencia Ficcion",90);
        
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
        
        printInstrucciones(mediaList);
        
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
            printInstrucciones(mediaList);
            seleccion = scanner.nextInt();
        }
        System.out.println("Fin");
    }
    
    private static void printInstrucciones(ArrayList<Media> mediaList ){
        System.out.println("Selecciona una serie para ver sus sipnosis");
        // Forma de iterar un ArrayList 
        for (int i = 0; i < mediaList.size(); i++) {
        Media media = mediaList.get(i); // Obtiene el indice i
        int index = i + 1;
        System.out.println(index +") - " +media.getTitulo());
        // Se obtiene el mismo resultado pero menos lineas de codigo
    }
        // Segunda forma de iterar un ArrayList
        for(Media media : mediaList){
            System.out.println(media.getTitulo()); // Se obtiene el mismo resultado pero sin el indice
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
    }
    
}
