package seleniumPrac;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class excel {

    public static void main(String[] args) throws FileNotFoundException {
        String path="fdsjfsiodkfg";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook =new XSSFWorkbook();

        Sheet sheet =workbook.getSheet("Sheet1");
        int rowCount= sheet.getPhysicalNumberOfRows();

        for(int i=1;i<=rowCount; i++){

            Row row = sheet.getRow(i);
        }
    }



}
