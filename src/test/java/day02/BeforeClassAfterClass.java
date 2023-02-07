package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeforeClassAfterClass {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("before calisti");
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
        System.out.println("after calisti");
    }

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        System.out.println("1. test calisti");
    }
  // Calismasini o an icin istemedigimz bir test varsa Ignore annotationi kullaniriz
    @Test @Ignore
    public void test02() {
        driver.get("https://redcase.birevim.com");
        System.out.println("2.test calisti");
    }
}