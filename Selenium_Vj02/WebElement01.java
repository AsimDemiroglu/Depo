package Selenium_Vj02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("http://amazon.com");

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Iphone");

        Thread.sleep(5000);

        driver.close();
    }
}
