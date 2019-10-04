package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Template {
    public void Ordena(List<Alumno> listaAlumnos) {
        Comparator<Alumno> comparator = new Comparator<Alumno>() {
            public int compare( Alumno a, Alumno b ) {

                int resultado = a.nombre.compareTo(b.nombre);
                if ( resultado != 0 ) { return resultado; }
                return resultado;
            }
        };
        Collections.sort( listaAlumnos, comparator );
    }

    abstract void leerArchivo(String archivo);

    public void Imprime(List<Alumno> listaAlumnos){
        for (Alumno a : listaAlumnos) {
            System.out.println(a.nombre+" "+a.apellido1+" "+a.apellido2+" "+a.edad+" "+a.calificacion);
        }
    }

}