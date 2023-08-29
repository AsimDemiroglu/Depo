package dropDown01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ödev {
    WebDriver driver = new ChromeDriver();

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

//2. First Name  Last Name Phone Email Address City State/Province Postal
//Code Country User Name Password Confirm Password kisimlarini
//doldurup submit butonuna tiklayin Not: Ulke kismina Turkey girin( Drop
//Down kullanılacak)
//
//3. Submit butonuna bastiktan sonra acilan sayfa “Thank you for registering”
//yazisinin yazdigini check edin

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://demo.guru99.com/test/newtours/register.php ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement FirstName = driver.findElement(By.name("firstName"));
        FirstName.click();
        FirstName.sendKeys("asos");
        WebElement LastName = driver.findElement(By.name("lastName"));
        LastName.click();
        LastName.sendKeys("soyadı");
        WebElement phone = driver.findElement(By.name("phone"));
        phone.click();
        phone.sendKeys("05456564155");
        WebElement gmail = driver.findElement(By.id("userName"));
        gmail.click();
        gmail.sendKeys("dmustafaasim@gmailcom");
        WebElement address = driver.findElement(By.name("address1"));
        address.click();
        address.sendKeys("Çiğdem Sk.No:3/45 Çankaya/Ankara");
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        city.sendKeys("Ankara");
        WebElement state = driver.findElement(By.name("state"));
        state.click();
        state.sendKeys("Ankara/Yenimahalle");
        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.click();
        postalCode.sendKeys("06");
        WebElement country = driver.findElement(By.name("country"));
        Select countryr = new Select(country);
        countryr.selectByVisibleText("TURKEY");
        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("asos");
        WebElement password = driver.findElement(By.name("password"));
        password.click();
        password.sendKeys("12345678");
        WebElement passwordC = driver.findElement(By.name("confirmPassword"));
        passwordC.click();
        passwordC.sendKeys("12345678");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        WebElement text = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
        String text12 = text.getText();
        Assert.assertTrue(text12.contains("Thank you for registering"));
        Thread.sleep(4000);

    }

    @After
    public void teardown() throws InterruptedException {
        driver.close();
    }
}
