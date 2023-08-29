package IFrame04;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ödev1 extends TestBase {


    //Soru 1 Iframe
    //1.Bir class olusturun: IframeTest
    //2.https://the-internet.herokuapp.com/iframe adresine gidin.
    //3.Bir metod olusturun: iframeTest
    //4.“An IFrame containing....” textinin erisilebilir oldugunu test edin  ve  konsolda
    //yazdirin.
    //5.Text  Box’a “Merhaba Dunya!” yazin.(Once girilen text i Silin)
    //6.TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu
    //dogrulayin ve  konsolda yazdirin
    @Test
    public void IframeTest(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement soru1= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(soru1.isDisplayed());
        driver.switchTo().frame("mce_0_ifr");
        WebElement soru3=driver.findElement(By.tagName("p"));
        soru3.clear();
        soru3.sendKeys("Merhaba Dunya!");
        driver.switchTo().parentFrame();
        WebElement soru4=driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div"));
        System.out.println(soru4.getText());
        Assert.assertTrue(soru4.getText().contains("Elemental Selenium"));
        wait(3);
    }
}
