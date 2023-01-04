package Ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjericioArrayList {
    public static void main(String[] args) {
        ArrayList<String> valores = new ArrayList<>();
        valores.add("valor1");
        valores.add("valor2");
        valores.add("valor3");
        valores.add("valor4");

        for (String value:valores){
            System.out.println(value);
        }

        LinkedList<String> valorescopiados = new LinkedList<>(valores);
        for (String valor: valorescopiados){
            System.out.println(valor);
        }

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i=0; i < 10 ; i++){
            numeros.add(i);
        }

        for (int j=0; j < numeros.size();j++){
            if(numeros.get(j) % 2 == 0){
                numeros.remove(numeros.get(j));
            }
        }

        for(int numero : numeros){
            System.out.println(numero);
        }

        dividePorCero(1.0,5.0);

    }

    public static void dividePorCero(double a,double b) throws ArithmeticException{
        double res = 0;
        try {
            res = a/b;
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }
}
