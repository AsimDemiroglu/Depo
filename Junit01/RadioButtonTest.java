package Junit01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonTest {

    //Bir class oluşturun : RadioButtonTest
    //1.Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //2.-https://www.facebook.comadresine gidin
    //3.-“Create an Account” button’una basin
    //4.-“radio buttons” elementlerini locate edin
    //5.-Secili degilse cinsiyet butonundan size uygun olani secin
    WebDriver driver = new ChromeDriver();
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.facebook.com");
        WebElement yeniHesapOlustur= driver.findElement(By.xpath("//a[@rel='async']"));
        yeniHesapOlustur.click();

        WebElement kadin=driver.findElement(By.xpath("//input[@value='1']"));
        WebElement erkek=driver.findElement(By.xpath("//input[@value='2']"));
        WebElement ozel=driver.findElement(By.xpath("//input[@value='-1']"));

        if(!erkek.isSelected()){
            erkek.click();
        }else System.out.println("Zaten Erkek secili");

//
//        WebElement hesap=driver.findElement(By.xpath("//*[@id=\"u_0_0_gH\"]"));
//        hesap.click();
//        WebElement cins0=driver.findElement(By.xpath("//*[@id=\"u_7_4_04\"]"));
//        WebElement cins=driver.findElement(By.xpath("//*[@id=\"u_7_5_VB\"]"));
//        WebElement cins1=driver.findElement(By.xpath("//*[@id=\"u_7_6_Yi\"]"));
//
//        cins.click();


    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}
