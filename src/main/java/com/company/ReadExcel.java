package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
public class ReadExcel {

    public static void main(String[] args) throws IOException {
        InputStream ExcelFileToRead = new FileInputStream("D:\\TestFile.xls");
        HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
        System.out.println(ExcelFileToRead);
        HSSFSheet sheet=wb.getSheetAt(0);
        HSSFRow row;
        HSSFCell cell;

        Iterator rows = sheet.rowIterator();

        while (rows.hasNext())
        {
            row=(HSSFRow) rows.next();
            Iterator cells = row.cellIterator();

            while (cells.hasNext())
            {
                cell=(HSSFCell) cells.next();

            System.out.println(cell.getRowIndex());
            }
            System.out.println();
        }
    }
}
