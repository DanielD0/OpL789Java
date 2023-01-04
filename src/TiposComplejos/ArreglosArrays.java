package TiposComplejos;

public class ArreglosArrays {
    public static void main(String[] args) {
        /*
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;
        */
        int arrayUno[] = {0,1,2,3,4};
        for (int i : arrayUno){
            System.out.println(i);
        }
        String arrayNopmbres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };
        //Formas de recorre un array
        for (String nombre : arrayNopmbres){
            System.out.println(nombre);
        }

        for(int i = 0; i<arrayNopmbres.length; i++){
            System.out.println("Nombre actual: " + arrayNopmbres[i] + " en posicion: " + i);
        }
        int arrayBidi [][] = {
                {1,2,3,4},
                {10,20,30,40}
        };

        for (int a=0; a <arrayBidi.length ;a++ ){
            System.out.println("Valor de a: " + a);
            for(int b =0; b < arrayBidi[a].length;b++){
                System.out.println("Estoy en a" + a + ",b = " + b);
                System.out.println(arrayBidi[a][b]);
            }
        }
    }
}
