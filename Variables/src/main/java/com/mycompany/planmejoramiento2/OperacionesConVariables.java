/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class OperacionesConVariables {
    
    public static void main(String[] args) {
        
        //Rectangulo
        int b = 15;
        int a = 8;
        
        //Area
        int rArea = b * a; // Se multiplican los valores de las variables
        
        //Perimetro
            //int rPerimetro= b + a + b + a; Se suman todos los valores de las variables
        int rPerimetro = (2 * b) + (2 * a); // Se multiplica los valores de las variables por 2 
        
        //Triangulo
        b = 5;
        a = 3;
        
        //Area
        double tArea = b * a / 2.0; // Se le coloca el .0 para que sepa que queremos un tipo doble
        
        System.out.println(rArea);
        System.out.println(rPerimetro);
        System.out.println(tArea);
    }
}
