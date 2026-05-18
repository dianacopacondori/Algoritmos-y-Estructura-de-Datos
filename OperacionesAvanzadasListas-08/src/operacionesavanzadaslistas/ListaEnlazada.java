/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesavanzadaslistas;

/**
 *
 * @author cvdia
 */
public class ListaEnlazada {

    Nodo cabeza;

    // crear lista vacía
    public ListaEnlazada() {
        cabeza = null;
    }

    // insertar al final
    public void insertar(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        // validar límites de recorrido
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    // mostrar lista
    public void mostrar() {

        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = cabeza;

        System.out.print("Lista: ");

        // límite para evitar ciclos infinitos
        int contador = 0;
        int limite = 100;

        while (actual != null && contador < limite) {

            System.out.print(actual.dato + " -> ");

            actual = actual.siguiente;
            contador++;
        }

        System.out.println("NULL");
    }

    // 1. Invertir lista
    public void invertir() {

        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;

        // Verificar null
        while (actual != null) {

            siguiente = actual.siguiente;

            actual.siguiente = anterior;

            anterior = actual;
            actual = siguiente;
        }

        cabeza = anterior;

        System.out.println("Lista invertida");
    }

    // 2. Detección de ciclos - Floyd
    public boolean detectarCiclo() {

        Nodo lento = cabeza;
        Nodo rapido = cabeza;

        // Verificar null
        while (rapido != null
                && rapido.siguiente != null) {

            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;

            if (lento == rapido) {
                return true;
            }
        }

        return false;
    }

    // Crear ciclo para prueba
    public void crearCiclo() {

        if (cabeza == null) {
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        // Conectar ultimo nodo al segundo
        if (cabeza.siguiente != null) {
            actual.siguiente = cabeza.siguiente;
        }
    }

    // 3. Fusionar listas ordenadas
    public static ListaEnlazada fusionar(
            ListaEnlazada lista1,
            ListaEnlazada lista2) {

        ListaEnlazada resultado = new ListaEnlazada();

        Nodo n1 = lista1.cabeza;
        Nodo n2 = lista2.cabeza;

        // Comparar nodos
        while (n1 != null && n2 != null) {

            if (n1.dato <= n2.dato) {

                resultado.insertar(n1.dato);
                n1 = n1.siguiente;

            } else {

                resultado.insertar(n2.dato);
                n2 = n2.siguiente;
            }
        }

        // Agregar restantes
        while (n1 != null) {
            resultado.insertar(n1.dato);
            n1 = n1.siguiente;
        }

        while (n2 != null) {
            resultado.insertar(n2.dato);
            n2 = n2.siguiente;
        }

        return resultado;
    }
}
