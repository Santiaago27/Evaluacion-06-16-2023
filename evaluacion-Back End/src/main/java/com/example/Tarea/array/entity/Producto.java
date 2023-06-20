package com.example.Tarea.array.entity;

public class Producto {
    String numref;
    String nombre;
    String categoria;
    int preciou;
    int cant;

    public Producto(String numref, String nombre, String categoria, int preciou, int cant) {
        this.numref = numref;
        this.nombre = nombre;
        this.categoria = categoria;
        this.preciou = preciou;
        this.cant = cant;

    }

    public String getNumref() {
        return numref;
    }

    public void setNumref(String numref) {
        this.numref = numref;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPreciou() {
        return preciou;
    }

    public void setPreciou(int preciou) {
        this.preciou = preciou;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "numref='" + numref + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preciou=" + preciou +
                ", cant=" + cant +
                '}';
    }
}

