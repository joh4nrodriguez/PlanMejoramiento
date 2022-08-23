/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Arreglos_y_Loops {
    public static void main(String[] args) {
        int[] episodioDuracionArray = new int[]{30, 32, 27, 31, 60};//Se colocan los valores dentro de los corchetes los valores de los indeces
        int n = episodioDuracionArray.length;// Longitud del arreglo
        
        int duracionSesion =0;
        
        for (int i = 0; i < n; i++){
            duracionSesion += episodioDuracionArray[i];// Sume todos los valores del indice
        }
        System.out.println(duracionSesion);
    }
}
