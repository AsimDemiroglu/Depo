package dropDown01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ödev3 {
    WebDriver driver = new ChromeDriver();
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    //Soru 3
    //1.https://inderpsingh.blogspot.com/p/demo-web-page-for-testing.html sayfasina gidin
    //2.Ismi girin , favorite number olarak 5 girin , favori renk olarak blau girin ve submit
    //butonuna bastiginizda Enter you name yazisinin uzerinde girdiginiz bilgilerle eslesen
    //verileri tek tek assert edin
    //Ornek  ( The name is SASA. The selected number is 2. The selected color(s) are
    //Blue.)
    //
    //3.Alert butonuna basin ve cikan alert de ok a tiklayin.
    //4.Confirm butonuna basin ve cikan confirm de ok a tiklayin
    //5.Promt butonuna tiklayin ve cikan ekrana name girin ve ok a tiklayin
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://inderpsingh.blogspot.com/p/demo-web-page-for-testing.html");
        WebElement isim=driver.findElement(By.id("my_name"));
        isim.click();
        isim.sendKeys("asım");
        WebElement select=driver.findElement(By.xpath("//*[@id=\"my_number\"]"));
        select.click();
        Select select1 = new Select(select);
        select1.selectByValue("5");
        WebElement renk=driver.findElement(By.xpath("//*[@id=\"my_colors\"]"));
        renk.click();
        Select renk1 = new Select(renk);
        renk1.selectByVisibleText("Blue");

        driver.findElement(By.id("confirm")).click();
        driver.findElement(By.xpath("//button[@onclick='ShowMessage()']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

//*[@id="my_number"]
//*[@id="my_colors"]

    }
    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();}
}

