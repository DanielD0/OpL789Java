package Ejercicios;

import java.io.*;
import java.util.*;

public class ejercicioLibre {
    public static void main(String[] args) throws FileNotFoundException, InputMismatchException {
        String[] diasSemana = {
                "Lunes",
                "Martes",
                "Miercoles",
                "Jueves",
                "Viernes",
        };
        ArrayList<String> rutina = new ArrayList<>();
        HashMap<String,String> mapa = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        System.out.println("********BIENVENIDO*******");
        System.out.println("Crea una rutina de gimnasio");
        try{
            do {
                menu();
                int musculo = entrada.nextInt();
                String grupomuscular = "";
                if(musculo == 1){
                    grupomuscular = "Piernas";
                    mapa.put(diasSemana[i],grupomuscular);
                    i++;
                }else if(musculo == 2){
                    grupomuscular = "Pecho y tricep";
                    mapa.put(diasSemana[i],grupomuscular);
                    i++;
                }else if(musculo == 3){
                    grupomuscular = "Espalda y Bicep";
                    mapa.put(diasSemana[i],grupomuscular);
                    i++;
                }else if(musculo == 4){
                    grupomuscular = "Hombros y Abdomen";
                    mapa.put(diasSemana[i],grupomuscular);
                    i++;
                }else if(musculo == 5){
                    grupomuscular = "Cardio";
                    mapa.put(diasSemana[i],grupomuscular);
                    i++;
                }else{
                    System.out.println("este ejercicio no es valido seleccione otro");
                }
            }while (mapa.size() < 5);
        }catch(InputMismatchException e){
            System.out.println("No puedes insertar letras solo digitos del 1 al 5:" + e.getMessage());
        }

        try{
            PrintStream info = new PrintStream("rutina.txt");
            for (Map.Entry<String,String> elemento: mapa.entrySet()){
                //info.println(elemento.getKey() + " : " + elemento.getValue());
                System.out.println(elemento.getKey() + " : " + elemento.getValue());
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            InputStream ficherorecibido = new FileInputStream("rutina.txt");
            byte[] datos = ficherorecibido.readAllBytes();
            ficherorecibido.close();
            PrintStream ficherosalida = new PrintStream("rutinacopia.txt");
            ficherosalida.write(datos);
            ficherosalida.close();
            System.out.println("Se creo el fichero correctamente");
        } catch (IOException e){
            System.out.println("Ups existe un problema con: " + e.getMessage());
        }


    }
    


    public static void menu(){
        System.out.println("Introduce el numero del grupo muscular a trabajar:");
        System.out.println("1. Piernas");
        System.out.println("2. Pecho y tricep");
        System.out.println("3. Espalda y Bicep");
        System.out.println("4. Hombros y Abdomen");
        System.out.println("5. Cardio");
    }
}
