package Selenium_Vj03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RealativeLocaters {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement boston=driver.findElement(By.id("boston"));

        WebElement mountie=driver.findElement(By.id("mountie"));

        WebElement amsterdam=driver.findElement(By.id("amsterdam"));

        WebElement berlin=driver.findElement(By.id("berlin"));

        driver.findElement(with(new By.ByTagName("li")).below(boston).toLeftOf(mountie)).click();

        Thread.sleep(3000);

        driver.close();
    }


}
