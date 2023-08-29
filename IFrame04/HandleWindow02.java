package IFrame04;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HandleWindow02 extends TestBase {
    @Test
    public void Test01(){
        //      Multiple Window
        // 1 parametre alir : Geciş yapmak istedigim sayfanin Title
        // Ornek:
        // driver.get("https://www.the-internet.herokuapp.com/windows");
        // switchToWindow("New Window");   ==> Title()i  -->  New Window  olan sayfayi acar
        // switchToWindow("The Internet")  ==> Title()i  --> The Internet olan sayfayi acar

        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement text=driver.findElement(By.tagName("h3"));

        Assert.assertEquals("Opening a new window",text.getText());

        String act=driver.getTitle();
        String expct="The Internet";
        Assert.assertEquals(act,expct);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        switchToWindow("New Window");
        Assert.assertEquals("New Window",driver.getTitle());

        //6.asama


        WebElement h3=driver.findElement(By.tagName("h3"));
        Assert.assertEquals("New Windows",h3.getText());

        switchToWindow("The Internet");
        Assert.assertEquals("The Internet",driver.getTitle());

    }
    public static void switchToWindow(int windowNumber){
        List<String> list=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(windowNumber));
    }

}
