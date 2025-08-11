package Testng;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class excelUtil {
@DataProvider(name="getData")
    public static Object[][] getData() throws IOException {
        String Path="src/main/resources/data.xlsx";
        FileInputStream fis=new FileInputStream(Path);
        Workbook workbook=new XSSFWorkbook(fis);
        Sheet sheet=workbook.getSheet("Sheet1");
        DataFormatter formatter=new DataFormatter();

        int countRow =sheet.getPhysicalNumberOfRows();
        int countCol=sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] data =new Object[countRow-1][countCol];

        for(int i =1;i<countRow;i++){
            Row row = sheet.getRow(i);
            for(int j=0;j<countCol;j++){

                Cell cell=row.getCell(j);
                data[i-1][j]=formatter.formatCellValue(cell);

            }

        }
        workbook.close();
        fis.close();
        return data;
    }
}
