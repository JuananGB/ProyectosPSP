
package ejercicio4psp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class Ejercicio4PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce un parámetro a tu elección: ");
        String parametro=sc.nextLine();
        
        ProcessBuilder pb= new ProcessBuilder("bash","-c",parametro);
        
        Process p=pb.start();
        
        InputStream is=p.getInputStream();
        
        int c;
        
        while((c=is.read())!=-1){
            System.out.print((char)c);
        }
        is.close();
        
        System.out.println("Por favor introduce salir para terminar el programa: ");
        String finalProceso=sc.nextLine().toLowerCase();
        
        
        while(!finalProceso.equals("salir")){
            System.out.println("Porfavor repite otra vez");
            finalProceso=sc.nextLine();
        }
       
        System.exit(0);
    }
    
}
