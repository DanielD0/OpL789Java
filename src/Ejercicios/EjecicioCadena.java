package Ejercicios;

public class EjecicioCadena {
    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));
    }

    public static String reverse(String texto){
        String cadenafinal="";
        char caracter;

        for(int i =0; i<texto.length();i++){
           caracter = texto.charAt(i);
           cadenafinal = caracter + cadenafinal;
        }
        return cadenafinal;
    }
}
