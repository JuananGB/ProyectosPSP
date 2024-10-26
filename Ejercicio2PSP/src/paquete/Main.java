
package paquete;

import java.io.File;
import java.io.IOException;
import java.io.InputStream; 

/**
 *
 * @author juagsa
 */
public class Main {
    public static void main(String[] args) throws IOException {
       
        
        File fichero = new File("/home/juagsa/NetBeansProjects/ProyectosPSP/Ejercicio2PSP/texto1.txt");
        
        if(!fichero.exists()){
            
            ProcessBuilder pb=new ProcessBuilder("bash","-c","touch /home/juagsa/NetBeansProjects/ProyectosPSP/Ejercicio2PSP/texto1.txt");
            Process p=pb.start();
        }else{
            
            ProcessBuilder pb=new ProcessBuilder("bash","-c","gedit /home/juagsa/NetBeansProjects/ProyectosPSP/Ejercicio2PSP/texto1.txt");
            Process p=pb.start();
            
            System.out.println("Fichero ya creado");
            
        }
    }
    
}
