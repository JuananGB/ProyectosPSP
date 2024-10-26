
package ejercicio1psp;

/**
 *
 * @author juagsa
 */
public class Ejercicio1PSP {

    
    public static void main(String[] args) {
       
        Runtime r = Runtime.getRuntime();
          
        //La memoria total, la memoria libre y la memoria en uso expresados en MiB.
       
        System.out.println("Memoria Total: "+ r.totalMemory()+" MiB");
        System.out.println("Memoria libre: "+ r.freeMemory()+ " MiB");
        
        long mTotal = r.totalMemory();
        
        long mLibre=  r.freeMemory(); 
       
        long mUso= mTotal - mLibre;
        
        System.out.println("Memoria en uso: "+ mUso + " MiB");
        
        
        //El número de procesadores disponibles para la JVM.
        
        System.out.println("Procesadores en uso: "+ r.availableProcessors());
        
        //Funciones de la clase System(Estatica)
        
        System.out.println(System.currentTimeMillis());
        
        System.out.println("SO: "+ System.getProperty("os.name"));
        System.out.println("Java version: "+ System.getProperty("java.version"));
        
        System.exit(0); // Terminar programa
        
        
        
        
    }
    
}
