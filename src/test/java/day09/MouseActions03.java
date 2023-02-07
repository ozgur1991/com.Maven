package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class MouseActions03 extends TestBase {

    @Test
    public void test01() {

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//*[text()='Create New Account']")).click();

       WebElement isimKutusu = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);

        actions.
                click(isimKutusu).
                sendKeys("ozgur").
                sendKeys(Keys.TAB).
                sendKeys("deneme").
                sendKeys(Keys.TAB).
                sendKeys("dkfjdkfg@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("dkfjdkfg@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("12345678").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                perform();

    }
}
