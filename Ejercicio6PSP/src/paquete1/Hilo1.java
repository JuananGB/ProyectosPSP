/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Random;


/**
 *
 * @author juagsa
 */
public class Hilo1 extends Thread {
    
    
    String nombreHilo1="Hilo1";
    
    Random r=new Random();
    
    long nAleatorio=r.nextLong(10)+1; // NUmeros entre 1-10;
    
    long conversion = nAleatorio *1000;
    
    @Override
    public void run(){
        
        for(int i=0;i<=10;i++){
            System.out.println(i+","+nombreHilo1);
            
         
            try {
                Hilo1.sleep(conversion);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("");
        
    }
    
    
    
}
