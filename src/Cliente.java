import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cliente {
    
    public static void main(String[] args) {
        //Main actua como el "cliente" en el patron.

        //Creacion de dos listas, utilizando Component (lo usa adentro de crearLista)
        int tope1 = generarNumero(1,10);
        int tope2 = generarNumero(tope1,tope1+5);
        List<Lista> l1 = crearLista(1,tope1);
        List<Lista> l2 = crearLista(tope1,tope2);

        //crea una lista grande con las 2 sublistsa (l1,l2)
        List<Lista> unaLista = new ArrayList<>();
        //pos0
        unaLista.add(new ListaCompuesta(l1, "SubLista 1"));
        //pos1
        unaLista.add(new ListaCompuesta(l2, "SubLista 2"));

        List<Lista> subItems = new ArrayList<>();
        subItems.add(new Item("Subitem 1.1"));
        subItems.add(new Item("Subitem 1.2"));

        // Preguntar si esta bien lo de abajo, lo hicimos para generar la sublista 1.1.
        // Agrega una "sublista1.1 a la sublista1, que esta en pos 0 de una lista
        ((ListaCompuesta) unaLista.get(0)).agregar(new ListaCompuesta(subItems, "SubLista 1.1"));

        // Instancia la lista de lista (uso de composite) y la imprime
        Lista listaC = new ListaCompuesta(unaLista, "Lista 1");
        listaC.agregar(new Item("Item 7"));

        //Respeta el compsite porque listaC es una lista (es un component) que es lista compuesta.
        // Genero el HTML para mostrar la salida por web
        GeneraHTML html = new GeneraHTML(listaC.getHTML());
    }
    
    public static List<Lista> crearLista(int primero,int tope) {
        List<Lista> unaLista = new ArrayList<>();
        for(int i = primero; i <= tope; i++) {
            //"El cliente solo interactua con la clase component"
            Lista nuevoComponent = new Item("Item "+i);
            unaLista.add(nuevoComponent);
        }
        return unaLista;        
    }

    /**
     * Genera un numero entero entre(min,maxO)
     * @param min limite inferior
     * @param max limite superior
     * @return
     */

    public static int generarNumero(int min,int max) {
        return new Random().nextInt(min,max);
    }
}
