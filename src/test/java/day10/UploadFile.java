package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class UploadFile extends TestBase {

    @Test
    public void test01() {

        driver.get("https://the-internet.herokuapp.com/upload");

    WebElement dosyaSecButonu =  driver.findElement(By.id("file-upload"));

    String dosyaYolu = System.getProperty(("user.home"))+"\\Desktop\\deneme.txt";

    dosyaSecButonu.sendKeys(dosyaYolu);

    driver.findElement(By.id("file-submit")).click();


    WebElement fileUploadedYazisiElementi = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedYazisiElementi.isDisplayed());



    }
}
