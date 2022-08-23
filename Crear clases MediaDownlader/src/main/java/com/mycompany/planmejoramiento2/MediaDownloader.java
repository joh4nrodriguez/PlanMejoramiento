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
    /**
     * Las clases deberían dedicarse solamente
     * a entregar su información y hacer operaciones que involucren su misma información es decir sus campos.
     */
    public interface DownloadListener{
        void onMediaDownload(String content);  
    }
    public static void dowload(String mediaTitulo, DownloadListener downloadListener){
        Thread thread = new Thread (new Runnable () { 
            @Override 
            public void run() {
                System.out.println("Dowloadong "+ mediaTitulo);
            try{
            Thread.sleep(10000);  
            }catch (InterruptedException e){
            e.printStackTrace();
            }
            System.out.println(mediaTitulo +  "Dowlanded!" );
            String content = "Un tipo le matan su perrito y va y mata a todos";
            downloadListener.onMediaDownload(content);
            }
        });{
        thread.start();
        }
        
    }
}
