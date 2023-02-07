package day05;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    WebDriver driver;

    String cumle = "Selenium cok kolay bir tool";

    @Test
    public void hardAssertion() {
        Assert.assertTrue(cumle.contains("Selenium"));
        System.out.println("1");
        Assert.assertTrue(cumle.contains("kolay"));
        System.out.println("2");
        Assert.assertTrue(cumle.contains("cok"));
        System.out.println("3");
        Assert.assertTrue(cumle.contains("toolkl"));
        System.out.println("4");
    }

    @Test
    public void softAssertion() {

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(cumle.contains("Selenium"));
        System.out.println("1");
        softAssert.assertTrue(cumle.contains("kolay"));
        System.out.println("2");
        softAssert.assertTrue(cumle.contains("cokgh"));
        System.out.println("3");
        softAssert.assertTrue(cumle.contains("tool"));
        System.out.println("4");

        softAssert.assertAll();




    }
}
