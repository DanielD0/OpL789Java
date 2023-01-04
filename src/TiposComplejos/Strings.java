package TiposComplejos;

public class Strings {
    public static void main(String[] args) {

        String cadena = "Mensaje de texto";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena ahora es minuscula: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena ahora es mayuscula: " + cadenaMayus);

        //Evaluacion de una palabra dentro de una cadena al comenzar
        boolean resultado = cadena.startsWith("Men");

        if(resultado){
            System.out.println("Empieza por lo que estoy buscando");
        }else {
            System.out.println("No empieza por lo que quiero");
        }
        //Evaluacion de una palabra dentro de una cadena al terminar
        boolean resultado1 = cadena.endsWith("o");

        if(resultado1){
            System.out.println("Si acaba");
        }else {
            System.out.println("No acaba");
        }
        //Recoger un caracter de una cadena
        char letra = cadena.charAt(0);
        System.out.println(letra);

        //Recorrer una cadena
        for (int i=0; i < cadena.length();i++){
            System.out.println("Caracter Actual: " + cadena.charAt(i));
        }
    }
}
