package Selenium_VJ01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class Selenium01{
        public static void main(String[] args) {

            System.setProperty("Webdriver.chrome.driver","src/drives/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com.tr/?hl=tr");
            driver.get("https://www.hepsiburada.com/");

            driver.manage().window().maximize();

          //  driver.navigate().to("https://www.amazon.com");

          //  driver.navigate().back();

            driver.navigate().refresh();

            String result = driver.getPageSource();

          //  System.out.println(result);

            driver.close();


        }
    }


