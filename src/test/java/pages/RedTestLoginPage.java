package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

public class RedTestLoginPage extends TestBase {

    public RedTestLoginPage(WebDriver driver) {
        this.driver=driver;

        PageFactory.initElements(driver,this);
    }

    public RedTestLoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(name="username")
    public WebElement kullaniciAdi;

    @FindBy(name="password")
    public WebElement sifre;

    @FindBy(xpath="//button[@class='el-button primary-button el-button--default el-button--medium']")
    public WebElement loginButonu;

    @FindBy(xpath = "(//table)[2]//tr//td[1]")
    public List<WebElement> tasarrufNolar;

    @FindBy(id="crmAdminSection")
    public WebElement tasarrufSahibiYonetimiButonu;

    @FindBy(xpath="//*[text()='Tasarruf Sahibi Listesi  ']")
    public WebElement tasarrufSahibiListesiButonu;

    @FindBy(xpath = "(//table)[2]//tr")
    public List<WebElement> topCalisanlar;

    @FindBy(xpath="(//table)[2]//tr//td[3]")
    public List<WebElement> topCalisanUretimMiktari;


    public List<WebElement> getIstenenTabloIstenenSutun(int index1,int index2)
    {
       return Driver.getDriver().findElements(By.xpath("(//table)["+index1+"]//tr//td["+index2+"]"));

    }
}
