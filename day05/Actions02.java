package day05;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions02 extends TestBase {
    /*
         1 - Amazon home sayfasina git
        2 - Sag ust bolumde bulunan "Account & List" menüsüne git.
        3 - Acilan pencerede Account linkine tikla
        4 - Acilan sayfanin title inin Your Account icerdigini dogrula
     */
    @Test
    public void test01(){
        driver.get("https://www.amazon.com/amazonprime");

        WebElement account1= driver.findElement(By.id("nav-link-accountList"));

        Actions actions=new Actions(driver);
        actions.moveToElement(account1).perform();
        wait(3);



        WebElement account= driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span"));
        //Assert.assertTrue(account.isDisplayed());
        account.click();
        Assert.assertTrue(driver.getTitle().contains("Your Account"));



    }
}
