/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas.semana07;

/**
 *
 * @author cvdia
 */
public class ColaLista {
    private Nodo frente;
    private Nodo fin;

    public ColaLista() {
        frente = null;
        fin = null;
    }

    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println(dato + " agregado");
    }


    public int dequeue() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return -1;
        }

        int dato = frente.dato;

        // Liberar referencia del nodo eliminado
        Nodo temp = frente;
        frente = frente.siguiente;
        temp.siguiente = null;

        if (frente == null) {
            fin = null;
        }

        return dato;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void mostrar() {
        Nodo actual = frente;

        System.out.print("Cola: ");

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }

        System.out.println();
    }
}
