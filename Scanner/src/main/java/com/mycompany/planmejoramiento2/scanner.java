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
public class scanner {
     public static void main(String[] args) {
        System.out.println("¿Que dia de la semana es (Lunes = 1 - Domingo = 7):");
        
        Scanner entrada = new Scanner(System.in);
        int diaSemana = entrada.nextInt(); // Pedir un dato entero al usuario
        
        // String myString = entrada.next(); Pedir un dato tipo string
        
         switch (diaSemana){
            case 1:
                System.out.println("Es lunes de comedia");
                break;
            case 2:
                System.out.println("Es Martes de drama");
                break;
            case 3:
                System.out.println("Miercoles de accion");
                break;
            case 4:
                System.out.println("Jueves de animadas");
                break;
            case 5:
                System.out.println("Viernes de terror");
                break;
            case 6:
                System.out.println("Sabado de documentales");
                break;
            case 7:
                System.out.println("Domingo de comedia");
                break;
            default: // Por si se digita por fuera del limite 
                System.out.println("¿En que dia vives?");    
        }
    }
}

