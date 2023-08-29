package Selenium_Vj02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ödev {
    //Gerekli bilgiler:
    //http://gcreddy.com/project/admin/login.php
    //Username : gcreddy
    //Password : Temp@2020
    //Aşağıdaki manuel testcase’in steplerini otomate ediniz.
    //TESTCASE STEPLERİ:
    //1. Kullanıcı http://gcreddy.com/project/admin/login.php sayfasına gider.
    //2. Username textbox kutusuna kullanıcı adını girer.
    //3. Password textbox kutusuna kullanıcı şifresini girer.
    //4. Login butonuna tıklar.
    //5. Sol menü bar üzerniden Customers sekmesine tıklar.
    //6. Açılan alt menüden Customers linkine tıklar.
    //7. Sag menü kutusnudaki Edit butonuna tıklar.
    //8. Personal bilgileri içindeki Firstname textbox kutsuna ismini girer.
    //9. Personal bilgileri içindeki Lastname textbox kutsuna soyismini girer.
    //Sayfada beş saniye bekleyin ve sekmeyi kapatın
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://gcreddy.com/project/admin/login.php");

        WebElement searchBox = driver.findElement(By.name("username"));

        searchBox.sendKeys("gcreddy");

        WebElement searchBoxPassword = driver.findElement(By.name("password"));

        searchBoxPassword.sendKeys(" Temp@2020");

        WebElement loginButton = driver.findElement(By.id("tdb1"));

        loginButton.click();

        WebElement customerButton = driver.findElement(By.id("ui-accordion-adminAppMenu-header-2"));

        customerButton.click();

        WebElement customerButton2 = driver.findElement(By.id("ui-accordion-adminAppMenu-panel-2"));

        customerButton2.click();

        WebElement editButton = driver.findElement(By.id("tdb1"));

        editButton.click();

        WebElement searchBox3 = driver.findElement(By.name("customers_firstname"));

        searchBox3.clear();

        searchBox3.sendKeys("isim");

        WebElement searchBox4 = driver.findElement(By.name("customers_lastname"));

        searchBox4.clear();

        searchBox4.sendKeys("soyisim");

        Thread.sleep(5000);

        driver.close();

    }
}
