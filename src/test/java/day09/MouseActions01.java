package day09;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class MouseActions01 extends TestBase {


    @Test
    public void test01() throws InterruptedException {
      driver.get("https://the-internet.herokuapp.com/context_menu");

      //Mouse kullanabilmek icin Actions classindan obje olusturmamiz lazim

        Actions actions = new Actions(driver);

        //mouse action'i yapacagim web elementini locate etmeliyim

     WebElement cizgiliAlan =  driver.findElement(By.id("hot-spot"));

     //action objesi ile locate ettigim webelementi kullanip benden istenen islemi yapacagim

        actions.contextClick(cizgiliAlan).perform();

        //Alerte cikan yazinin "You selected a context menu" oldugunu test edelim

        String alertYazisi = driver.switchTo().alert().getText();

        String expectedYazi = "You selected a context menu";

        Assert.assertEquals(alertYazisi,expectedYazi);

        //JS alerti kapatalim

        driver.switchTo().alert().accept();

        //contextmenu acik kaliyor onu kapatalim

        Thread.sleep(2000);

        cizgiliAlan.click();

    }


}
