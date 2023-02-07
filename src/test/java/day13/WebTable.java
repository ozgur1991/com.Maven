package day13;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.RedTestLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class WebTable {

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("redcase_url"));
        RedTestLoginPage redTestLoginPage = new RedTestLoginPage();

        redTestLoginPage.kullaniciAdi.clear();
        redTestLoginPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        redTestLoginPage.sifre.clear();
        redTestLoginPage.sifre.sendKeys(ConfigReader.getProperty("sifre"));
        redTestLoginPage.loginButonu.click();
        Thread.sleep(2000);
        redTestLoginPage.tasarrufSahibiYonetimiButonu.click();
        redTestLoginPage.tasarrufSahibiListesiButonu.click();

        Thread.sleep(2000);

        for (WebElement each: redTestLoginPage.tasarrufNolar) {

            System.out.println(each.getText());
        }


        }
    }

