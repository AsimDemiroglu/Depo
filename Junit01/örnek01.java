package Junit01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class örnek01 {
//Ornek : https://the-internet.herokuapp.com/checkboxes sayfasina gidin.
//1.Checkbox1 ve checkbox2 elementlerini locate edin.
//2.Checkbox1 seçili değilse onay kutusunu tıklayın
//3.Checkbox2 seçili değilse onay kutusunu tıklayın
    WebDriver driver = new ChromeDriver();
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    //*[@id="checkboxes"]/input[1]
    //*[@id="checkboxes"]/input[2]
    @Test
    public void test01() throws InterruptedException {
       driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement bir = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        WebElement iki = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        Thread.sleep(3000);

        if (!bir.isSelected()){
            bir.click();
        }else {
            System.out.println("birinci kutu secili");
        }

        if (!iki.isSelected()) {
            iki.click();
        }else {
            System.out.println("ikinci kutu secili");
        }

    }



    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
