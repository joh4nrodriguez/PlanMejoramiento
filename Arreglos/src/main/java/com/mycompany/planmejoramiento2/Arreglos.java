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
public class Arreglos {
    public static void main(String[] args) {
        /**System.out.println("Escribe el numero de episodio que quieras saber su duracion: ");
        Scanner scanner = new Scanner(System.in);
        int episodeIndex = scanner.nextInt();
        episodeIndex--; // Se le resta 1 al valor digitado 
        
        // Array son listas de valores
        int[] episodioDuracionArray = new int[5]; // Tamaño del arreglo, Siempre incian 0 y van hasta el -1
    
        episodioDuracionArray[0] = 30;
        episodioDuracionArray[1] = 32;
        episodioDuracionArray[2] = 27;
        episodioDuracionArray[3] = 31;
        episodioDuracionArray[4] = 60;
        
        if (episodeIndex >= 0 && episodeIndex <5){
        int episodioDuracion = episodioDuracionArray[episodeIndex];
        System.out.println("El episodio dura "+ episodioDuracion+ "minutos");
        }else{
            System.out.println("Error, la serie solo tiene 5 episodios");
        }*/
        System.out.println("Escribe el numero de episodio que quieras saber su duracion: ");
        Scanner scanner = new Scanner(System.in);
        int episodeIndex = scanner.nextInt();
        episodeIndex--; // Se le resta 1 al valor digitado 
        
        // Array son listas de valores
        int[] episodioDuracionArray = new int[]{30, 32, 27, 31, 60}; //Se colocan los valores dentro de los corchetes los valores de los indeces
        int n = episodioDuracionArray.length; // Longitud del arreglo
        
        if (episodeIndex >= 0 && episodeIndex <n){
        int episodioDuracion = episodioDuracionArray[episodeIndex];
        System.out.println("El episodio dura "+ episodioDuracion+ "minutos");
        }else{
            System.out.println("Error, la serie solo tiene n episodios");
        }
    }
}
