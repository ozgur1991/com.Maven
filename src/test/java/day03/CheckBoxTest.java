package day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBoxTest {



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
      //  driver.close();
        System.out.println("after calisti");
    }

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

      WebElement cBox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
      WebElement cBox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

      //CheckBox1 secili degilse onay kutusuna tikla
      if (!cBox1.isSelected())
      {
          cBox1.click();
      }
       //CheckBox1 secili degilse onay kutusuna tikla
        if (cBox2.isSelected())
        {
            cBox2.click();
        }

    }

}
