package day6FileExit;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Watchable;

public class FileExit03 extends TestBase {
    @Test
    public void test(){
        /*
    Ornek : http://the-internet.herokuapp.com/upload    adresine gidelim
    chooseFile butonuna basalım
    Yuklemek istediginiz dosyayi secelim.
    Upload butonuna basalim.
    "File Uploaded!" textinin goruntulendigini test edelim.

     */
        driver.get("http://the-internet.herokuapp.com/upload");
        wait(5);
        WebElement upload= driver.findElement(By.id("file-upload"));
        upload.click();

        String uploadFile="C:\\Users\\Bahadır\\Downloads\\logo.jpg";

        upload.sendKeys(uploadFile);

        WebElement uploadClick=driver.findElement(By.id("file-submit"));
        uploadClick.click();

        WebElement click=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(click.getText().contains("File Uploaded!"));
    }
}
