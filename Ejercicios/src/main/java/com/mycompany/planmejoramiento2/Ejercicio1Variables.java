/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Ejercicio1Variables {
    public static void main(String[] args) {
        /**1. Supongamos que un cubo rectangular tiene las dimensiones: largo=15, ancho=23,alto=12. Obtén su volumen.
        /RESPUESTA
        int a = 15;
        int b = 23;
        int c = 12;
        
        int volumen = a * b * c;
        //System.out.println("El volumen es: " + volumen);
        System.out.println(String.format("El volumen es %d ", volumen));
        */
        
        /**2. Obtén la energía cinética si la masa es m = 12 kg y la velocidad es v = 3 m/s,
        imprime el resultado con solo 2 decimales, la fórmula de la energía cinética es
        Ec = 1/2 * m * v2
        * "RESPUESTA"
        int m = 12;
        int v = 3;
        double ec = (m * Math.pow(v, 2))/2.0;
        System.out.println(String.format("La energía cinética es %.2f ", ec));
        */
        
        /**3. Qué tipos variables utilizarías para los siguiente valores? Ejemplo: Si tenemos 1
        usamos una variable de tipo int.
        a. ‘R’
        b. 1495970192837664
        c. 12.5
        d. true
        e. 90
        f. “No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey”
        g. 6.626070040
        * "RESPUESTA"
        a. char
        b. long
        c. float o double
        d. boolean
        e. int
        f. String
        g. double
        */
        /**
         * Supongamos que promueves tu empresa en Google y debes calcular el costo
        promedio para 180 clics, donde los clics tienen los siguientes costos
        60 clics = $0.30 cada uno
        100 clics = $0.25 cada uno
        20 clics = $0.80 cada uno
        Imprime el costo promedio que tendrás. Puedes encontrar la definición de costo
        promedio aquí:
        https://support.google.com/google-ads/answer/14074?hl=es-419
        Calcúlalo de manera que debas incluir el IVA aparte, donde el IVA es 16% del total,
        es decir, deberás calcular total + IVA, imprime el resultado a dos decimales.
        Ejemplo: Si tu total es de $100.00, el total + IVA es $116.00
         * "RESPUESTA"
        double subtotal = (60 * 0.30) + (100 * 0.25) + (20 * 80);
        double iva = subtotal * 0.16;
        double total = subtotal + iva;
        System.out.println(String.format("Total a pagar $%.2f ", subtotal));
         */
        
    }
}
