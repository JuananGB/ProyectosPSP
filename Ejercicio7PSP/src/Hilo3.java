
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juagsa
 */
public class Hilo3 extends Thread {
    
    String nombre="Hilo3";
    
    @Override
    public void run(){
        
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". "+nombre);
            
            try {
                HIlo1.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
          
        }
        
        
    }
    
}

