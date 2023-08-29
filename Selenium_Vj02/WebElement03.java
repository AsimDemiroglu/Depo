package Selenium_Vj02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElement03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");

       List<WebElement> tagnameAolanlar = driver.findElements(By.tagName("a"));

        System.out.println(tagnameAolanlar.size());

        List<WebElement> inputnameAolanlar = driver.findElements(By.tagName("input"));

        System.out.println(inputnameAolanlar.size());

        driver.close();
    }
}