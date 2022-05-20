package com.mycompany.relacion_ejercicios4_control_excepciones;

public class MethodCallStackSolutionB {
    
    public static void main(String[] args) {
        try {
            System.out.println("Enter main");
            methodA();
            System.out.println("Exit main");  
        } catch (ArithmeticException e) {
            System.out.println("Excepcion gestionada en el metodo main. ");
        }
    }

    public static void methodA() {
        System.out.println("Enter methodA");
        methodB();
        System.out.println("Exit methodA");
    }

    public static void methodB() {
        System.out.println("Enter methodB");
        methodC();
        System.out.println("Exit methodB");
    }

    public static void methodC() {
        System.out.println("Enter methodC");
        System.out.println(1 / 0);
        System.out.println("Exit methodC");
    }
}