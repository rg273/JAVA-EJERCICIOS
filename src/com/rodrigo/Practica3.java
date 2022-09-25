package com.rodrigo;

public class Practica3 {
    public static void main(String[] args) {
        /**
         * Crear un bucle que permita concatenar textos y imprima el resultado en consola.
         * Concatenar nombres
         */
        String nombre1 = "rodrigo";
        String nombre2 = "jose";
        String nombre3 = "leo";
        String nombre4 = "romeo";
        String nombre5 = "ricardo";

        String[] nombres = {nombre1,nombre2,nombre3,nombre4,nombre5};

        for(int i = 0; i< nombres.length; i++){
            String saludo = ", " + nombres[i];
            System.out.println("Hola" + saludo);
        }
        String nombresSaludo = "Hola";
        for (String current: nombres) {
            nombresSaludo = nombresSaludo + " " + current + ",";
        }
        System.out.println(nombresSaludo);
    }

}
