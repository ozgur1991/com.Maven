package day07;

import org.testng.annotations.Test;
import utilities.TestBase;

public class TestBase01 extends TestBase {

    @Test
    public void test01() {

        driver.get("https://www.amazon.com");

     //   TestBase test = new TestBase();

        //eger bir classtan nesne olusturulmasini istemiyorsak
        // o classi abstract yapariz
    }
}
