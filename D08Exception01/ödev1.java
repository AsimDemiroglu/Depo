package D08Exception01;

import Utulities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ödev1 extends TestBase {
    @Test
    public void ödev() throws InterruptedException, IOException {
        //Soru 1 Screen Shot
        //1. https://www.n11.com/ sayfasina gidin
        //2. Elektronik bolumunden bilgisayari  secin
        //3. Cikan sayfayi kaydetmek uzere projenizin icinde herhangi bir dosya acin ve bu dosyanin path ini
        //kullanarak bu resmi kaydedin.
        //4. Sayfayi kapatin.

        driver.get("https://www.n11.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.findElement(By.xpath("//*[@id=\"myLocation-close-info\"]")).click();
//        driver.switchTo().frame(1);
//        driver.findElement(By.className("banner__reject-button")).click();
//        driver.findElement(By.id("dn-slide-deny-btn")).click();
//        driver.switchTo().alert().dismiss();
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement techn = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/ul/li[2]/a"));
        actions.clickAndHold(techn).perform();
        WebElement pc = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/ul/li[2]/div/ul/li[2]/a/img"));
        pc.click();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File goruntu = ts.getScreenshotAs(OutputType.FILE);
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String kayıt= System.getProperty("user.dir")+"\\TestOutput\\EkranGoruntuleri\\"+currentTime+"kayıt.png";
        File kayitYeri = new File(kayıt);
        FileUtils.copyFile(goruntu, kayitYeri);

    }
}

