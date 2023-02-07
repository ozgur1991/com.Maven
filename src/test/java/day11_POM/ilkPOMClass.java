package day11_POM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.FaceBookLoginPage;
import utilities.TestBase;

public class ilkPOMClass extends TestBase {

    @Test
    public void gelenekselTest() {

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

        driver.findElement(By.name("firstname")).sendKeys("ozgur");
        driver.findElement(By.name("lastname")).sendKeys("asula");
    }

    @Test
    public void pomIleTest() {
        driver.get("https://www.facebook.com");

        FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage();

        faceBookLoginPage.hesapOlusturButonu.click();
        faceBookLoginPage.isim.sendKeys("ozgur");
        faceBookLoginPage.soyIsim.sendKeys("asula");

    }


}
