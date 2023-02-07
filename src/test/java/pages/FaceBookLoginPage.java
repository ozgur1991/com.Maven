package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestBase;

public class FaceBookLoginPage extends BasePage {



    @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    public WebElement hesapOlusturButonu;

    @FindBy(name = "firstname")
    public WebElement isim;

    @FindBy(name="lastname")
    public WebElement soyIsim;


}
