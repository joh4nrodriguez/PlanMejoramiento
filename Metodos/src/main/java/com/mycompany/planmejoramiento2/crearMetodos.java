/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class crearMetodos {  
    // Los metodos nos ayudan a separar el codigo en bloques
    public static void main(String[] args) {// Los metodos se controlan desde el Main
        playMovie();
        System.out.println("");
        pausa();
    }
    public static void playMovie() { //Metodo, pueden tener cualquier codigo
        for (int i = 0; i < 10; i++){
        System.out.println("Play movie...");
        }
    }
    public static void pausa() {
        System.out.println("Movie pausada");
    }
}
