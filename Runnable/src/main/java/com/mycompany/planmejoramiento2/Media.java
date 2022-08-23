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
    private String titulo;
    private String genero;
    private int duracion;
    private String sypnosis;

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
    public void play(){
        printSomething("Reproduciendo: "+ titulo);
    }
    public void pause(){
        printSomething("Pausada: "+ titulo);
    }
    public void dowload(){
        Thread thread = new Thread (new Runnable () { // Thread-Hilo
            @Override
            public void run() {
                System.out.println("Dowloadong "+ titulo);
            try{
            Thread.sleep(10000); // Le estamos diciendo que se duerma por 5 segundos 
            }catch (InterruptedException e){
            e.printStackTrace();
            }
            System.out.println(titulo +  "Dowlanded!" );
            }
        });{
        thread.start();
        }
         
    }
    private void printSomething(String something){
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
