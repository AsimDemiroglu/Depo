package D09Exel;

import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javaSc02 extends TestBase {
    @Test
    public void javaScriptChangeValue(){
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("document.getElementById('elementID').setAttribute('value', 'new value for element')");

        driver.get("https://www.enuygun.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        wait(3);
//        js.executeScript("document.getElementById('OriginInput').setAttribute('value','İstanbul')");
//        wait(3);

        //APjFqb id

        setAttiributeValueJS("OriginInput","ankara");


    }
}
