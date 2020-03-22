package test22Example;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example {
    @Test
    public void exam1() throws IOException {
        String path  = "test22.properties";
        Properties properties = new Properties();
        FileInputStream file2 = new FileInputStream(path);

        properties.load(file2);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
    }
}
