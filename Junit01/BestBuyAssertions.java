package Junit01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BestBuyAssertions {
    WebDriver driver = new ChromeDriver();

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    //Bir class oluşturun: BestBuyAssertions
    //2) https://www.bestbuy.com/Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
    //3) Sayfa URL’inin https://www.bestbuy.com/‘a esit oldugunu test edin
    //4) titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //5) logoTest => BestBuy logosunun görüntülendiginitest edin

@Test
public void test(){
        driver.get("https://www.bestbuy.com/");

        String url=driver.getCurrentUrl();

        Assert.assertEquals(url,"https://www.bestbuy.com/");

        String title= driver.getTitle();

        Assert.assertTrue(title.contains("Rest"));

        WebElement bestBuyLogo=driver.findElement(By.xpath("//*[@class='block']"));

        Assert.assertTrue(bestBuyLogo.isDisplayed());



}









    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }


}
