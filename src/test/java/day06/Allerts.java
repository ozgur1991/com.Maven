package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Allerts {

    WebDriver driver;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }

    @AfterClass
    public void tearDown() {
        //  driver.close();

    }
    @Test
    public void acceptAlert() {

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        driver.switchTo().alert().accept();

        //cssSelector: bir locator bulma aracidir
       WebElement sonucYazisi =  driver.findElement(By.cssSelector("#result"));

       String expectedResult = "You successfully clicked an alert";
       String actualResult = sonucYazisi.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void dismissAlert() {
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();

        WebElement sonucYazisi =  driver.findElement(By.cssSelector("#result"));

        String unExpectedResult = "Ok";

        String actualResult = sonucYazisi.getText();

        Assert.assertFalse(actualResult.contains(unExpectedResult));



    }

    @Test
    public void sendKeysAlert() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        String kelime="ozgur";
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys(kelime);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        WebElement sonucYazisi =  driver.findElement(By.cssSelector("#result"));

        String actualResult = sonucYazisi.getText();

        Assert.assertTrue(actualResult.contains(kelime));



    }

}
