/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Media {
    // TODO LO QUE ESTE EN LAS CLASES PADRES SE PODRAN VER EN LAS CLASES HIJAS Y VA A PODER UTILIZAR SUS CAMPOS Y METODOS
    String titulo;
    String genero;
    int duracion;

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
    public void play(){
        System.out.println("Reproduciendo: "+ titulo);
    }
    public void pause(){
        System.out.println("Pausada: "+ titulo);
    }
    
    @Override
    public String toString(){
        return "El titulo de la media es: "+ titulo;
    }
    
}
