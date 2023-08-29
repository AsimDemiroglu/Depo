package day6FileExit;

import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions01 extends TestBase {
    @Test
    public void test01(){
        Actions actions=new Actions(driver);
        // https://jqueryui.com/droppable/ git
        //        Kaynak elementi, hedef elemente sürükleyiniz
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement tut=driver.findElement(By.id("draggable"));

        WebElement sürükleme=driver.findElement(By.id("droppable"));

        actions.dragAndDrop(tut,sürükleme).perform();


        wait(2);
    }
        @Test
        public void test02(){
            Actions actions=new Actions(driver);
            // https://jqueryui.com/droppable/ git
            //        Kaynak elementi, hedef elemente sürükleyiniz
            driver.get("https://jqueryui.com/droppable/");

            driver.switchTo().frame(0);

            WebElement tut=driver.findElement(By.id("draggable"));

            WebElement sürükleme=driver.findElement(By.id("droppable"));

            actions.clickAndHold(tut).moveToElement(sürükleme).build().perform();

            wait(2);
        }
    @Test
    public void test03(){
        Actions actions=new Actions(driver);
        // https://jqueryui.com/droppable/ git
        //        Kaynak elementi, hedef elemente sürükleyiniz
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement tut=driver.findElement(By.id("draggable"));

        WebElement sürükleme=driver.findElement(By.id("droppable"));

        actions.dragAndDropBy(tut,329,10).perform();

        wait(2);
    }
}
