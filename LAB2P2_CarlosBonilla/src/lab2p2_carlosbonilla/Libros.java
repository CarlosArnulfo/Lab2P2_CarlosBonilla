/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_carlosbonilla;

import java.util.Date;

/**
 *
 * @author lospe
 */
public class Libros {
    private String autor;
    private String nombre;
    private int lanzamiento;
    private String disponibilidad;
    public Libros(String autor,String nombre,String disponibilidad, int lanzamiento){
        this.autor=autor;
        this.nombre=nombre;
        this.disponibilidad=disponibilidad;
        this.lanzamiento=lanzamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getAutor() {
        return autor;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }
    @Override
    public String toString(){
        return "El nombre del libro es "+nombre+"\n Con autor de nombre "+autor+"\n Lanzado en el año "+lanzamiento+"¿esta disponible?\n "+disponibilidad;
    }
}
