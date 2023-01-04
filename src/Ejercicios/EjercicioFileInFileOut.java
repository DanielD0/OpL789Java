package Ejercicios;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioFileInFileOut {
    public static void main(String[] args) throws FileNotFoundException {
        copiaFichero("destino.xt");
    }
    public static void copiaFichero(String fichero) throws FileNotFoundException {
        try{
            InputStream ficherorecibido = new FileInputStream(fichero);
            byte[] datos = ficherorecibido.readAllBytes();
            ficherorecibido.close();
            PrintStream ficherosalida = new PrintStream("ficherocopiado.txt");
            ficherosalida.write(datos);
            ficherosalida.close();
            System.out.println("Se creo el fichero correctamente");
        } catch (IOException e) {
            System.out.println("Ups existe un problema con: " + e.getMessage());
        }

    }
}
