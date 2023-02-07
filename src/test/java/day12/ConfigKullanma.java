package day12;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.RedTestLoginPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class ConfigKullanma extends TestBase {


    @Test
    public void redTestLogin() throws InterruptedException {
    driver.get(ConfigReader.getProperty("redtest_url"));

        RedTestLoginPage redTestLoginPage = new RedTestLoginPage(driver);

        redTestLoginPage.kullaniciAdi.clear();
        redTestLoginPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        redTestLoginPage.sifre.clear();
        redTestLoginPage.sifre.sendKeys(ConfigReader.getProperty("sifre"));
        redTestLoginPage.loginButonu.click();

        Thread.sleep(3000);

        String actual_url=driver.getCurrentUrl();

        Assert.assertEquals(actual_url,ConfigReader.getProperty("redtest_expected_url"));
        System.out.println("Basariyla login olundu");


    }

    @Test
    public void redPreLogin() {
        driver.get(ConfigReader.getProperty("redpre_url"));

        RedTestLoginPage redTestLoginPage = new RedTestLoginPage(driver);

        redTestLoginPage.kullaniciAdi.clear();
        redTestLoginPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        redTestLoginPage.sifre.clear();
        redTestLoginPage.sifre.sendKeys(ConfigReader.getProperty("sifre"));
        redTestLoginPage.loginButonu.click();


    }

    @Test
    public void redCaseLogin() {
        driver.get(ConfigReader.getProperty("redcase_url"));

        RedTestLoginPage redTestLoginPage = new RedTestLoginPage(driver);

        redTestLoginPage.kullaniciAdi.clear();
        redTestLoginPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        redTestLoginPage.sifre.clear();
        redTestLoginPage.sifre.sendKeys(ConfigReader.getProperty("sifre"));
        redTestLoginPage.loginButonu.click();


    }

}
