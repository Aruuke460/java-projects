package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private static Properties properties = new Properties();

    static {
        String path = "Config.properties";

        try {
            FileInputStream file = new FileInputStream(path);
            properties.load(file);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }


}