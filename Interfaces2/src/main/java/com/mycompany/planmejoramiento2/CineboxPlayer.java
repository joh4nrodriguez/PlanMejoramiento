/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CineboxPlayer  implements MediaDownloader.DownloadListener{ // Implementar la interfaz
   
    public void initialize(){
        Movie toyStory= new Movie("titulo: Toy Story","Ciencia Ficcion",90);
        toyStory.setWonOscar(true);
        
        MediaDownloader.dowload(toyStory,this);
        
        
        
        Series umbrella = new Series("Umbrella", "Drama", 90, 10, 5);
        Series Walkind = new Series("Walkind", "Ciencia", 120, 7, 8);
        Series Pedro = new Series("Pedro", "Familiar", 45, 170, 1);

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
    }
    
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
