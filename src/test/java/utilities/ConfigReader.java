package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Properties objesi oluturacagiz
    //bu objenin projenin her yerinder Class ismi ile cagrilabilmesi icin static yapiyoruz
    // bu objeye Class disindan mudahale edilmemesi icin private yapiyoruz(opsiyonel)

    static private Properties properties;

    static {

        String path = "configuration.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            //Bu class calistiginda static block once calisir
            //filelinputstream objesi calisacak ve okuduu bilgileri
            //properties objesine yukleyecek


            properties.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }

    }

