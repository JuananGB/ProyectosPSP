
package ejercicio5psp;

import java.util.Scanner;


public class Interfaz {
    
    public static String introducirParametros(){
         
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el comando y los parámetros a ejecutar: ");
        String comando = sc.nextLine();   
        return comando;
    }
    
    
}
