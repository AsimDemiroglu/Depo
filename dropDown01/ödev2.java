package dropDown01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ödev2 {
    WebDriver driver = new ChromeDriver();
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    // Soru 2
    //
    //1. https://qavbox.github.io/demo/signup/ sayfasina gidin
    //2. Full Name Email Telephone Gender Years of Experience Skills
    //Automation Tools bilgilerini girin
    //3. Submit butonuna basin
    //4. Registration Done! Yazisinin ciktigini gorun
    //5. Ok tusuna basin
    //Not: Select class ini kullanilirken mumkun oldugunca value , visible value vb farkli
    //methodlari kullanin
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/signup/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement isim=driver.findElement(By.id("username"));
        isim.click();
        isim.sendKeys("asım");
        WebElement email=driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("dmustafaasim@gmail.com");
        WebElement phone=driver.findElement(By.id("tel"));
        phone.click();
        phone.sendKeys("dmustafaasim@gmail.com");
        WebElement gender = driver.findElement(By.name("sgender"));
        gender.click();
        Select genders = new Select(gender);
        genders.selectByIndex(1);

        WebElement option = driver.findElement(By.xpath("//*[@id=\"container\"]/div[8]/input[1]"));
        option.click();
        WebElement option2 = driver.findElement(By.xpath("//*[@id=\"ip\"]"));
        option2.click();
        WebElement tool = driver.findElement(By.xpath("//*[@id=\"tools\"]"));
        Select tools = new Select(tool);
        tools.selectByIndex(0);
        WebElement submit=driver.findElement(By.id("submit"));
        submit.click();
        String atext=driver.switchTo().alert().getText();
        String exptext="Registration Done!";
        Assert.assertEquals(exptext,atext);
        driver.switchTo().alert().accept();

    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();}
}
