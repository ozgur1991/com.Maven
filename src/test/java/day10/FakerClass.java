package day10;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import utilities.TestBase;

public class FakerClass extends TestBase {


    @Test
    public void faceBookFaker() {


        driver.get("https://facebook.com");

       driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

        WebElement isimKutusu = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);

        Faker faker = new Faker();

        String isim = faker.name().firstName();
        String soyIsim = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String sifre = faker.internet().password();

        actions.click(isimKutusu).
                sendKeys(isim).
                sendKeys(Keys.TAB).
                sendKeys(soyIsim).
                sendKeys(Keys.TAB).
                sendKeys(email).
                sendKeys(Keys.TAB).
                sendKeys(email).
                sendKeys(Keys.TAB).
                sendKeys(sifre).
                sendKeys(Keys.TAB).
                sendKeys(sifre).
                perform();



    }
}
