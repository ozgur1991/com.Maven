package day02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class BeforeAfter {

    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("before calisti");
    }

    @After
    public void tearDown() {
        driver.close();
        System.out.println("after calisti");
    }

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        System.out.println("1. test calisti");
    }

    @Test
    public void test02() {
        driver.get("https://redcase.birevim.com");
        System.out.println("2.test calisti");
    }

}
