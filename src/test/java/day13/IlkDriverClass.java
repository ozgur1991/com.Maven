package day13;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class IlkDriverClass {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("redtest_url"));
    }
}
