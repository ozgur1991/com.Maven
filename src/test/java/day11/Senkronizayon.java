package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class Senkronizayon extends TestBase {

    @Test
    public void implicitWait() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        // "It's gone!" mesajinin gorundugunu test edin

        WebElement itsGoneYazisiElementi = driver.findElement(By.id("message"));

        Assert.assertTrue(itsGoneYazisiElementi.isDisplayed());

        //Add butonona basin

        driver.findElement(By.xpath("//*[text()='Add']")).click();

        // "It's back!" mesajinin gorundugunu test edin

        WebElement itsBackYazisiElementi = driver.findElement(By.id("message"));

        Assert.assertTrue(itsBackYazisiElementi.isDisplayed());



    }

    @Test
    public void explicit() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        // "It's gone!" mesajinin gorundugunu test edin

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement itsGoneYazisiElementi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        Assert.assertTrue(itsGoneYazisiElementi.isDisplayed());






    }



}
