package D07_SeWaits;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ödev1 extends TestBase {


    //Soru 1 Implicitly ve Explicitly Wait
    //
    //1. Bir class olusturun : WaitTest
    //
    //2. Iki tane metod olusturun : implicitWait() , explicitWait()
    //
    //     Iki metod icin de asagidaki adimlari ayri ayri test edin.
    //
    //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
    //
    //4. Remove butonuna basin.
    //
    //5. “It’s gone!” mesajinin goruntulendigini test edin
    //
    //6. Add buttonuna basin
    //
    //7. It’s back mesajinin gorundugunu test edin
    @Test
    public void expilictWait() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement removeButton = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));
        removeButton.click();
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Assert.assertEquals("It's gone!", message.getText());
        System.out.println("---------------------------------------------------------------------------------------");
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));
        addButton.click();
        WebElement message2 = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));
        Assert.assertEquals("It's back!", message2.getText());
    }
    @Test
    public void implicitWait() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement removeButton = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));
        removeButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement message = driver.findElement(By.id("message"));
        Assert.assertEquals("It's gone!", message.getText());
        System.out.println("---------------------------------------------------------------------------------------");
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));
        addButton.click();
        WebElement message2 = driver.findElement(By.xpath("//*[@id=\"message\"]"));
        Assert.assertEquals("It's back!", message2.getText());
    }
}
