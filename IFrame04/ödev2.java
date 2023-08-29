package IFrame04;

import Utulities.TestBase;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ödev2 extends TestBase {


    //Soru 2 Web Handle
    //1. https://www.hyrtutorials.com/p/window-handles-practice.html sayfasina gidin
    //2. Bu sayfada first name , last name i faker class kullarak girin , gender ,
    //language kisimlarini doldurun , email ve pass kisimlarini da doldurun , pass
    //min. 16 haneli olsun (bunlardada faker class kullanin ) ve register butonuna
    //basin
    //3. Registration is Successful yazisinin ciktigini Assert edin
    //4. Daha sonra bu Windows sayfasini kapatip ilk sayfaya donun ve ilk sayfaya
    //donduğunuzu check edin.
    @Test
    public void soru1(){


        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        driver.findElement(By.id("newWindowBtn")).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        driver.manage().window().maximize();

        wait(5);
        Faker faker = new Faker();
        String fakeName = faker.name().firstName();
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys(fakeName);

        String fakeLastName = faker.name().lastName();
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys(fakeLastName);

        String randomGender = faker.demographic().sex();
        WebElement radio = driver.findElement(By.className("bcRadioButton"));
        radio.click();

        String box = faker.lorem().sentence();
        WebElement langue = driver.findElement(By.className("bcCheckBox"));
        langue.click();

        String randomEmail = faker.internet().emailAddress();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(randomEmail);

        String randomPsw= faker.internet().password(16,20);
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys(randomPsw);

        wait(3);
        driver.findElement(By.id("registerbtn")).click();

        WebElement msg=driver.findElement(By.id("msg"));
        Assert.assertEquals("Registration is Successful",msg.getText());

        wait(3);
        switchToWindow(0);

        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://www.hyrtutorials.com/p/window-handles-practice.html",url);

        wait(3);


        driver.quit();

    }
}
