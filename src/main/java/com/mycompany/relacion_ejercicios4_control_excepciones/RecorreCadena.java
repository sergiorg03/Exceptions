package com.mycompany.relacion_ejercicios4_control_excepciones;

import java.util.Scanner;

public class RecorreCadena {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        try {
            
            System.out.println("Introcuzca la cadena a leer: ");
            String cadena = leer.nextLine();

            if (cadena.length() != 0) {

                int i = 0;
                while (cadena.length() != 0) {

                    System.out.println(cadena.charAt(i));
                    i++;
                    if (i > cadena.length()) {
                        throw new IndexOutOfBoundsException();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
            
        } catch (IndexOutOfBoundsException i){
            System.out.println("Has sobrepasado el tamaño de la cadena. ");
        }catch (IllegalArgumentException e) {
            System.out.println("La cadena está vacia makina. ");
        } finally {
            System.out.println("Fin del programa de lectura de cadenas. ");
        }

        try {
            System.out.println("Introduce un número a dividir: ");
            int a = leer.nextInt();

            System.out.println("Introduce el divisor: ");
            int b = leer.nextInt();
            int c = a / b;
        } catch (ArithmeticException a) {
            System.out.println("No se puede dividir entre 0 makina. ");
        } finally{
            System.out.println("Fin del programa de disiones. ");
            System.exit(0);
        }
    }
}
