package day10;

import org.testng.annotations.Test;

public class BilgisayardakiDosyalaraUlasma {

    @Test
    public void test01() {

        //System.getProperty("user.dir") icinde oldugumuz projenin bilgisayaraki yolunu verir

        System.out.println(System.getProperty("user.dir"));

        //System.getProperty("user.home") kullandigimiz bilgisayarin Main Pathini verir

        System.out.println(System.getProperty("user.home"));

        //Bir dosyaya ulasabilmek icin ne yapmali

        //Masaustune ulasmak istiyorum

        String masaUstuDosyaYolu = System.getProperty("user.home")+"\\Desktop";

        System.out.println(masaUstuDosyaYolu);

    }


}
