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
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Iframe {


    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/iframe");

    }

    @AfterClass
    public void tearDown() {
        //  driver.close();

    }

    @Test
    public void iframeTest() {
        //iframe bir html sayfasi icine gomulu baska bir html sayfasi gibi dusunulebilir
        //iframe tagiyla baslar
      //  driver.switchTo().frame(0);
        WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iFrame);

        //css selectorde
        //id ile bulmak icin #
        //class ile bulmak icin . kullanilir

        WebElement yaziAlani = driver.findElement(By.cssSelector(".mce-content-body "));

        yaziAlani.clear();

        yaziAlani.sendKeys("Merhaba Dunya");

        driver.switchTo().defaultContent();

       WebElement link =  driver.findElement(By.linkText("Elemental Selenium"));

        SoftAssert softAssert = new SoftAssert();
       softAssert.assertTrue(link.isDisplayed());

        System.out.println(link.getText());

        softAssert.assertAll();



    }
}