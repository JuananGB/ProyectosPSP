
package ejercicio3psp;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author juagsa
 */
public class Ejercicio3PSP {

   
    public static void main(String[] args) throws IOException {
        
    // 1. Muestra el directorio de trabajo y la propiedad user.dir por defecto.
           //ProcessBuilder pb=new ProcessBuilder("bash","-c","ls");
   
    //2.  Muestra el directorio de trabajo y la propiedad user.dir después de cambiar 
    //    el valor de la propiedad user.dir a la carpeta home del usuario
        
           // ProcessBuilder pb= new ProcessBuilder("bash","-c","ls /home/juagsa");
            
    //3   Muestra el directorio de trabajo y la propiedad user.dir después de después 
    //    de cambiar el directorio de trabajo al directorio temporal (c:/temp o /tmp).

    
            ProcessBuilder pb= new ProcessBuilder("bash","-c","ls /tmp");
        
            Process p=pb.start();

            InputStream is=p.getInputStream();

            int c;

            while((c=is.read())!=-1){
                System.out.print((char)c);
            }
        
      
        
        
        
        
        
        
       
        
        
        
        
    }
    
}
