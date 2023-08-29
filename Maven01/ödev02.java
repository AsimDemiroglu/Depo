package Maven01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ödev02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.expandtesting.com/");

        WebElement search = driver.findElement(By.id("search-input"));
        search.click();
        search.sendKeys("Web inputs");

        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();

        WebElement button = driver.findElement(By.xpath("//*[@id=\"examples\"]/div/div/div/div/h3/a"));
        button.click();

        WebElement number = driver.findElement(By.id("input-number"));
        number.click();
        number.sendKeys("7");

        WebElement text = driver.findElement(By.id("input-text"));
        text.click();
        text.sendKeys("Selam");

        WebElement password = driver.findElement(By.id("input-password"));
        password.click();
        password.sendKeys("123456");

        WebElement date = driver.findElement(By.id("input-date"));
        date.click();
        date.sendKeys("08/09/1990");

        WebElement btn = driver.findElement(By.id("btn-display-inputs"));
        btn.click();

        WebElement numberOut = driver.findElement(By.id("output-number"));
        String numberOutText = numberOut.getText();
        int numberOutValue = Integer.parseInt(numberOutText);

        int number2 = 7;
        if (numberOutValue == number2) {
            System.out.println("İki sayı da aynı.");
        } else {
            System.out.println("İki sayı aynı değil.");
        }

        WebElement textOut = driver.findElement(By.id("output-text"));
        String text1 = "Selam";

        if (textOut.getText().equals(text1)) {
            System.out.println("iki yazı aynıdır");
        } else {
            System.out.println("iki yazı aynı değildir");
        }

        WebElement passwordOut = driver.findElement(By.id("output-password"));
        String passwordOutText = passwordOut.getText();
        int passwordOutValue = Integer.parseInt(passwordOutText);

        int password2 = 123456;
        if (passwordOutValue == password2) {
            System.out.println("İki sayı da aynı.");
        } else {
            System.out.println("İki sayı aynı değil.");
        }

        WebElement dateOut = driver.findElement(By.id("output-date"));
        String date1 = "1990-09-08";

        if (dateOut.getText().equals(date1)) {
            System.out.println("İki tarih aynıdır.");
        } else {
            System.out.println("İki tarih aynı değildir.");
        }
        WebElement cIButton= driver.findElement(By.xpath("//button[@id='btn-clear-inputs']"));
        if (cIButton.isEnabled()&& cIButton.isDisplayed()){
            System.out.println("tıklanabilir ");
        }else System.out.println("tıklanamaz");

    }
}

