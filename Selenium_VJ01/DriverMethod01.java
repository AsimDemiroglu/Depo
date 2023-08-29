package Selenium_VJ01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethod01 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");

        String HepsiBurada= driver.getTitle();

        System.out.println(HepsiBurada);

        driver.manage().window().maximize();




    }
}
