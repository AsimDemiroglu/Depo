package day6FileExit;

import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ödev1 extends TestBase {
@Test
public void test01(){
//Soru 1 Action Class
//1. "http://webdriveruniversity.com/Actions" sayfasina gidin
//2. "Hover over Me First" kutusunun ustune gelin
//3. "Link 1" e tiklayin
//4. Popup mesajini yazdirin
// 5. Popup'i tamam diyerek kapatin
// 6. "Click and hold" kutusuna basili tutun
//7. "Click and hold" kutusunda cikan yaziyi yazdirin
//8. "Double click me" butonunu cift tiklayin
    Actions actions=new Actions(driver);
    driver.get("http://webdriveruniversity.com/Actions");
    wait(3);
    WebElement hover= driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
    actions.clickAndHold(hover).perform();
    WebElement hoverClick= driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
    hoverClick.click();
    System.out.println(driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();
    wait(3);
    WebElement clickAndHold= driver.findElement(By.id("click-box"));
    actions.clickAndHold(clickAndHold).perform();
    System.out.println(clickAndHold.getText());
    WebElement doubleClick= driver.findElement(By.id("double-click"));
    actions.doubleClick(doubleClick).perform();
    wait(3);

}

}
