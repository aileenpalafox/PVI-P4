package com.company;

import java.util.List;

public class Main extends Template{

    public static void main(String[] args){
        String excelfile = "src/res/lista_alumnos.xlsx";
        String txtfile = "src/res/lista_alumnos.txt";

        Template Excel = new Excel();
        Excel.leerArchivo(excelfile);
        Excel.Imprime(Alumno.listaAlumnosExcel);
        Excel.Ordena(Alumno.listaAlumnosExcel);
        System.out.println();
        Excel.Imprime(Alumno.listaAlumnosExcel);

        Template TXT = new TXT();
        TXT.leerArchivo(txtfile);
        TXT.Ordena(Alumno.listaAlumnosTXT);

/*
        System.out.println("TXT");
        System.out.println(Alumno.listaAlumnosTXT.get(0).nombre);
        System.out.println("EXCEL");
        System.out.println(Alumno.listaAlumnosExcel.get(1).calificacion);
         */



    }


    @Override
    void leerArchivo(String archivo) {
    }

}
