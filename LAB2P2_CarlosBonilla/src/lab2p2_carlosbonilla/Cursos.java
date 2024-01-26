/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_carlosbonilla;

/**
 *
 * @author lospe
 */
public class Cursos {

    private String titulo;
    private String instructor;
    private int duracion;
    private String platform;

    public Cursos(String titulo, String instructor, int duracion, String platform) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracion = duracion;
        this.platform = platform;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getPlatform() {
        return platform;
    }
    @Override
    public String toString(){
        return " El titulo del curso es "+titulo+"\n Con el instructor "+instructor+"\n Dicho curso durara "+duracion+" semanas"+"\n Y la plataforma es "+platform;
    }
}
