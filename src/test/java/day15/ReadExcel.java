package day15;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.io.FileInputStream;

import java.io.IOException;

public class ReadExcel {


    @Test
    public void readExcel() throws IOException {

        String excelPath = "src/test/Resources/ulkeler.xlsx";

        FileInputStream fileInputStream = new FileInputStream(excelPath);

        //excel oldugu icin workBook olusturmamiz gerekiyor

        Workbook workBook = WorkbookFactory.create(fileInputStream);

        //excel'in yapisi geregi workbook icinde sheet secmeliyiz

        Sheet sheet = workBook.getSheet("Sayfa1");

        //sayfadan sonra satira ulasmaliyiz
        //satir icin index girmeliyiz, index 0'dan baslar
        //ornegin 5. satira gitmek istiyorsak index:4 olur

        Row row = sheet.getRow(4);

        //satirdan sonra cell secmemiz lazim
        //cell icin index girmeliyiz

        Cell cell = row.getCell(0);

        //su anda cell varıable nın ıcınde workbook/Sayfa1/2. satir/2.cell bigisi var

        System.out.println(cell);

    }

    @Test
    public void readExcel2() throws IOException {

        //1. method'da cell'e ulasmak icin fis,workbook,sheet,row,cell olusturduk
        //ama cell'e ulasmak icin daha kisa bir yol olarak
        //fis ve workbook olusturduktan sonra
        //Cell cell = workbook.getSheet(sayfaAdi).getRow(row indexi).getCEll(Cell indexi)

        FileInputStream fileInputStream = new FileInputStream(ConfigReader.getProperty("excel_path"));

        Workbook workBook = WorkbookFactory.create(fileInputStream);

        Cell istenenHucre = workBook.
                getSheet(ConfigReader.getProperty("excel_sayfa_ismi")).
                getRow(Integer.parseInt(ConfigReader.getProperty("excel_satir_index"))).
                getCell(Integer.parseInt(ConfigReader.getProperty("excel_cell_index")));

        System.out.println(istenenHucre);


     //sayfa1 deki satir sayisini bulun

      int satirSayisi =  workBook.getSheet(ConfigReader.getProperty("excel_sayfa_ismi")).getLastRowNum();

       System.out.println("Kayit sayisi==>"+(satirSayisi+1));
    //  getLastRowNUm son satirin indexini verir, satir sayisini bulmak icin buna 1 ekleriz


        int fizikiSatirSayisi =  workBook.getSheet(ConfigReader.getProperty("excel_sayfa_ismi")).getPhysicalNumberOfRows();

        System.out.println("Kayit sayisi==>"+fizikiSatirSayisi);

        //getPhysicalNumberOfRows aktif olarak bilgi iceren satir sayisini verir
        //0'dan baslamaz, sayma sayilarini kullanir



    }

}
