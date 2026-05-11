/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas.semana07;

/**
 *
 * @author cvdia
 */
public class ColaCircular {
    private int[] cola;
    private int frente;
    private int fin;
    private int tamaño;
    private int capacidad;

    public ColaCircular(int capacidad) {
        this.capacidad = capacidad;
        cola = new int[capacidad];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    public void enqueue(int dato) {
        if (estaLlena()) {
            System.out.println("La cola está llena");
            return;
        }

        fin = (fin + 1) % capacidad;
        cola[fin] = dato;
        tamaño++;

        System.out.println(dato + " agregado a la cola");
    }

    public int dequeue() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }

        int dato = cola[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;

        return dato;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public boolean estaLlena() {
        return tamaño == capacidad;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }

        System.out.print("Cola: ");

        for (int i = 0; i < tamaño; i++) {
            System.out.print(
                cola[(frente + i) % capacidad] + " "
            );
        }

        System.out.println();
    }

}
