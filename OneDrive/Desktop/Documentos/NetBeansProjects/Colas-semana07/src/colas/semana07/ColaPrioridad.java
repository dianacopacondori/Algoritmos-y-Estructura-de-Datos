/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas.semana07;

/**
 *
 * @author cvdia
 */
public class ColaPrioridad {
    private int[] cola;
    private int tamaño;
    private int capacidad;

    public ColaPrioridad(int capacidad) {
        this.capacidad = capacidad;
        cola = new int[capacidad];
        tamaño = 0;
    }

    // Enqueue con prioridad
    public void enqueue(int dato) {
        if (tamaño == capacidad) {
            System.out.println("Cola llena");
            return;
        }

        int i;

        // Ordenar de mayor a menor prioridad
        for (i = tamaño - 1; i >= 0 && cola[i] > dato; i--) {
            cola[i + 1] = cola[i];
        }

        cola[i + 1] = dato;
        tamaño++;

        System.out.println(dato + " agregado");
    }

    // Dequeue
    public int dequeue() {
        if (tamaño == 0) {
            System.out.println("Cola vacía");
            return -1;
        }

        int dato = cola[0];

        for (int i = 1; i < tamaño; i++) {
            cola[i - 1] = cola[i];
        }

        tamaño--;

        return dato;
    }

    public void mostrar() {
        System.out.print("Cola prioridad: ");

        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[i] + " ");
        }

        System.out.println();
    }
}
