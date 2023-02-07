package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Priority {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("before method calisti");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        System.out.println("after method calisti");
    }

    @Test
    public void test01() {
        System.out.println("test01 calisti");
    }

    @Test
    public void ikinciTest() {
        System.out.println("ikinci test calisti");
    }

    @Test (priority = 1)
    public void yazdimTest() {
        System.out.println("yazdim test calisti");
    }
}
//TestNg de testler alfabetik siraya gore calisir
//priority ile testler numaralandirilarak calisma sirasina konabilir
//priorty default degeri 0 oldugu icin priorty yazmayan testler alfabetik
//siraya gore once calisir. priority olan testler sonra calisir