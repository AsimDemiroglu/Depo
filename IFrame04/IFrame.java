package IFrame04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IFrame {
    public WebDriver driver = new ChromeDriver();
    @Before
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
 /*
https://the-internet.herokuapp.com/iframe sayfasına gidin :
Baslıkta "Editor" texti var mi
İçerdeki metinde "Your content goes here." yazısını silin
ve İframe in içindeyim
footer daki 'Povered By' yazisini varligini test edilip
 */
    @Test
    public void test01(){
        driver.get( "https://the-internet.herokuapp.com/iframe");
        WebElement title=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(title.getText().contains("Editor"));
        driver.switchTo().frame("mce_0_ifr");  //iframe bölümüne girip
        //icerdeki yazının tag namei alıp sildik
        WebElement remove=driver.findElement(By.tagName("p"));
        remove.clear();
        remove.sendKeys("İframe icindeyim");
        driver.switchTo().parentFrame();//iframeden dısarı cıktık
        WebElement search=driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div"));
        Assert.assertTrue(search.getText().contains("Powered by"));//burda girdigimiz yazı varmı diye kontrol eder

    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}


