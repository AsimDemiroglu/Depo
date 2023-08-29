package D07_SeWaits;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWait1 extends TestBase {


    @Test
    public void test(){

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();

        Wait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(3))      //kontrol etme sıklıgı buda / bu ve bundan sonrakiler opsiyonel
                .withMessage("ıgnore")                   //mesaj yazdırdı
                .ignoring(NoSuchElementException.class);//Exception handle ediyor
        WebElement asos = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
        System.out.println(asos.getText());
        Assert.assertEquals("Hello World!", asos.getText());

//        https://the-internet.herokuapp.com/dynamic_loading/1
//        Start buttonuna tıkla//*[@id="start"]/button
//        Hello World! Yazının sitede oldugunu test et//*[@id="finish"]/h4

    }
}
