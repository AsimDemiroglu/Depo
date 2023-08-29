package day6FileExit;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExit02 extends TestBase {
    @Test
    public void tst(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        WebElement downloadFile = driver.findElement(By.xpath("//a[.='b10 all test cases, code.docx']"));
        downloadFile.click();

        String userHome=System.getProperty("user.home");

        String checkFilePath=userHome+"//Downloads//b10 all test cases, code.docx";

        System.out.println(checkFilePath);
        Boolean result=Files.exists(Paths.get(checkFilePath));

        Assert.assertTrue(result);

    }
}
