package utilities;

import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigPractice {
    private static Properties properties = new Properties();

    static {
        String path = "practice.properties";

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