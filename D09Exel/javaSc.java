package D09Exel;

import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class javaSc extends TestBase {
    @Test
    public void javasc1(){
        driver.get("https://www.isbank.com.tr/");
//        https://www.isbank.com.tr/ git
//        İş Bankası Döviz Kurları gorunur olana kadar in ve ekran goruntusu al
//        Kampanyalara görünür olana kadar asağı in ve ekran goruntusunu al

        JavascriptExecutor js=(JavascriptExecutor)driver;
        //javayı olusturduk

        WebElement dövzi= driver.findElement(By.xpath("//h3[.=' İş Bankası Döviz Kurları']"));
        //locate ettik

        js.executeScript("arguments[0].scrollIntoView(true)",dövzi );
        takeScreenShotOfPage();

        WebElement kampanyalar= driver.findElement(By.xpath("(//a[.='Kampanyalar'])[3]"));
        js.executeScript("arguments[1].scrollIntoView(true)",dövzi,kampanyalar );
        takeScreenshotOfElement(kampanyalar);


    }


    @Test
    public void jsExecuterTest2 (){

        driver.get("https://www.isbank.com.tr/");

        WebElement dövzi= driver.findElement(By.xpath("//h3[.=' İş Bankası Döviz Kurları']"));

        wait(4);
        scrollIntoViewJS(dövzi);

        wait(3);
    }

    @Test
    public void jsExecuterTest3 (){
        driver.get("https://www.isbank.com.tr/");

        wait(2);
        scrollEndJS();
        wait(3);

        scrollTopJS();
        wait(3);
    }

    @Test
    public void java03(){
        driver.get("https://www.isbank.com.tr/");

        WebElement kampanyalar= driver.findElement(By.xpath("(//a[.='Kampanyalar'])[3]"));

        scrollIntoViewJS(kampanyalar);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        wait(2);
      //  js.executeScript("arguments[0].click();",kampanyalar);

        clikJS(kampanyalar);

        wait(3);

    }


}
