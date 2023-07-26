package com.project.reactor.entity;

public class Usuario {
    public Usuario(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    String nombre;

    Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
