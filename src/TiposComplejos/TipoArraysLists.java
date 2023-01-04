package TiposComplejos;

import java.util.ArrayList;
import java.util.LinkedList;

public class TipoArraysLists {
    public static void main(String[] args) {
        //CapacidadVector = capacidadVector * 2
        //
        //CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("elemnto A");
        lista.add("elemnto B");
        lista.add("elemnto C");
         /*
        lista.remove("elemnto B");

        System.out.println("contenido: " + lista);

        for(String nombre : lista){
            System.out.println("nombre" + nombre);
        }

        for(int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size();i++){
            array[i] = lista.get(i);
        }

        for(String elemento: array){
            System.out.println("Elemento es: " + elemento);
        }
         */
        for (Object arrayObject : lista.toArray()){
            System.out.println(arrayObject.toString());
        }

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);


    }
}
