/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class OperacionesConVariablesClaseMath {
    
    public static void main(String[] args) {
        //Rectangulo
        int b = 15;
        int a = 8;
        
        //Area
        int rArea = b * a;
        
        //Perimetro
        int rPerimetro = (2 * b) + (2 * a);
        
        //Triangulo
        b = 5;
        a = 3;
        
        //Area
        double tArea = b * a / 2.0;
        
        //Circulo 
        int r = 60;
        
        //Area
        // MATH TIENE MUCHAS FUNCIONES MATEMATICAS
        double pi = Math.PI; // Por si no sabemos el valor de PI
        double cArea = pi * Math.pow(r, 2); //  pow, Numero elevado a cierta potencia, Pow regresa valores de tipo doble
        
        System.out.println(cArea);
        
        //Hipotenusa
        //Raiz cuadrada de la suma de los catetos
        
        //Triangulo
        b = 5;
        a = 3;
        
        double sumaCatetos = Math.pow(a, 2) + Math.pow(b, 2); // Numero elevado a cierta potencia 
        double area = Math.sqrt(sumaCatetos); // sqrt obtiene la raiz cuadrada de los catetos
        
        System.out.println(area);
    }
}
