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
    
    int totalEpisodios;
    int totalTemporada;
    int episodiosDuracion;

    public Series(String titulo, String genero, int duracion, int totalEpisodios, int totalTemporada) {
        super(titulo, genero, duracion); // Tiene que ver con el padre de la clase
        this.totalEpisodios = totalEpisodios;
        this.totalTemporada = totalTemporada;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
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
