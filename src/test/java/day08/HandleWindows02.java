package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.Set;

public class HandleWindows02 extends TestBase {


    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/windows");

        //Sayfadaki textin "opening a window" oldugunu dogrulayin

        SoftAssert softAssert = new SoftAssert();

        WebElement yaziWebElementi = driver.findElement(By.xpath("//h3"));

        String expectedYazi = "Opening a new window";

        softAssert.assertEquals(yaziWebElementi.getText(),expectedYazi);

        //Sayfa titlenin "The Internet" oldugunu dogrulayin

        String expectedTitle = "The Internet";

        softAssert.assertEquals(driver.getTitle(),expectedTitle);

        // Click Here kismina basin

        //click islemi yapilinca yeni sayfaya gecebilmek icin ikinci sayfa handle degeri bulmam lazim

        String ilkSayfaHandleDegeri = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        Set<String> handleListesi = driver.getWindowHandles();

        String ikinciSayfaHandleDegeri = "";

        for (String each:handleListesi)
        {
            if (!each.equals(ilkSayfaHandleDegeri))
            {
                ikinciSayfaHandleDegeri = each;
            }
        }

        driver.switchTo().window(ikinciSayfaHandleDegeri);

        //sayfadaki textin "New Window" oldugunu dogrulayin

        WebElement ikinciSayfaYaziElementi = driver.findElement(By.tagName("h3"));

        String expectedIkinciSayfaYazisi = "New Window";

        softAssert.assertEquals(ikinciSayfaYaziElementi.getText(),expectedIkinciSayfaYazisi);

        //Bir onceki pencereye geri dondukten sonra sayfa basliginin "The Internet" oldugunu dogrulayin

        driver.switchTo().window(ilkSayfaHandleDegeri);

        softAssert.assertEquals(driver.getTitle(),expectedTitle);

        softAssert.assertAll();

    }

}
