/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;



/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        // TODO LO QUE SE VAYA A MOSTRAR DEBE DE SER LLAMADA EN LA CLASE PRINCIPAL
        Movie toyStory= new Movie("titulo: Toy Story","Ciencia Ficcion",90);
        
        toyStory.setTitulo("Toy Story");
        toyStory.setGenero("Ciencia Ficcion");
        toyStory.setWonOscar(true);
        
        Series academyUmbrella = new Series("The Umbrella Academy", "Ciencia Ficcion", 45, 10,4);
        academyUmbrella.setTitulo("The Umbrella Academy");
        academyUmbrella.setGenero("Ciencia Ficcion");
        academyUmbrella.setEpisodiosDuracion(45);
        academyUmbrella.setTotalEpisodios(10);
        academyUmbrella.setTotalTemporada(4);
        
       /** System.out.println(toyStory.toString());
        System.out.println(academyUmbrella.toString());
        
        toyStory.play();
        toyStory.pause();
        
        academyUmbrella.play();
        academyUmbrella.pause();*/
       
       academyUmbrella.moveForward();
       Media media = new Media("Batman", "accion", 120);
       String titulo = media.getTitulo();
       String genero = media.getGenero();
       int duracion = media.getDuracion();
       
       media.moveForward(15);
    }
}
