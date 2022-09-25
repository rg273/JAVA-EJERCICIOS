package com.rodrigo;
import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        //METODO 1
        Scanner escanear = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numeroIntroducido = escanear.nextInt();

        double precioConIva = devolverIva(numeroIntroducido);
        System.out.println(precioConIva);
    }
    static double devolverIva(int parametro1){
        return parametro1 + (parametro1 * 0.20);
    }
}
