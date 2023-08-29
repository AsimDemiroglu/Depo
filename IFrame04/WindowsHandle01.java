package IFrame04;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowsHandle01 extends TestBase {

    // https://www.the-internet.herokuapp.com/windows adresine gidin.
    //1.Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    //2.Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    //3.Click Here butonuna basın.
    //4.Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
    //5.Sayfadaki textin “New Window” olduğunu doğrulayın.
    //6.Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement text=driver.findElement(By.tagName("h3"));
        Assert.assertEquals("Opening a new window",text.getText());
        String act=driver.getTitle();
        String expct="The Internet";
        Assert.assertEquals(act,expct);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        Set<String> handle=driver.getWindowHandles();

        for (String w : handle){
            if (expct.contains(w)){
                driver.switchTo().window(w);
                break;
            }
        }
        String act1=driver.getTitle();
        String expct1="New Window";
        Assert.assertEquals(expct1,act1);

    }

}
