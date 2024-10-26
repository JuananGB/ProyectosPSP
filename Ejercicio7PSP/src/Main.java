/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juagsa
 */
public class Main {

    public static void main(String[] args) {

        HIlo1 h1 = new HIlo1();
        Hilo2 h2 = new Hilo2();
        Hilo3 h3 = new Hilo3();
        HIlo4 h4 = new HIlo4();
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        
        try{
            h1.join();
            h2.join();
            h3.join();
            h4.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("Todos los hilos han terminada");
    }

}
