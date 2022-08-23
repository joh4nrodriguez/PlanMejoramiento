/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Switch {
    public static void main(String[] args) {
        int diaSemana = 1;
        
        // sE PUEDE UTULIZAR CUALQUIERA DE LAS DOS FORMAS
        
        if (diaSemana == 1 ){
            System.out.println("Es lunes de comedia");
        }else if (diaSemana == 2){
            System.out.println("Martes de drama");
        }else if (diaSemana == 3){
            System.out.println("Miercoles de accion");
        }else if (diaSemana == 4){
            System.out.println("Jueves de animadas");
        }else if (diaSemana == 5){
            System.out.println("Viernes de terror");
        }else if (diaSemana == 6){
            System.out.println("Sabado de documentales");
        }else if (diaSemana == 7){
            System.out.println("Domingo de comedia");
        }else{
             System.out.println("¿En que dia vives?");
        }
        // Sirve para evaluar la validacion de los casos
        // break es para cuando un caso se cumpla se detega y no evalue los demas casos
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
