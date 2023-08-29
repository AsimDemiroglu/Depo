package D08Exception01;

import Utulities.TestBase;
import net.bytebuddy.asm.Advice;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Screenshot01 extends TestBase {
    @Test
    public void test() throws IOException {


        driver.get("https://www.hepsiburada.com/");

        WebElement box= driver.findElement(By.xpath("(//div[*='Ürün, kategori veya marka ara'])[1]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        driver.switchTo().alert().dismiss();

        box.sendKeys("bisiklet", Keys.ENTER);

        WebElement box2=driver.findElement(By.id("SearchResultSummary_947b18ef-d75a-4e95-e6c0-074f62d917b0"));

        Assert.assertTrue(box2.getText().contains("Bisiklet ile ilgili"));

        //TakesScreenshot ts=(TakesScreenshot)driver;   

        File goruntu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        String kayıt=System.getProperty("user.dir")+"\\TestOutput\\EkranGoruntuleri\\"+currentTime+"kayit1.png";

        System.out.println(kayıt);

        File kayıtyeri=new File(kayıt);

        FileUtils.copyFile(goruntu, kayıtyeri);


    }
}
