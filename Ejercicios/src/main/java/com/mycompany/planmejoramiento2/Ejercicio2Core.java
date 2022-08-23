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
public class Ejercicio2Core {
    public static void main(String[] args) {
        /**
         * 1. Crea un programa que te pida una cantidad en miligramos para una poción
            multijugos, el valor debe ser de tipo entero, si el valor es mayor a 100 imprime
            “¡Felicidades, es una buena poción!”, de lo contrario imprime “La poción es
            mediocre, sangre sucia inmunda”.
            * RESPUESTA
            *  int miligramos=1;

                if (miligramos > 100)
                {
                 System.out.println("¡Felicidades, es una buena poción!");
                }
                else
                {
                    System.out.println("La poción es mediocre, sangre sucia inmunda");
                }
        */
        /** EJERCICIO 2
         * Escribe un programa que te diga si un carro de Uber puede iniciar su recorrido, para
            esto se necesitan dos cosas, que el conductor esté cerca y que esté disponible, el
            programa te pedirá dos valores, la distancia del conductor en kilómetros y su
            disponibilidad, donde false = no disponible y true = disponible, según los datos que
            insertes imprime lo siguiente:
            ➢ Si la distancia es menor o igual a 0.5 km y el conductor está disponible,
            imprime “Listo para iniciar recorrido”
            ➢ Si la distancia es menor o igual a 0.5 km y el conductor NO está disponible,
            imprime, “Conductor cercano, pero no disponible”
            ➢ Si la distancia es mayor a 0.5 km y el conductor está disponible, imprime,
            “Conductor disponible pero muy lejos, aplicarán tarifas más altas”
            ➢ Si la distancia es mayor a 0.5 km y el conductor NO está disponible, imprime,
            “No hay conductores disponibles”
            ➢ Usa if-else para esto
            ➢ Para negar una validación debes usar el símbolo !, por ejemplo if
            (!isAvailable)
            ➢ No olvides imprimir las instrucciones antes de pedir las variables de entrada
         */
         /**Scanner myScanner=new Scanner(System.in);

         System.out.println("Insertar Distancia del conductor");
         double dist_conductor=myScanner.nextDouble();

         System.out.println("Esta disponible el conductor: Escribir true o false");
         boolean disponibilidad =myScanner.nextBoolean();

        if (disponibilidad=true  && dist_conductor <=0.50 ){
            System.out.println("Listo para iniciar recorrido");
        }else if (disponibilidad && dist_conductor <=0.50 ){
            System.out.println("Conductor cercano, pero no disponible");
        } else if (disponibilidad && dist_conductor >0.50 ){
            System.out.println("Conductor disponible pero muy lejos, aplicarán tarifas más altas");
        } else if (!disponibilidad  && dist_conductor >0.50 ){
            System.out.println("No hay conductores disponibles");
        }*/
         /**EJERCICIO 3
          * Haz un ciclo for y while que obtenga la sumatoria de los números hasta n, ejemplo,
            para 5 debes obtener 15 (1+2+3+4+5), para 3 debes obtener 6. Imprime el resultado
            así: “La suma es 15” usando formatos de String
            * System.out.println("Introducir un numero entero");
            RESPUESTA
            * int n=myScanner.nextInt();
            int suma=0;
            for (int a=0; a<=n;a++)
            {
                suma+=a;
            }

            System.out.println(String.format("La Suma total es %d",suma));
          */
         /** EJERCICIO 4
          * Escribe un programa que imprima “¿Cómo es el clima de hoy?”, dependiendo del
            número que insertes te imprima los siguientes valores
            ➢ 1 = “Soleado”
            ➢ 2 = “Nublado”
            ➢ 3 = “Lluvioso”
            ➢ 4 = “Tormentoso”
            ➢ 5 = “Nevado”
            Si insertas cualquier otro valor debe imprimir “Pregúntale a Google”
            Recomendación: Usa Switch.
            * RESPUESTA
            * System.out.println("como es clima de hoy");
            int clima=myScanner.nextInt();


            switch (clima)
            {
                case 1:
                    System.out.println("Soleado");
                     break;
                case 2:
                    System.out.println("Nublado");
                    break;
                case 3:
                    System.out.println("Lluvioso");
                    break;
                case 4:
                    System.out.println("Tormentoso");
                    break;
                case 5:
                    System.out.println("Nevado");
                    break;
                default:
                    System.out.println("Preguntale a Google");
            }
          */
         /**EJERCICIO 5
          * Para un Arreglo de String de títulos de películas, imprime el título de la película con
            el título más largo. Por ejemplo si tenemos un arreglo con los valores:
            {“Jumanji”, “Toy Story”, “Pulp Fiction”, “Batman: El caballero de la noche”, “Kill Bill”}
            Debería imprimir “Batman: El caballero de la noche”.
            RETO OPCIONAL: Imprime el índice del título más largo, para el ejemplo anterior,
            debería imprimir el 3, porque es el índice de “Batman: El caballero de la noche”
          *RESPUESTA
            * String[] tituloarreglo=new String[]{"Jumanji","Toy Story","Pulp Fiction",
             "Batman: El caballero de la noche", "Kill Bill"};
             int longitud_total =tituloarreglo.length;

              String titulo_mayor="";
              int indice_titulo_mayor=0;
            for (int i=0 ;i<=longitud_total-1;i++)
            {


            if (tituloarreglo[i].length() > titulo_mayor.length()    )
            {
                titulo_mayor=tituloarreglo[i];
                indice_titulo_mayor=i;

            }

            }
            System.out.println("El titulo mas largo es: "+titulo_mayor +"y esta en el indice numero "+indice_titulo_mayor);
          */
         /** EJERCICIO 6
          * EJERCICIO RETO SUPER SAYAYÍN: Escribe un programa que para un número N,
            imprima los números pares desde 1 hasta N, por ejemplo si N = 6, debe imprimir “2,
            4, 6”. Hazlo con un for o un while. Si el número es menor o igual a 0, debes imprimir
            “Inserta un número positivo”
            TIP: Para saber si un número es par, debes obtener el residuo de ese número al ser
            dividido entre 2, si el residuo es 0, entonces el número es par. Por ejemplo si quieres
            saber si 4 es par, divides 4/2 = 2 y te sobran 0, entonces 4 es par, en cambio para
            5/2 = 2 y sobra 1, entonces es impar, para obtener el residuo de una división en Java
            puedes utilizar %, ejemplo: 4 % 2 = 0 y 5 % 2 = 1.
          *RESPUESTA
          *  System.out.println("Escribir un numero para decirte los pares ");
             int numero_par=myScanner.nextInt();
             if (numero_par > 0 )
             { int par=1;
             while(par <=numero_par)
             {
                if (par%2==0 )
                {
                    System.out.println(" " +par);
                }
             par++;
             }
            }
            else {

            System.out.println("Debes introducir un numero mayor que Cero (0) ");
            numero_par=myScanner.nextInt();
            }
          */
         
    }
}
