/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_carlosbonilla;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author lospe
 */
public class LAB2P2_CarlosBonilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList listaDeCosos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        ArrayList<Usuarios> usuarios = new ArrayList();
        usuarios.add(new Usuarios("Parangutirimicuaro", "parangutirimicuaro", "Bibliotecario"));//USERS
        usuarios.add(new Usuarios("Miguel", "mipanamiguel", "Bibliotecario"));
        usuarios.add(new Usuarios("Mark", "pedrito222", "Docente"));
        usuarios.add(new Usuarios("Osman", "666", "Estudiante"));
        usuarios.add(new Usuarios("Luis", "mimamamemima", "Estudiante"));
        usuarios.add(new Usuarios("Ana", "fortnite", "Docente"));
        int menu = 0;
        String NUsuario = "";

        do {
            int submenuEdicion=0;
            int menuLibros=0;
            int menuEdicion=0;
            int recursoAEditar=0;
            int menuBiblioteca=0;
            int menuCrear = 0;
            Usuarios user = new Usuarios("", "", "");
            boolean esDocente = false;
            boolean permitAccess = false;
            boolean existeUsuario = false;
            do {
                System.out.println("Bienvenido a la Universidad Virtual de UNITEC");//LOGGIN
                System.out.println("favor ingresar usuario y contraseña");
                System.out.println("INGRESE SU NOMBRE DE USUARIO");
                NUsuario = sc.nextLine();
                existeUsuario = EncontrarUsuario(usuarios, NUsuario, 0);
                if (existeUsuario == true) {
                    System.out.println("El usuario existe");

                } else {
                    System.out.println("El usuario no existe");
                }
            } while (existeUsuario == false);
            do {
                System.out.println("Ingrese la contraseña de Usuario");
                String pw = sc.nextLine();
                int numeroUsuario = NumeroDeUsuario(usuarios, NUsuario, 0);
                if (pw.equalsIgnoreCase(usuarios.get(numeroUsuario).getPw())) {
                    permitAccess = true;
                    user.setNombre(usuarios.get(numeroUsuario).getNombre());
                    user.setPw(usuarios.get(numeroUsuario).getPw());
                    user.setTipo(usuarios.get(numeroUsuario).getTipo());
                    System.out.println("Bienvenido/a a la Universidad Virtual UNITEC, ");
                } else {
                    System.out.println("Ingrese una contraseña valida");
                }
            } while (permitAccess == false);
            System.out.println("");
            do {
                System.out.println("1: Listar recursos");
                System.out.println("2: Crear Recursos (SOLO DOCENTES Y PERSONAL DE LIBRERIA)");
                System.out.println("3: Editar Recursos (SOLAMENTE PERSONAL DE LIBRERIA");//OPCIONES DE QUE HACER
                System.out.println("4: Cerrar la sesion");
                System.out.println("0. Cerrar el programa");
                menu = input.nextInt();
                switch (menu) {
                    case (1):
                        ListarRecursos(listaDeCosos, 0);
                        break;
                    case (2):
                        if (user.getTipo().equals("Estudiante")) {
                            System.out.println("LOS ESTUDIANTES NO TIENEN ACCESO A LA CREACION DE OBJETOS");//SOLO LOS BIBLIOTECARIOS Y DOCENTES TIENEN ACCESO AL CREADOR
                        } else {
                            System.out.println("desea");
                            System.out.println("1. Crear un libro");
                            System.out.println("2. Crear un articulo");
                            System.out.println("3. Crear una conferencia");
                            System.out.println("4. Crear un curso virtual");
                            menuCrear = input.nextInt();
                        }

                        switch (menuCrear) {//CREADOR DE OBJETOS DIVERSO
                            case (1):
                                System.out.println("Ingrese el nombre del libro");
                                String nombreLibro = sc.nextLine();
                                System.out.println("Ingrese el autor del libro");
                                String autorLibro = sc.nextLine();
                                System.out.println("Ingrese el año de lanzamiento del libro");
                                int fecha = input.nextInt();
                                System.out.println("Esta disponible el libro o no? S/N");
                                String disponible = sc.nextLine();
                                String disponibilidad;
                                if (disponible.charAt(0) == 's' || disponible.charAt(0) == 'S') {
                                    disponibilidad = "si";
                                } else {
                                    disponibilidad = "no";
                                }
                                Libros libro = new Libros(autorLibro, nombreLibro, disponibilidad, fecha);
                                listaDeCosos.add(libro);
                                break;
                            case (2):
                                System.out.println("Ingrese el titulo del articulo");
                                String titulo = sc.nextLine();
                                System.out.println("Ingrese el autor del articulo");
                                String autorArticulo = sc.nextLine();
                                System.out.println("Ingrese la fecha de publicacion del articulo");
                                System.out.println("AÑO:");
                                int anoArticulo = input.nextInt();
                                System.out.println("MES");
                                int mesArticulo = input.nextInt();
                                System.out.println("DIA");
                                int diaArticulo = input.nextInt();
                                Calendar c = new GregorianCalendar(anoArticulo, mesArticulo, diaArticulo);
                                Date fechaArticulo = c.getTime();
                                System.out.println("Hay acceso disponible a este artiulo? S/N");
                                String accesible = sc.nextLine();
                                String accesibilidad;
                                if (accesible.charAt(0) == 's' || accesible.charAt(0) == 'S') {
                                    accesibilidad = "si";
                                } else {
                                    accesibilidad = "no";
                                }
                                Articulos articulo = new Articulos(autorArticulo, titulo, fechaArticulo, accesibilidad);
                                listaDeCosos.add(articulo);
                                break;
                            case (3):
                                System.out.println("Ingrese el conferencista de la conferencia");
                                String conferencista = sc.nextLine();
                                System.out.println("Ingrese la duracion de la conferencia (horas y minutos respectivamente)");
                                System.out.println("HORAS");
                                int horasConferencia = input.nextInt();
                                System.out.println("MINUTOS");
                                int minsConferencia = input.nextInt();
                                System.out.println("Ingrese la fecha de la conferencia");
                                System.out.println("AÑO:");
                                int anoConferencia = input.nextInt();
                                System.out.println("MES");
                                int mesConferencia = input.nextInt();
                                System.out.println("DIA");
                                int diaConferencia = input.nextInt();
                                Calendar calend = new GregorianCalendar(anoConferencia, mesConferencia, diaConferencia);
                                Date fechaConferencia = calend.getTime();
                                System.out.println("Ingrese el enlace de la conferencia");
                                String enlace = sc.nextLine();
                                Conferencias confer = new Conferencias(conferencista, fechaConferencia, minsConferencia, horasConferencia, enlace);
                                listaDeCosos.add(confer);
                                break;
                            case (4):
                                System.out.println("Ingrese el titulo del curso");
                                String tituloCurso = sc.nextLine();
                                System.out.println("Ingrese el instructor del curso");
                                String instructor = sc.nextLine();
                                System.out.println("Ingrese la duracion del curso en semanas");
                                int semanasCurso = input.nextInt();
                                System.out.println("Ingrese la plataforma en la que se aplicara el curso");
                                String platform = sc.nextLine();
                                Cursos curso = new Cursos(tituloCurso, instructor, semanasCurso, platform);
                                listaDeCosos.add(curso);
                                break;
                            default:
                                System.out.println("elija una opcion valida");
                        }
                        break;
                    case (3):
                        if(user.getTipo().equals("Bibliotecario")){
                            menuBiblioteca=0;
                            System.out.println("1. Editar recurso");
                            System.out.println("2. Borrar recurso");
                        }else{
                            System.out.println("ESTA OPCION ES DE USO EXCLUSIVO PARA BIBLIOTECARIOS");
                        }
                        switch (menuBiblioteca) {
                            case 1:
                                recursoAEditar = 0;
                                System.out.println("ingrese el numero indice del recurso que desee editar");//EDITORES DE OBJETOS, SOLO SE PUEDEN EDITAR LIBROS Y CURSOS
                                recursoAEditar = input.nextInt();
                                if (recursoAEditar >= 0 && recursoAEditar < listaDeCosos.size()) {
                                    if (listaDeCosos.get(recursoAEditar) instanceof Libros) {
                                        System.out.println("¿Que desea editar de este libro?");
                                        System.out.println("1. Autor");
                                        System.out.println("2. Titulo");
                                        System.out.println("3. Año de publicacion");
                                        switch(submenuEdicion){
                                            case 1:
                                                System.out.println("¿Que nuevo autor desea agregarle al libro?");
                                                String nuevoAutor=sc.nextLine();
                                                Libros libroAEditar=(Libros)(listaDeCosos.get(recursoAEditar));
                                                libroAEditar.setAutor(nuevoAutor);
                                                listaDeCosos.add(recursoAEditar, libroAEditar);
                                                listaDeCosos.remove(recursoAEditar-1);
                                                break;
                                            case 2:System.out.println("¿Que nuevo titulo quiere darle al libro?");
                                            String nuevoTitulo=sc.nextLine();
                                                Libros libroAEditarTITULO=(Libros)(listaDeCosos.get(recursoAEditar));
                                                libroAEditarTITULO.setNombre(nuevoTitulo);
                                                listaDeCosos.add(recursoAEditar, libroAEditarTITULO);
                                                listaDeCosos.remove(recursoAEditar-1);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el nuevo año de lanzamiento que quiere darle al libro");
                                                int anoNuevo=input.nextInt();
                                                Libros libroAEditarFECHA=(Libros)(listaDeCosos.get(recursoAEditar));
                                                libroAEditarFECHA.setLanzamiento(anoNuevo);
                                                listaDeCosos.add(recursoAEditar, libroAEditarFECHA);
                                                listaDeCosos.remove(recursoAEditar-1);
                                                break;
                                        }
                                    }else if(listaDeCosos.get(recursoAEditar) instanceof Cursos){
                                       System.out.println("¿Que desea editar de este curso?");
                                        System.out.println("1. Titulo");
                                        System.out.println("2. Instructor");
                                        System.out.println("3. Duracion");
                                        System.out.println("4. Plataforma");
                                        switch (submenuEdicion) {
                                            case 1:
                                                System.out.println("¿Que nuevo Titulo quiere darle a este curso?");
                                                String nuevoTituloCurso = sc.nextLine();
                                                Cursos cursoAEditar = (Cursos) (listaDeCosos.get(recursoAEditar));
                                                cursoAEditar.setTitulo(nuevoTituloCurso);
                                                listaDeCosos.add(recursoAEditar, cursoAEditar);
                                                listaDeCosos.remove(recursoAEditar-1);
                                                break;
                                            case 2:
                                                System.out.println("¿Que nuevo Instructor quiere darle a este curso?");
                                                String nuevoInstructorCurso = sc.nextLine();
                                                Cursos cursoAEditarINSTRUCTOR = (Cursos) (listaDeCosos.get(recursoAEditar));
                                                cursoAEditarINSTRUCTOR.setInstructor(nuevoInstructorCurso);
                                                listaDeCosos.add(recursoAEditar, cursoAEditarINSTRUCTOR);
                                                listaDeCosos.remove(recursoAEditar-1);
                                                break;
                                            case 3:
                                                System.out.println("¿Que nueva duracion EN SEMANAS quiere asignarle a este curso?");
                                                int nuevoTiempoCurso = sc.nextInt();
                                                Cursos cursoAEditarTIEMPO = (Cursos) (listaDeCosos.get(recursoAEditar));
                                                cursoAEditarTIEMPO.setDuracion(nuevoTiempoCurso);
                                                listaDeCosos.add(recursoAEditar, cursoAEditarTIEMPO);
                                                listaDeCosos.remove(recursoAEditar-1);
                                                break;
                                            case 4:
                                                System.out.println("¿Que nueva plataforma quiere añadirle a este curso?");
                                                String nuevaPlataformaCurso = sc.nextLine();
                                                Cursos cursoAEditarPLATAFORMA = (Cursos) (listaDeCosos.get(recursoAEditar));
                                                cursoAEditarPLATAFORMA.setInstructor(nuevaPlataformaCurso);
                                                listaDeCosos.add(recursoAEditar, cursoAEditarPLATAFORMA);
                                                listaDeCosos.remove(recursoAEditar-1);
                                                break;
                                                
                                                
                                        }
                                    } else if (listaDeCosos.get(recursoAEditar) instanceof Articulos) {

                                    }else if(listaDeCosos.get(recursoAEditar) instanceof Conferencias){
                                        
                                    }

                                } else {
                                    System.out.println("El indice ingresado no pertenece a ningun recurso disponible");
                                }
                                break;
                            case 2:
                                int recursoABorrar=0;
                                System.out.println("ingrese el numero indice del recurso que desee borrar");
                                recursoABorrar=input.nextInt();
                                if(recursoABorrar>=0&&recursoABorrar<listaDeCosos.size()){
                                    listaDeCosos.remove(recursoABorrar);
                                }else{
                                    System.out.println("El indice ingresado no pertenece a ningun recurso disponible");
                                }
                                break;
                            default:
                                System.out.println("Elija una opcion Valida");
                        }
                        break;
                    default:
                }
            } while (menu != 4);

        } while (menu != 0);

    }

    public static boolean EncontrarUsuario(ArrayList<Usuarios> listaUsuarios, String NUsuario, int i) {//METODOS
        if (i > 3) {
            return false;
        } else if (listaUsuarios.get(i).getNombre().equals(NUsuario)) {
            return true;
        }
        return EncontrarUsuario(listaUsuarios, NUsuario, i + 1);
    }

    public static int NumeroDeUsuario(ArrayList<Usuarios> listaUsuarios, String NUsuario, int i) {
        if (i > 3) {
            return 0;
        } else if (listaUsuarios.get(i).getNombre().equals(NUsuario)) {
            return i;
        }
        return NumeroDeUsuario(listaUsuarios, NUsuario, i + 1);
    }

    public static void ListarRecursos(ArrayList cosos, int i) {
        if (i == cosos.size()) {

        } else {
            System.out.println(cosos.get(i).toString());
            ListarRecursos(cosos, i + 1);
        }
    }
}
