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
        Movie toyStory= new Movie();
        Movie AntMan= new Movie( "AntMan", "Familiar",  90);
        Movie Hulk= new Movie( "Hulk", "Familiar",  120);
        
        int totalFrames = Movie.getTotalFrames(90);
        System.out.println(totalFrames);
        
        int frameResolution = Movie.FRAME_RESOLUTION; // Variable

    }
}
