package day01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
    /*
   “https://www.saucedemo.com” Adresine gidin
    2. Username kutusuna “standard_user” yazdirin
    3. Password kutusuna “secret_sauce” yazdirin
    4. Login tusuna basin
    5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
    6. Add to Cart butonuna basin
    7. Alisveris sepetine tiklayin
    8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
    9. Sayfayi kapatin
     */


    @Test
    public void test001() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ozgur.asula/.m2/repository/webdriver/chromedriver/win32/106.0.5249.61/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

      String urunAdi =  driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).getText();

        System.out.println(urunAdi);

        driver.findElement(By.id("item_4_title_link")).click();

        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.id("shopping_cart_container")).click();

        String sepettekiUrunAdi = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).getText();

        System.out.println(sepettekiUrunAdi);

        Assert.assertEquals("Urun eklenemedi",urunAdi,"urun");
        System.out.println("Urun basariyla eklendi");
        //Assert.assertEquals(Fail olma durumunda yazamasi istenen mesaj,Beklenen deger,Gercek deger)






    }
}
