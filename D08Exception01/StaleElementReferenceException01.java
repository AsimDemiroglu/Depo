package D08Exception01;


import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.security.auth.Refreshable;
import java.time.Duration;

public class StaleElementReferenceException01 extends TestBase {

    /*
    "facebook" sayfasına gidiniz
    Yeni hesap olustura tıklayınız (3 sn bekleyiniz)
    Sayfayı refresh() yapınız. (3 sn bekleyiniz)
    Sifremi unuttuma gidiniz (3 sn bekleyiniz)
    Geri geliniz (3 sn bekleyiniz)
    Yeni hesap olustura tıklayınız

     */

    @Test
    public void test(){
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement giriş= driver.findElement(By.className("_6ltg"));
        giriş.click();
        wait(3);
        driver.navigate().refresh();
        driver.findElement(By.className("_6ltj")).click();
        wait(3);
        driver.navigate().back();
        wait(3);
        WebElement giriş2= driver.findElement(By.className("_6ltg"));
        giriş2.click();

    }
}
