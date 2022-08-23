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
    public int getTotalFrames(){
        return this.duracion * 60 * 60;
    }
    @Override
    public String toString(){
        return "La pelicula es: "+ titulo+",y el genero es: "+genero+",duracion: "+duracion;
    }
}   
    

