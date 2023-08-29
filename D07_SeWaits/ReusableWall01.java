package D07_SeWaits;

import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReusableWall01 extends TestBase {
    @Test
    public void test(){
        //        https://the-internet.herokuapp.com/dynamic_loading/1
//        Start buttonuna tıkla//*[@id="start"]/button
//        Hello World! Yazının sitede oldugunu test et//*[@id="finish"]/h4

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        WebElement helloWord=driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
        waitForVisibility(helloWord,20);
    }
}
