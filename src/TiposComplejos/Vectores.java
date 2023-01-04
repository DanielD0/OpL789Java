package TiposComplejos;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        /*
        System.out.println("datos del vector " + vector);
        System.out.println("vector tamaño" + vector.size() + "y capacidad: " + vector.capacity())}


        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales?" + resultado);



        for(int i : vector){
            System.out.println("Valor actual en Vector: " + i);
        }

        for (int i=0; i<vector.size(); i ++){
            if(i % 2 == 0){
                vector.remove(i);
                //al eliminar el elemento en el vector no se puede volver acceder a esa posicion
                continue;
            }
            System.out.println("Valor es: " + vector.get(i) + "en posicion: " + i);
        }
         */
        System.out.println("capacidad de vector" + vector.capacity() + "Tamaño: " + vector.size());
        vector.trimToSize();
        System.out.println("capacidad de vector" + vector.capacity() + "Tamaño: " + vector.size());

    }
}
