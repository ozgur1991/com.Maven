package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RedTestLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RedCaseStepDefinitions {

    RedTestLoginPage redTestLoginPage = new RedTestLoginPage();
    @Given("kullanici redcase sayfasina gider")
    public void kullaniciRedcaseSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("redcase_url"));

    }

    @Then("kullanici gecerli bir {string} girer")
    public void kullanici_gecerli_bir_girer(String kullaniciAdi) {
        redTestLoginPage.kullaniciAdi.sendKeys(kullaniciAdi);


    }

    @Then("kullanici gecersiz bir {string} girer")
    public void kullaniciGecersizBirGirer(String sifre)  {
        redTestLoginPage.sifre.sendKeys(sifre);


    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        redTestLoginPage.loginButonu.click();
    }

    @And("kullanici login olamadigini test eder")
    public void kullaniciLoginOlamadiginiTestEder() {

        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("redcase_expected_url"));
    }
}
