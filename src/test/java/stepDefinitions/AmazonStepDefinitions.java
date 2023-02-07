package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }

    @When("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("iphone"+ Keys.ENTER);

    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.results.getText().contains("iphone"));
    }

    @When("kullanici tea pot icin arama yapar")
    public void kullaniciTeaPotIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("tea pot"+ Keys.ENTER);
    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarinTeaPotIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.results.getText().contains("tea pot"));
    }

    @When("kullanici flower icin arama yapar")
    public void kullaniciFlowerIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("flower"+ Keys.ENTER);
    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarinFlowerIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.results.getText().contains("flower"));
    }

    @When("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.searchBox.sendKeys(arananKelime+ Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.results.getText().contains(arananKelime));
    }


}
