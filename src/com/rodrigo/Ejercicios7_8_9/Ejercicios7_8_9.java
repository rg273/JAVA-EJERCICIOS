package com.rodrigo.Ejercicios7_8_9;
//
//Dada la función:
//
//public static String reverse(String texto) { }
//
//1_Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
//
//2_Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
//
//3_Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
//
//4_Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
//
//5_Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
//
//6_Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
//
//7_Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
//
//8_Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
//
//9_Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
//
//10_Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicios7_8_9 {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 0:");
        String nuevaPalabra = reverse("rodrigo");
        System.out.println(nuevaPalabra);

        // ejercicio1
        System.out.println("EJERCICIO 1");
        String[] arrayString = {"rodrigo", "androide", "camila","david","lucia"};

        for(int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
        // ejercicio2
        int[][] arrayBidi = {{100,200,300,400},{40,50,60,70}};
        System.out.println("Ejercicio 2");
        for (int i = 0; i<arrayBidi.length; i++){
            for (int j = 0; j < arrayBidi[i].length;j++){
                System.out.println("La valor de la posicion i = " + i +", j ="+ j + " es: "+ arrayBidi[i][j]);
            }
        }
        //EJERCICIO 3
        System.out.println("Ejercicio 3");
        Vector<String> nombresCursantes = new Vector();
        for(int i =0; i<arrayString.length;i++){
            nombresCursantes.add(arrayString[i]);
        }

        System.out.println(nombresCursantes);
        nombresCursantes.remove(2);
        nombresCursantes.remove(1);
        System.out.println(nombresCursantes);
        //EJERCIOCIO 4
        // El principal problema que se generaria es que estaremos ocupando mucha memoria,
        // ya que al llegar al limite de capacidad del vector, se crea un nuevo vector
        // con los mismo valores pero con mas capacidad

        //EJERCICIO 5
        System.out.println("Ejercicio 5");
        ArrayList<String> nombresCursantesArrayList = new ArrayList();
        nombresCursantesArrayList.add("Rodrigo");
        nombresCursantesArrayList.add("David");
        nombresCursantesArrayList.add("Lucia");
        nombresCursantesArrayList.add("Agustin");
        LinkedList<String> nombresCursantesLinkedList = new LinkedList<String>(nombresCursantesArrayList);

        for(int i = 0; i < nombresCursantesArrayList.size(); i++){
            System.out.println(nombresCursantesArrayList.get(i));
            System.out.println(nombresCursantesLinkedList.get(i));
        }
        //EJERCICIO 6
        System.out.println("EJERCICIO 6");
        ArrayList<Integer> miArrayListNumbers = new ArrayList<Integer>();
        for (int i = 1; i < 11 ;i++){
            miArrayListNumbers.add(i);
        }
        System.out.println(miArrayListNumbers);
        for (int i = 0; i< miArrayListNumbers.size();i++){
            if ( miArrayListNumbers.get(i) % 2 == 0){
                miArrayListNumbers.remove(i);
                i = i - 2;
            }
        }
        System.out.println(miArrayListNumbers);

        //EJERCICIO 7
        System.out.println("EJERCICIO 7");
        try {
            DividePorCero(4,1);
        }catch (Exception e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }

    }


    public static void DividePorCero(int A, int B) throws ArithmeticException{
        int resultado = 0;
        try{
            resultado = A / B;
            System.out.println(resultado);
        }catch (Exception e){
            throw new ArithmeticException();
        }
    }


    public static String reverse(String textoP) {
        var i = textoP.length() - 1;
        System.out.println(i);

        String palabraAlReves = "";
        while(i >=0){

            palabraAlReves = palabraAlReves + textoP.charAt(i);
            i = i - 1;

        }
        return palabraAlReves;
    }
}
