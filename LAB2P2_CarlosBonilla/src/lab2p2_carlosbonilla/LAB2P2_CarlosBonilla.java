/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_carlosbonilla;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lospe
 */
public class LAB2P2_CarlosBonilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList <Usuarios> Usuarios=new ArrayList();
    Usuarios.add(new Usuarios("Mark","pedrito222","docente"));
    Usuarios.add(new Usuarios("Juan","666","estudiante"));
    Usuarios.add(new Usuarios("Luis","mimamamemima","estudiante"));
    Usuarios.add(new Usuarios("Ana","fortnite","docente"));
    int menu=0;
    boolean existeUsuario=false;
        do {
            do {
                System.out.println("Bienvenido a la Universidad Virtual de UNITEC");
            System.out.println("favor ingresar usuario y contraseña");
            System.out.println("INGRESE SU NOMBRE DE USUARIO");
            String NUsuario=sc.nextLine();
            existeUsuario=encontrarUsuario(Usuarios,NUsuario,0);
            if (existeUsuario==true) {
                System.out.println("El usuario existe");
                
            }else{
                System.out.println("El usuario no existe");
            }
            } while (existeUsuario==false);
            
        } while (menu!=0);
       
    }
    
    public static boolean encontrarUsuario(ArrayList<Usuarios> listaUsuarios,String NUsuario, int i){
        if (i>3) {
            return false;
        }else if(listaUsuarios.get(i).getNombre().equals(NUsuario)){
           return true; 
        }
            return encontrarUsuario(listaUsuarios,NUsuario,i+1);
    }
}
