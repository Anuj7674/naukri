package prac;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataRead {


    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/data.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();

        for(int i=0;i<rowCount;i++){
            Row row=sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();

            for(int j=0;j<cellCount;j++){
                Cell cell =row.getCell(j);
                DataFormatter formatter=new DataFormatter();
                String value = (cell == null) ? "" : formatter.formatCellValue(cell);
                System.out.print(value);
            }
            System.out.println();
        }
       workbook.close();
        fis.close();
    }
}