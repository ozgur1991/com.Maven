package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class HandleWindows01 extends TestBase {


    @Test
    public void test01() {

        driver.get("https://the-internet.herokuapp.com/iframe");

        String ilkSayfaHandleDegeri = driver.getWindowHandle();

        driver.findElement(By.linkText("Elemental Selenium")).click();

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

      WebElement sauceLabsElementYazisi=  driver.findElement(By.xpath("//a[text()='Sauce Labs']"));

        System.out.println(sauceLabsElementYazisi.getText());
    }
}
