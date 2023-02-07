package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class MouseActions2 extends TestBase {

    @Test
    public void test01() {

        driver.get("https://demoqa.com/droppable");

        Actions actions = new Actions(driver);

        //"Drag me" butonunu tutup "Drop here kutusunun ustune birakacagim

        WebElement tasinacakElement = driver.findElement(By.id("draggable"));
        WebElement tasinacakHedef = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(tasinacakElement,tasinacakHedef).perform();

        //"Dropped" yazisi geldigini test edelim

        WebElement droppedYazisiElementi = driver.findElement(By.xpath("//p[text()='Dropped!']"));

        String actualDroppedYazisi = droppedYazisiElementi.getText();
        String expectedDroppedYazisi = "Dropped!";
        Assert.assertEquals(actualDroppedYazisi,expectedDroppedYazisi);
    }
}
