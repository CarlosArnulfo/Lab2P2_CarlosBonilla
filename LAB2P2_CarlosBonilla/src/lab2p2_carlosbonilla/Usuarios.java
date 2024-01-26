/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_carlosbonilla;

/**
 *
 * @author lospe
 */
public class Usuarios {
    private String nombre;
    private String pw;
    private String tipo;
    public Usuarios (String nombre, String pw, String tipo) {
    this.nombre=nombre;
    this.pw=pw;
    this.tipo=tipo;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPw() {
        return pw;
    }

    public String getTipo() {
        return tipo;
    }
    
}
