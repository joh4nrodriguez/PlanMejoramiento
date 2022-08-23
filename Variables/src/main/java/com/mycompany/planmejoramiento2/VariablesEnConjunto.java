/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class VariablesEnConjunto {
    
    public static void main(String[] args) {
        int edad = 25;
        float altura = 1.70f;
        double valorDePi = 3.1467892;
        long distanciaAlSol = 478288917552662L;
        boolean isDay = false;
        char miIncial= 'e';
        
        // Formatos de String, Java recomienda con String.format
        System.out.println(String.format("Mi edad es %d", edad, distanciaAlSol)); // Cuando hay una variable despues de la coma que la reemplaze por el %d y le va a decir que es una variable de tipo entero o long, se pueden agregar varias variables.
        System.out.println(String.format("Mi altura es %.2f", altura, valorDePi )); //Cuando hay una variable despues de la coma que la reemplaze por el %.2f para decirle la cantidad de decimales y le va a decir que es una variable de tipo flotante y/o doble.
    }
}
