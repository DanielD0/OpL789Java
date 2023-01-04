package TiposComplejos;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapas{
    public static void main(String[] args) {
        suma();
        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("clave1",10);
        mapa.put("clave2",20);
        mapa.put("clave3",40);
        /*
        mapa.remove("clave2");
        System.out.println(mapa);
        mapa.replace("clave3",90);

        for (Map.Entry<String,Integer> elemento: mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento clave es: " + elemento.getValue());
        }
        */
        try{
            divide(4,0);
        }catch(Exception e){
            System.out.println("AAA");
        }


    }

    public static int divide(int A, int B) throws ArithmeticException,IOException {
        int resultado = 0;
        try{
            resultado = A/B;
        }catch (ArithmeticException e){
            throw new IOException();
        }

        return resultado;
    }

    public static void suma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();
        try {
            int resultado = numeroA/numeroB;
            System.out.println("El resultado es:" + resultado);
        }catch (Exception e) {
            System.out.println("B00M!,excepcion es: " + e.getClass());
        }
    }
}
