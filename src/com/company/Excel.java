package com.company;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


import java.util.List;

public class Excel extends Template {
    @Override
    void leerArchivo(String archivo) {
        List<Alumno> listaAlumnosExcel=Alumno.listaAlumnosExcel;
        try {
            FileInputStream excelFile = new FileInputStream(new File(archivo));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                int cont = 0;
                String alum="";
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    if (cont==3||cont==4){
                        int t=(int)currentCell.getNumericCellValue();
                        alum=alum+"-"+ t;
                    }else{
                        alum=alum+"-"+currentCell;
                    }
                    cont++;
                    if (cont==5){
                        alum=(alum.subSequence(1,alum.length())).toString();
                        String[] alumno = alum.split("-");
                        Alumno a = new Alumno(alumno[0],alumno[1],alumno[2],Integer.parseInt(alumno[3]),Integer.parseInt(alumno[4]));
                        listaAlumnosExcel.add(a);
                        cont=0;
                    }

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
