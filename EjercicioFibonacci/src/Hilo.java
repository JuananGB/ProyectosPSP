
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author juagsa
 */
public class Hilo extends Thread {
    
    int nMaximo;
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void run(){
        System.out.println("Digite el máximo de números que tendrá la sucesión: ");
        nMaximo=sc.nextInt();
        
        int n1=1;
        
        int n2=1;
        
        System.out.print(n1+","+n2);
        
        
        for(int i=2;i<=nMaximo;i++){
            int sucesion=n1+n2;
            
            System.out.print(","+sucesion);
            
            n1=n2;
            n2=sucesion;
            
            try {
                Hilo.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
           
    }
    
}
