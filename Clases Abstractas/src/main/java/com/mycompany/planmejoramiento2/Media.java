/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public abstract class Media {
    // TODO LO QUE ESTE EN LAS CLASES PADRES SE PODRAN VER EN LAS CLASES HIJAS Y VA A PODER UTILIZAR SUS CAMPOS Y METODOS
    private String titulo;
    private String genero;
    private int duracion;
    private String sypnosis;
    private String content = "";

    public Media(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public String getSypnosis(){
        return sypnosis;
    }
    public void setSypnosis(String sypnosis){
        this.sypnosis = sypnosis;
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
    public abstract void play(); // Las clases abstractas no se pueden instanciar
    
    public void pause(){
        printSomething("Pausada: "+ titulo);
    }
    public void setContent(String content){
        this.content = content;
    }
    
    public void printSomething(String something){
        System.out.println(something);
    }
    public void moveForward(int minutos){
        printSomething("Moving forward "+ minutos + "minutes");
    }
    
    @Override
    public String toString(){
        return "El titulo de la media es: "+ titulo;
    }
    
}
