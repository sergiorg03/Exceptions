package com.mycompany.relacion_ejercicios4_control_excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFromFileWithTryCatch {

    public static void main(String[] args) {
        try {
            System.out.println("Comienzo del bloque try.");
            System.out.println("Intentando abrir el fichero.");
            FileReader fichero = new FileReader("texto.txt");
            BufferedReader br = new BufferedReader(fichero);
            String s = br.readLine();
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
            fichero.close();
            System.out.println("Fichero procesado.");
            System.out.println("Fin del bloque try.");
        } catch (FileNotFoundException ex) {
            System.err.println("No se ha encontrado el fichero.");
            System.err.println("La excepción ha sido capturada y nuestro programa no terminó repentinamente. ");
        } catch (IOException ex) {
            System.err.println("Al tratar con ficheros debemos capturar la excepción IOException.");
        } finally {
            System.out.println("Este código se ejecutará siempre");
        }
        System.out.println("La vida continúa después de un bloque try-catch-finally");
    }
}
