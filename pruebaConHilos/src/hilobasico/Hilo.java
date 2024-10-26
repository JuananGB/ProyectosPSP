/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilobasico;

/**
 *
 * @author juagsa
 */
public class Hilo extends Thread {
    
    int n;
    int i=0;
    
    public Hilo(int nHilo){
        this.n=nHilo;
    }
    
    @Override
    public void run(){
        
        while(i<=n){
            System.out.println("Hola esta es mi "+i+" línea de ejecución");
            i++;
        }
    }
   
}
