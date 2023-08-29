package D07_SeWaits;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ödev2 extends TestBase {
    //Soru 2
    //1. https://the-internet.herokuapp.com/add_remove_elements/ sayfasina gidin
    //
    //2. “Add Element” butona basin
    //
    //3. “Delete” butonu gorunur oluncaya kadar bekleyin
    //
    //4. “Delete” butonunun gorunur oldugunu test edin
    //
    //
    //5. Delete butonuna basarak butonu silin
    //
    //6. Delete butonunun gorun medigini test edin
    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement remove = driver.findElement(By.className("added-manually"));
        remove.isDisplayed();
        WebElement remove2 = driver.findElement(By.className("added-manually"));
        remove2.click();
        //     Assert.assertFalse(remove2);
        try {
            String xpath = "//*[@id=\"elements\"]/button";
            driver.findElement(By.xpath(xpath));
            Assert.assertFalse(remove2.isDisplayed());
            //  assert false : "Öğe bulundu!";
        } catch (NoSuchElementException e) {
            System.out.println("böyle bir öge yoktur");
        }
    }
}
