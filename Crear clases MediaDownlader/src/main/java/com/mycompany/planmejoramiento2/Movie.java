/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class Movie extends Media{
    private boolean wonOscar;

    public Movie(String titulo, String genero, int duracion) {
        super(titulo, genero, duracion);
    }
    @Override // Sobreescribir, que se va a utilizar varias veces
    public int getDuracion(){
        return super.getDuracion();
    }
    
    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }
    
    
    
}   
    

