/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Johan Rodriguez
 */
public class Variables {
    
    public static void main(String[] args) {
        // VARIABLES MAS COMUNES EN JAVA Y SE ESTA UTILIZANDO CAMELCASE
        String saludo ="¡Hola mundo ya soy programador Java!"; // Puede alamcenar un letras
        int longitud = saludo.length(); // cuenta la longitud del string
        char myChar = saludo.charAt(2); // muestra un solo caracter desde cierto indice
        boolean stringVacio = saludo.isEmpty(); // Por si el string esta vacio, nunca va a estar vacio por que le estamos insertando el texto
        boolean containsString = saludo.contains("pro"); // Nos muestra si el string contiene los caracteres 
        String substring = saludo.substring(2, 7); // Nos muestra lo que contiene dentro del indice incial y final
        String newstring = saludo.replace("o", "5"); // Reemplazar un caracter por otro
        System.out.println(saludo + longitud + "" + myChar + "" + substring + "" + newstring);
        
       
        // Variables primitivas
        int edad=25; // Tipo entero y tienen un valor mas pequeño
        System.out.println("Mi edad es: " + edad);
        
        float altura = 1.70f; // Variables con decimales, se le agrega una f para que sepa que es un tipo flotante
        System.out.println("Mi altura es: "+ altura);
        
        double valorDePi = 3.1467892; // acepta valores con muchos decimales
        System.out.println("El valor de PI es: " + valorDePi);
        
        long distanciaAlSol = 478288917552662L; // son tipo entero y tienen un valor mucho mas grande y se agrega un a L para que sepa que es un tipo entero
        System.out.println("La distancia la sol es: " + distanciaAlSol);
        
        boolean isDay = false; // Solo puede tener el valor de Verdadero o Falso
        System.out.println("Es de dia; " + isDay);
        
        char miIncial= 'e'; // Solo puede tener un Caracter
        System.out.println("La inicial de el nombre es: " + miIncial);
    
        
    }
    
}
