
package ejercicio5psp;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author juagsa
 */
public class Ejecucion  {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        String comando = "";  

        
        while (!comando.equalsIgnoreCase("salir")) {
            // Obtener el comando desde la interfaz
            comando = Interfaz.introducirParametros();
            
            if (comando.equalsIgnoreCase("salir")) {
                System.out.println("Fin de programa");
                break;
            }
        
        ProcessBuilder pb=new ProcessBuilder("bash","-c",comando);
        
        Process p=pb.start();
        
        InputStream is=p.getInputStream();
        
        int c;
        
        while((c=is.read())!=-1){
            System.out.print((char)c);
        }
        p.waitFor();
    }
    }
}
