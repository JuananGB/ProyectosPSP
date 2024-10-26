
package cambiarNombreHilo;

/**
 *
 * @author juagsa
 */
public class HIlo extends Thread {
    
    public HIlo(String nombre){
        super(nombre);
    }
    
    @Override
    public void run(){
        System.out.println("Hola soy el hilo "+getName());
    }
    
}
