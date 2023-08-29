package Maven01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class maven01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");


        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));

        search.click();

        search.sendKeys("Samsung s22", Keys.ENTER);
        WebElement result= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));

        System.out.println(result.getText().split(" ")[2]);


        List<WebElement> aramaSonuclari=driver.findElements(By.xpath("//img[@data-image-source-density='1']"));

        aramaSonuclari.get(3).click();







    }
}
