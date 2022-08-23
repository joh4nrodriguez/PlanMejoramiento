/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class ArregloString {
    public static void main(String[] args) {
        String[] tituloPeliculaArray = new String[]{"Up","Salto","Titanic","Rapido","Dragon"};
        
        for (String titulo : tituloPeliculaArray){ // Forma para iterar en los arreglos.
            if (!titulo.contains("i")) // Que no muestre los titulos de las peliculas que contengan la letra i,! es para negar y me imprima los titulos que no tienen la letra i
            System.out.println(titulo);
        }
    }
}
