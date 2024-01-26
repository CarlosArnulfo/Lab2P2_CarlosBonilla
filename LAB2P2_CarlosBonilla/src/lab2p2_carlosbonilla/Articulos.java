/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_carlosbonilla;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lospe
 */
public class Articulos {

    private String autor;
    private String titulo;
    private Date fecha;
    private String acceso;

    public Articulos(String autor, String titulo, Date fecha, String acceso) {
        this.autor = autor;
        this.titulo = titulo;
        this.fecha = fecha;
        this.acceso = acceso;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAcceso() {
        return acceso;
    }
    @Override
    public String toString(){
        return "Articulo de nombre '"+titulo+"'\n Autor o Autora: "+autor+"\n Fecha de publicacion: "+fecha+"\n ¿Esta disponible su acceso?\n"+acceso;
    }
}
