
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author juagsa
 */
public class Hilo  extends Thread{
    
    String nombre="JUAN";
    
    public void run(){
        
        for(int i=0;i<=10;i++){
            System.out.println(i+" ."+ nombre);
            
            try {
                Hilo.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
}
