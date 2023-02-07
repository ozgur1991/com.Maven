package day14;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.RedTestLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WebTable2 {

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
//        for (WebElement calisan:redTestLoginPage.topCalisanlar)
//        {
//            System.out.println(calisan.getText());
//        }

        //topcalisan listesinde 11 tane eleman oldugunu test edelim

       int expectedTopCalisanSayisi = 11;
       int actualTopCalisanElemanSayisi =  redTestLoginPage.topCalisanlar.size();

        Assert.assertEquals(expectedTopCalisanSayisi,actualTopCalisanElemanSayisi);

        for (int i=0;i<redTestLoginPage.topCalisanlar.size();i++)
        {
            System.out.println(redTestLoginPage.topCalisanlar.get(i).getText());
        }

        for(int i=0;i<redTestLoginPage.topCalisanUretimMiktari.size();i++)
        {
            System.out.println(redTestLoginPage.topCalisanUretimMiktari.get(i).getText());
        }
        int toplam=0;
        for (WebElement uretimAdetleri: redTestLoginPage.getIstenenTabloIstenenSutun(4,4))
        {
            toplam=toplam+Integer.parseInt(uretimAdetleri.getText());
        }
        System.out.println("Toplam uretim Adedi==>"+toplam);
    }
}
