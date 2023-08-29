package D08Exception01;

import Utulities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot02 extends TestBase {
    @Test
    public void tst(){
        driver.get("https://www.trendyol.com/");
        takeScreenShotOfPage();

    }
    @Test
    public void webElemenTestScreensho() throws IOException {
         /*
        https://the-internet.herokuapp.com/
        "Fork me on GitHub" ELEMENTİNİN GÖRÜNTÜSÜNÜ AL
         */
        driver.get(" https://the-internet.herokuapp.com/");
        WebElement take= driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']"));
        File taked=take.getScreenshotAs(OutputType.FILE);

        String currentTime=new SimpleDateFormat("yyyyMMMMddhhmmss").format(new Date());

        String deneme=System.getProperty("user.dir");
        System.out.println(deneme);
        String dataKayıt=System.getProperty("user.dir")+"\\TestOutput\\EkranGoruntuleri\\"+currentTime+"kayıt.png";

        FileUtils.copyFile(taked, new File(dataKayıt));


    }
    @Test
    public void test03(){
           /*
        https://the-internet.herokuapp.com/
        "Fork me on GitHub" ELEMENTİNİN GÖRÜNTÜSÜNÜ AL
         */
        driver.get(" https://the-internet.herokuapp.com/");
        WebElement take= driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']"));
        takeScreenshotOfElement(take);
    }
}
