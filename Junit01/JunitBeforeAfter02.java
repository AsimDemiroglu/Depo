package Junit01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JunitBeforeAfter02 {
    WebDriver driver = new ChromeDriver();

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() {
        driver.get("https://www.google.com.tr/?hl=tr");
    }


    @Test
    public void test02() {
        driver.get("https://www.hepsiburada.com/");
    }

    @Test
    public void test03() {
        driver.get("https://www.trendyol.com/");
    }

    @After
    public void teardown() {
        driver.close();
    }

}
