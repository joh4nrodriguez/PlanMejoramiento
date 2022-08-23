/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Movie {
    // METODOS Y VARIABLES ESTATICAS
    // LOS METODOS NO ESTATICOS SE CARGAN CUANDO UNO LOS LLAMA
    static final int FRAME_RESOLUTION = 60; //snake_case
    static final int SECONDS_IN_A_MINUTE = 60;// CONSTANTES ESTATICAS Y VAN CON MAYUSCULAS
    
    String titulo;
    String genero;
    int duracion;

    public Movie(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
         this.duracion = 0;
    }
    
    public Movie(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
     
    public Movie() {
        this.titulo = " No titulo";
        this.genero = "No genero";
        this.duracion = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public String play() { 
         System.out.println("Viendo pelicula: "+ titulo); 
        return null;
    }
    
    public String pause() { 
         System.out.println("Pausa pelicula: "+ titulo);
        return null;
    }
    public static int getTotalFrames(int duracion){
       return duracion * FRAME_RESOLUTION * SECONDS_IN_A_MINUTE;
    }
    @Override
    public String toString(){
        return "La pelicula es: "+ titulo+",y el genero es: "+genero+",duracion: "+duracion;
    }
}   
    

