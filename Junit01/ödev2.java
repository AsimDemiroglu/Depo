package Junit01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ödev2 {

    static WebDriver driver = new ChromeDriver();
    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    //3 adet test method olusturun ve sirasiyla https://www.amazon.com , https://www.facebook.com ve
    //https://www.bestbuy.com sayfalarina gidin ve her method da bu sayfalarinin title larine bir
    //degiskene atayin ve title larda sirasiyla amazon , face , best ifadelerinin gecip gecmedidigini kontrol
    //edin.( test 1 amazon sayfasi title amazon iceriyor mu ? konrol edin...)

    @Test
    public void test1() {
        driver.get("https://www.amazon.com");
        String titleAmazon = driver.getTitle();
        Assert.assertTrue(titleAmazon.contains("amazon"));
    }
    @Test
    public void test2(){
        driver.get("https://www.facebook.com");
        String titleFacebook = driver.getTitle();
        Assert.assertTrue(titleFacebook.contains("face"));
    }
    @Test
    public void test3(){
        driver.get("https://www.bestbuy.com");
        String titleBest= driver.getTitle();
        Assert.assertTrue(titleBest.contains("best"));
    }



    @AfterClass
    public static void teardown() {
        driver.manage().window().minimize();
        driver.close();
    }
}
