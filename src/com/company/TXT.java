package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class TXT extends Template {
    @Override
    void leerArchivo(String archivo) {
        String texto="";
        List<Alumno> listaAlumnosTXT=Alumno.listaAlumnosTXT;
        File file = new File (archivo);
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((texto=br.readLine())!=null){
                String[] alumno = texto.split("-");
                Alumno a = new Alumno(alumno[0],alumno[1],alumno[2],Integer.parseInt(alumno[3]),Integer.parseInt(alumno[4]));
                listaAlumnosTXT.add(a);
            }
        } catch (Exception e){
            System.out.println("Error!");
        }
    }

}
