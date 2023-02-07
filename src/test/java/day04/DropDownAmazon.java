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

public class DropDownAmazon {
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
    public void kategoriSayisiTesti() {
        //arama kutusunun yanindaki kategori sayisinin 28 oldugunu test edin

        driver.get("https://www.amazon.com");

        WebElement dropDownListe = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select = new Select(dropDownListe);

        int expectedOpsiyonSayisi = 28;
        int actualOpsiyonSayisi = select.getOptions().size();

        Assert.assertEquals(expectedOpsiyonSayisi,actualOpsiyonSayisi);
    }
}
