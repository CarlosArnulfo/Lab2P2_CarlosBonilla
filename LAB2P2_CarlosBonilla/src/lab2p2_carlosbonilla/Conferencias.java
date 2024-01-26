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
public class Conferencias {

    private Date fecha;
    private String conferencista;
    private int duracionMinutos;
    private int duracionHoras;
    private String enlace;

    public Conferencias(String conferencista, Date fecha, int duracioMinutos, int duracionHoras, String enlace) {
        this.fecha = fecha;
        this.conferencista = conferencista;
        this.duracionMinutos = duracioMinutos;
        this.duracionHoras = duracionHoras;
        this.enlace = enlace;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getConferencista() {
        return conferencista;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public String getEnlace() {
        return enlace;
    }
@Override
public String toString(){
    return " La conferencia tomara lugar el dia "+fecha+"\n El nombre del conferencista es "+conferencista+"\n La conferencia tendra una duracion de "+duracionHoras+" horas y "+duracionMinutos+" minutos\n Este es el enlace a la conferencia: "+enlace;
}
}
