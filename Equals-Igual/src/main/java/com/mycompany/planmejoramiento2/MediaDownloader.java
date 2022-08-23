/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planmejoramiento2;

/**
 *
 * @author Administrator
 */
public class MediaDownloader {
    public interface DownloadListener{
        void onMediaDownload(Media media,String content);  
    }
    public static void dowload(Media media, DownloadListener downloadListener){
        Thread thread = new Thread (new Runnable () { 
            @Override 
            public void run() {
                System.out.println("Dowloadong "+ media.getTitulo());
            try{
            Thread.sleep(10000);  
            }catch (InterruptedException e){
            e.printStackTrace();
            }
            System.out.println(media.getTitulo() +  "Dowlanded!" );
            String content = "Un tipo le matan su perrito y va y mata a todos";
            downloadListener.onMediaDownload(media, content);
            }
        });{
        thread.start();
        }
        
    }
}
