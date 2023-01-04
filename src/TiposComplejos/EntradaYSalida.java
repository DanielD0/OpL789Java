package TiposComplejos;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaYSalida {
    public static void main(String[] args) throws FileNotFoundException {
        boolean ok = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete un numero: ");
            try{
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Entros son: " + a + " " + b);
                ok = true;
            } catch (InputMismatchException e){
                System.out.println("Numeros invalidos" + e.getMessage());
            }
        } while (!ok);

        //PrintStream
        PrintStream info = new PrintStream("copia.txt");
        info.println("hola");

        //Reader


        try{
            InputStream fichero = new FileInputStream("copia.txt");
            byte[] datos = fichero.readAllBytes();
            fichero.close();
            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();
        }catch (IOException e){
            System.out.println("No puedo leer el fichero: " + e.getMessage());
        }

    }
}
