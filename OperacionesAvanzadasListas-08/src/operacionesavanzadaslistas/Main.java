/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesavanzadaslistas;

/**
 *
 * @author cvdia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n---DETECCION DE CICLOS---");

        ListaEnlazada listaCiclo
                = new ListaEnlazada();

        listaCiclo.insertar(1);
        listaCiclo.insertar(2);
        listaCiclo.insertar(3);
        listaCiclo.insertar(4);

        System.out.println(
                "hay ciclo?: "
                + listaCiclo.detectarCiclo()
        );

        listaCiclo.crearCiclo();

        System.out.println(
                "hay ciclo?: "
                + listaCiclo.detectarCiclo()
        );

        System.out.println("\n--INVERTIR LISTA--");

        ListaEnlazada lista = new ListaEnlazada();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);

        lista.mostrar();

        lista.invertir();

        lista.mostrar();


        System.out.println("\n---FUSION DE LISTAS---");
        ListaEnlazada lista1
                = new ListaEnlazada();

        ListaEnlazada lista2
                = new ListaEnlazada();

        lista1.insertar(1);
        lista1.insertar(3);
        lista1.insertar(5);

        lista2.insertar(2);
        lista2.insertar(4);
        lista2.insertar(6);

        System.out.println("Lista 1:");
        lista1.mostrar();

        System.out.println("Lista 2:");
        lista2.mostrar();

        ListaEnlazada fusionada
                = ListaEnlazada.fusionar(
                        lista1,
                        lista2
                );

        System.out.println("Lista fusionada:");
        fusionada.mostrar();
    }

}
