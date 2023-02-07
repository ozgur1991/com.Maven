package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AmazonPage extends BasePage {



    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@class='a-color-state a-text-bold']")
    public WebElement results;
}
