package Ejercicios;

public class EjericiosArrays {
    public static void main(String[] args) {
        String[] valores = {"valor1","valor4","valor3","valor4","valor5"};
        for (String valor:valores) {
            System.out.println(valor);
        }

        String[][] arrayBidimensional =
                {
                        {"valor1Columna1","valor2Columna1","valor3Columna1"},
                        {"valor1Columna2","valor2Columna2","valor3Columna2"}
                };

        for(int i=0; i < arrayBidimensional.length; i++){
            for (int j = 0; j<arrayBidimensional[i].length; j++){
                System.out.println(arrayBidimensional[i][j]);
            }
        }
    }
}
