package day05;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions01 extends TestBase {

    /*
     https://the-internet.herokuapp.com/context_menu sitesine gidelim
3 - Cizili alan uzerinde sag clickyapalim
4 - Alert'te cikan yazinin "You selected a context menu"oldugunu Test edelim.
5 - Tamam diyerek alert'ikapatalim
6 - Elemental Selenium linkinetiklayalim
7 - Acilan sayfada h1 taginda "Elemental Selenium" yazdigini testedelim (edited)
     */

    @Test
    public void ActionsTest01(){
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement box =driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.
                contextClick(box).
                perform();

        //Alert'te cikan yazinin "You selected a context menu"oldugunu Test edelim.

        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());

        wait(3);
        //Tamam diyerek alert'ikapatalim
        driver.switchTo().alert().accept();

        //Elemental Selenium linkine tiklayalim

        WebElement link=driver.findElement(By.xpath("//a[@href='http://elementalselenium.com/']"));

        Assert.assertTrue(link.isDisplayed());

        wait(3);
        link.click();

        switchToWindow(1);


        //7 - Acilan sayfada h1 taginda "Elemental Selenium" yazdigini testedelim (edited)
        //Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("Elemental Selenium"));
        System.out.println(driver.findElement(By.tagName("h1")).getText());



    }
}