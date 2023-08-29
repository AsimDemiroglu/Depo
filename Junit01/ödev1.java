package Junit01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ödev1 {
    static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();

        driver.get("https://courses.ultimateqa.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
//Odev 1.Assertation ve Before After Methodu kullanimi
//1. https://courses.ultimateqa.com/ sayfasina gidin
//2.Acilan sayfayi maximize edin
//3.Sayfanin kendine gelmesi icin 3 saniye bekleyin
//4.Sag en ustte bulunan Sign In butonuna basin
//5.Remember me yazisinin bulundugu satirdaki tik e tiklayin
//6.Tik in secili oldugunu Assert edin.
//7.En son sayfayi minimize edin.
//8.Sayfayi kapatin.
//Not : 1 2 3 ve 7 8 nolu gorevleri Before ve After Methodu kullanarak yapin

    @Test
    public void test01() throws InterruptedException {
      WebElement signin=driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li/a"));
      signin.click();

        WebElement button=driver.findElement(By.id("user[remember_me]"));
        button.click();

        Assert.assertTrue(button.isSelected());

    }


    @AfterClass
    public static void teardown() {
        driver.manage().window().minimize();
        driver.close();
    }
}
