package Selenium_Vj03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathSycs {
    public static void main(String[] args) throws InterruptedException {
        //Ornek : https://the-internet.herokuapp.com/add_remove_elements/ adresine gidip
        // Add Element butonunabasin
        //      Delete butonu’nun gorunur oldugunu testedin
        //      Delete tusuna basin
        //      “Add/Remove Elements” yazisinin gorunur oldugunu testedin
        System.setProperty("Webdriver.chrome.driver","src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(" https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton=driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addButton.click();

        WebElement addRemove=driver.findElement(By.xpath("//*[.='Delete']"));
        if (addRemove.isDisplayed()){
            System.out.println("delete butonu gözükür");
        }else {
            System.out.println("delete butonu gözükmüyr");
        }

        Thread.sleep(3000);

        if (addButton.isDisplayed()){
            System.out.println("addButon butonu gözükür");
        }else {
            System.out.println(" butonu gözükmüyr");
        }

        Thread.sleep(3000);





    }
}
