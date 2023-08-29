package Selenium_Vj02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ödev02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.id("ezmob-footer-close")).click();

        driver.findElement(By.id("cookieChoiceDismiss")).click();

        WebElement firstname = driver.findElement(By.name("firstname"));

        firstname.sendKeys("deneme");

        WebElement lastname = driver.findElement(By.name("lastname"));

        lastname.sendKeys("yazar");

        driver.findElement(By.id("sex-0")).click();

        driver.findElement(By.id("exp-1")).click();

        WebElement date = driver.findElement(By.id("datepicker"));

        date.sendKeys("04.07.2021");

        driver.findElement(By.id("profession-1")).click();

        driver.findElement(By.id("tool-2")).click();

        driver.findElement(By.id("continents")).click();

        WebElement search = driver.findElement(By.id("continents"));

        search.findElement(By.xpath("//option[. = 'Europe']")).click();

        search.click();

        boolean isVisible = driver.findElement(By.xpath("//option[text()='Europe']")).isDisplayed();

        if (isVisible) {
            System.out.println("Europe seçeneği görünür.");
        } else {
            System.out.println("Europe seçeneği görünür değil.");
        }

        Thread.sleep(5000);

        driver.quit();
    }
}















