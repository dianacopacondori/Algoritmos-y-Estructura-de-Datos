/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas;

/**
 *
 * @author cvdia
 */
public class ListaEnlazada {

    Nodo cabeza;

    // Constructor -> lista vacía
    public ListaEnlazada() {
        cabeza = null;
    }

    public void insertarInicio(int dato) {

        Nodo nuevo = new Nodo(dato);

        nuevo.siguiente = cabeza;
        cabeza = nuevo;

        System.out.println(dato + " insertado al inicio");
    }

    public void insertarFinal(int dato) {

        Nodo nuevo = new Nodo(dato);

        // Verificar lista vacía
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        // Recorrer hasta el último nodo
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;

        System.out.println(dato + " insertado al final");
    }

    public void insertarPosicion(int dato, int posicion) {

        Nodo nuevo = new Nodo(dato);

        // Insertar al inicio
        if (posicion == 0) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;
        int contador = 0;

        // Verificar puntero NULL
        while (actual != null && contador < posicion - 1) {
            actual = actual.siguiente;
            contador++;
        }

        // Posición inválida
        if (actual == null) {
            System.out.println("Posición inválida");
            return;
        }

        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;

        System.out.println(dato + " insertado en posición " + posicion);
    }

    public void eliminarInicio() {

        // Verificar lista vacía
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo temp = cabeza;

        cabeza = cabeza.siguiente;

        // Liberar referencia
        temp.siguiente = null;

        System.out.println("Nodo eliminado al inicio");
    }

    public void eliminarFinal() {

        // Lista vacía
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        // Un solo nodo
        if (cabeza.siguiente == null) {
            cabeza = null;
            return;
        }

        Nodo actual = cabeza;

        // Llegar al penúltimo nodo
        while (actual.siguiente.siguiente != null) {
            actual = actual.siguiente;
        }

        // Liberar referencia
        actual.siguiente = null;

        System.out.println("Nodo eliminado al final");
    }

    public void eliminarValor(int dato) {

        // Lista vacía
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        // Eliminar cabeza
        if (cabeza.dato == dato) {

            Nodo temp = cabeza;
            cabeza = cabeza.siguiente;

            temp.siguiente = null;

            System.out.println("Nodo eliminado");
            return;
        }

        Nodo actual = cabeza;

        // Buscar nodo anterior
        while (actual.siguiente != null
                && actual.siguiente.dato != dato) {

            actual = actual.siguiente;
        }

        // No encontrado
        if (actual.siguiente == null) {
            System.out.println("Dato no encontrado");
            return;
        }

        Nodo temp = actual.siguiente;

        actual.siguiente = temp.siguiente;

        // Liberar referencia
        temp.siguiente = null;

        System.out.println("Nodo eliminado");
    }

    public void mostrarLista() {

        // Verificar lista vacía
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = cabeza;

        System.out.print("Lista: ");

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("NULL");
    }
}
