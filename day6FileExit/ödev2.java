package day6FileExit;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.yaml.snakeyaml.events.ImplicitTuple;

import java.time.Duration;

public class ödev2 extends TestBase {
    @Test
    public void test1(){
        //Soru 2 File Upload Download
        //1. http://demo.guru99.com/test/upload/ sayfasina gidin
        //2. Choose File yazan yeri locate edin ve masa ustune
        //indirdiğiniz herhangi bir jpg dosyasini buraya yükleyin(Ornek
        //FLOWER.jpg)
        //3. Servis kosullarini kabul edip(I accept terms of service)
        //Submit File butonunu tiklayin
        //4. Yukleme işleminden sonra
        //“1 file
        //has been successfully uploaded. “
        //
        //Yazisinin ciktigini Assert edin.
        driver.get("http://demo.guru99.com/test/upload/");
        wait(5);

//
//        driver.switchTo().frame("uploadframe");
//        wait(5);

        WebElement chooseFile=driver.findElement(By.xpath("//input[@type='file']"));

        String uploadFile="C:\\Users\\Bahadır\\Desktop\\logo_720.jpg";

        chooseFile.sendKeys(uploadFile);

        WebElement terms= driver.findElement(By.id("terms"));
        terms.click();

        WebElement submitButton= driver.findElement(By.id("submitbutton"));
        submitButton.click();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement check=driver.findElement(By.id("res"));
        System.out.println(check.getText());
        Assert.assertEquals("1 file\n"+"has been successfully uploaded.",check.getText());
//        driver.switchTo().parentFrame();
        wait(5);
    }
}
