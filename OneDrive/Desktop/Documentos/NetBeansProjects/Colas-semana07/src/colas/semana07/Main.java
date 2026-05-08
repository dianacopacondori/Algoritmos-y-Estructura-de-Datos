/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas.semana07;

/**
 *
 * @author cvdia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("----Cola Circular----");

        ColaCircular cc = new ColaCircular(5);

        cc.enqueue(10);
        cc.enqueue(20);
        cc.enqueue(30);

        cc.mostrar();

        System.out.println("Dequeue: " + cc.dequeue());

        cc.mostrar();

        
        System.out.println("\n----Cola Lista Enlazada----");

        ColaLista cl = new ColaLista();

        cl.enqueue(100);
        cl.enqueue(200);
        cl.enqueue(300);

        cl.mostrar();

        System.out.println("Dequeue: " + cl.dequeue());

        cl.mostrar();


        System.out.println("\n----Cola Prioridad----");

        ColaPrioridad cp = new ColaPrioridad(5);

        cp.enqueue(40);
        cp.enqueue(10);
        cp.enqueue(30);
        cp.enqueue(20);

        cp.mostrar();

        System.out.println("Dequeue: " + cp.dequeue());

        cp.mostrar();
    }
    
}
