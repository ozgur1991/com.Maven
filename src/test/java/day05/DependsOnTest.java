package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DependsOnTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public void tearDown() {
        //  driver.close();

    }

    @Test
    public void test01HomePage() {
        driver.get("https://www.amazon.com");
        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test(dependsOnMethods = "test01HomePage")
    public void test02Search() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        String searchText = "Nutella";
        searchBox.sendKeys(searchText + Keys.ENTER);

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(searchText));
    }

    @Test(dependsOnMethods = "test02Search")
        public void test03() {
            System.out.println("Acaba calisti mi?");
        }
    }
