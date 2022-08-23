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
public class Series extends Media{
    
    private int totalEpisodios;
    private int totalTemporada;
    private int episodiosDuracion;

    public Series(String titulo, String genero, int duracion, int totalEpisodios, int totalTemporada) {
        super(titulo, genero, duracion); // Tiene que ver con el padre de la clase
        this.totalEpisodios = totalEpisodios;
        this.totalTemporada = totalTemporada;
        episodiosDuracion = duracion;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }
    @Override
    public int getDuracion(){
        return episodiosDuracion * totalEpisodios * totalTemporada;
    }
    @Override
    public void play(){
     System.out.println("Numero de capitulo a reproducir?");
     Scanner scanner = new Scanner(System.in);   
     int episodeIndex = scanner.nextInt();
     printSomething("Reproduciendo: "+ super.getTitulo());
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public int getTotalTemporada() {
        return totalTemporada;
    }

    public void setTotalTemporada(int totalTemporada) {
        this.totalTemporada = totalTemporada;
    }

    public int getEpisodiosDuracion() {
        return episodiosDuracion;
    }

    public void setEpisodiosDuracion(int episodiosDuracion) {
        this.episodiosDuracion = episodiosDuracion;
    }
    public void moveForward(){
        System.out.println("Cuantos minutos quieres adelantar?");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        super.moveForward(minutes);
    }
    
}
