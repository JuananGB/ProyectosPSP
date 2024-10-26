
package paquete1;

import java.util.Random;


/**
 *
 * @author juagsa
 */
public class Hilo2 extends Thread {
    
    
    String nombreHilo2="Hilo2";
    
    Random r=new Random();
    
    long nAleatorio=r.nextLong(10)+1; // NUmeros entre 1-10;
    
    long conversion = nAleatorio *1000;
    
    @Override
    public void run(){
        
        for(int i=0;i<=10;i++){
            System.out.println(i+","+nombreHilo2);
            
            try {
                Hilo1.sleep(conversion);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("");
        
    }
    
    
    

}

