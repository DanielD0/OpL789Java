package Ejercicios;

import java.util.Vector;

public class EjercicioVector {
    public static void main(String[] args) {
        Vector<String> vectorprueba = new Vector<>();
        vectorprueba.add("Hola,");
        vectorprueba.add("Este");
        vectorprueba.add("Es un");
        vectorprueba.add("Ejercicio de");
        vectorprueba.add("OpenBootcamp");

        vectorprueba.remove(1);
        vectorprueba.remove(3);

        String textofinal = "";
        for ( String valorvector : vectorprueba){
            textofinal = textofinal + " " + valorvector;
        }

        System.out.println(textofinal);

        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        /*
        Respuesta = genererariamos duplicidad en memoria ya que generaria copia del primer vector y no se e
                    estaria generando los valores necesarios en memoria se generarian valores extras que no se estan utilizando
         */
    }
}
