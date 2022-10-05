package com.rodrigo.Practica5;

public class CocheCRUDimpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("save activado");
    }

    @Override
    public void findAll() {
        System.out.println("findAll activado");
    }

    @Override
    public void delete() {
        System.out.println("delete activado");
    }
}
