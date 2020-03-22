//package test22Example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class PropertiesTest22 {
//    @Test
//    public void test1() throws IOException {
//        //1.Create the path of the file
//        String path = "test22.properties";
//
//        // 2.Properties object( something coming from java)
//        Properties properties = new Properties(); //we made the properties object from java
//
//        //3.Open the file using the FileInputStream
//        FileInputStream file = new FileInputStream(path);
//
//        // 4. Load the properties file into the properties object
//        properties.load(file);
//
//        // 5.Read the values using getProperty() method
//        System.out.println(properties.getProperty("name"));
//        System.out.println(properties.getProperty("username"));
//        System.out.println(properties.getProperty("password"));
//
//
//    }
//    @Test
//    public void testWithUtil() {
//
//        WebDriver driver;
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//}
