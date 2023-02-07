package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
       // driver.close();

    }

    @Test
    public void DropDownTesti() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        //dropdown kullanabilmek icin 3 asama yapamiz gerekir
        //1. asama dropdown'u locate edelim

        WebElement dropDownMenu = driver.findElement(By.xpath("//select[@id='dropdown']"));
        //2.asama
        Select dropDownListe = new Select(dropDownMenu);
        //3. asama dropdown menusunden istedigimiz option i secebiliriz



        //1. index kullnarak secenek 1 i (Option 1) i secelim ve bunu yazdiralim

        dropDownListe.selectByIndex(1);//secimi yaptik

        System.out.println("listeden "+dropDownListe.getFirstSelectedOption().getText());
        System.out.println("get Text "+dropDownMenu.getText());
    }

    @Test
    public void degerKullanma() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement acilirListe = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(acilirListe);
        select.selectByValue("2");

        System.out.println(select.getFirstSelectedOption().getText());

    }

    @Test
    public void gorunurIsim() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement acilirListe = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(acilirListe);

        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
    }


    @Test
    public void tumListe() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement acilirListe = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(acilirListe);

        List<WebElement> tumOpsiyonlar = select.getOptions();

        System.out.println("===================");

        for (WebElement opsiyon:tumOpsiyonlar
             ) {

            System.out.println(opsiyon.getText());

        }

        Assert.assertEquals(3, tumOpsiyonlar.size());

    }
}
