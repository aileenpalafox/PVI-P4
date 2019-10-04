package com.company;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    int calificacion;
    public static List<Alumno> listaAlumnosTXT = new ArrayList<>() ;
    public static List<Alumno> listaAlumnosExcel = new ArrayList<>() ;


    public Alumno(String nombre, String apellido1, String apellido2,int edad, int calificacion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad=edad;
        this.calificacion = calificacion;
    }



}
