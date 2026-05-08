/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadas;

/**
 *
 * @author cvdia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Inserciones
        lista.insertarInicio(10);
        lista.insertarInicio(5);

        lista.insertarFinal(20);
        lista.insertarFinal(30);

        lista.insertarPosicion(15, 2);

        lista.mostrarLista();

        // Eliminaciones
        lista.eliminarInicio();
        lista.mostrarLista();

        lista.eliminarFinal();
        lista.mostrarLista();

        lista.eliminarValor(15);
        lista.mostrarLista();

        // Casos especiales
        lista.eliminarValor(100);

        lista.insertarPosicion(50, 10);

        lista.mostrarLista();
    }

}
