package day10;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class IsExist {


   @Test
           public void test() {
       //masaustunde flower.jpeg ismindeki dosyanin oldugunu test edecegim

       String mainPath = System.getProperty("user.home");

       String dosyaYolu = mainPath + "\\Desktop" + "\\Flower.jpeg";

       System.out.println(dosyaYolu);

       Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
   }
}
