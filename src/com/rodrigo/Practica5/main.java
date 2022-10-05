package com.rodrigo.Practica5;


public class main {
    //**
    //Crear una interfaz CocheCRUD.
    //
    //Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
    //
    //Como métodos de CocheCRUD podemos poner:
    //
    //save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
    //
    //Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
    // */

    static CocheCRUD cocheCRUD = new CocheCRUDimpl();

    public static void main(String[] args) {

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
