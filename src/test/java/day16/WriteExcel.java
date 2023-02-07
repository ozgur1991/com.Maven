package day16;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    @Test
    public void writeExcelTest() throws IOException {

        String excelPath = "src/test/Resources/ulkeler.xlsx";

       FileInputStream fileInputStream = new FileInputStream(excelPath);



        Workbook workbook = WorkbookFactory.create(fileInputStream);

        workbook.getSheetAt(0).getRow(1).createCell(4).setCellValue("NUFUS");
        workbook.getSheetAt(0).getRow(2).createCell(4).setCellValue("100000");
        workbook.getSheetAt(0).getRow(3).createCell(4).setCellValue("200000");
        workbook.getSheetAt(0).getRow(4).createCell(4).setCellValue("300000");

        FileOutputStream fileOutputStream = new FileOutputStream(excelPath);
        workbook.write(fileOutputStream);



    }
}
