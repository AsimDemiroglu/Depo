package Junit01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ödev3 {
    static WebDriver driver = new ChromeDriver();
    @BeforeClass
    public static void Setup(){
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test1(){
        int a =4;
        int x=4;
        int g=7;

        Assert.assertEquals(a,x);
        Assert.assertEquals(x,a);
        Assert.assertEquals(g,x);
        Assert.assertEquals(a,g);
    }

    @Test
    public void test2(){
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement box= driver.findElement(By.id("onetrust-accept-btn-handler"));
        box.click();
        Assert.assertFalse(box.isSelected());
    }
    @Test
    public void test3(){
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement box= driver.findElement(By.id("onetrust-accept-btn-handler"));
        Assert.assertTrue(box.isDisplayed());
    }

    @AfterClass
    public static void teardown() {
        driver.manage().window().minimize();
        driver.close();
    }
}
