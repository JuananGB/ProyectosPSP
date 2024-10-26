package ejercicio8psp;

import java.util.Random;

public class Hilos extends Thread {
    
    String nombreHilo;
    int nivel;
    Thread hijo;
    Random random = new Random();

    public Hilos(String nombre, int nivel) {
        this.nombreHilo = nombre;
        this.nivel = nivel;
    }

    @Override
    public void run() {
        try {
            
            System.out.println(nombreHilo+ " ha comenzado.");

            // Crear el siguiente hilo hijo si no estamos en el nivel 5
            if (nivel < 5) {
                hijo = new Hilos("Hilo " + (nivel + 1), nivel + 1);
                hijo.start(); // Iniciar el hilo hijo
                
                
            }

            for (int i = 1; i <= 10; i++) {
                Thread.sleep(random.nextInt(500) + 100); // Espera entre 100 y 600 milisegundos
            }

            // Esperar a que el hijo termine antes de finalizar
            if (hijo != null) {
                hijo.join(); 
            }
            System.out.println(nombreHilo + " ha finalizado.");
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


