package ödev;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class ödev extends TestBase {
    //Soru-1 JS Executer
    //1. https://www.geeksforgeeks.org/  sayfasina gidin
    //2. Segmelerden Machine Learning e tiklayin
    //3. Js Executer methodlarini kullanarak sayfanin en altina gidin.
    //4. Sayfanin en altindaki ilk basligin Interview Corner oldugunu Assert edin.
    //
    //Soru-2
    //1. https://affiliate.flipkart.com/login  sayfasina gidin
    //2. setScriptTimeout methodu ile 20 sn bekleme yapin
    //3. executeScript kullanarak login icin email ve password girin.(a@a.com / test1234)
    //4. Sign in butonuna basin.
    //5. Either the email ID or the password is incorrect!    Yazisinin yazdigini kontrol edin.
    //
    //Bu islemleri yaparken daima js executer kullanmaya calisi
    @Test
    public void Test(){
        driver.get("https://www.geeksforgeeks.org/");
        WebElement clickjs= driver.findElement(By.xpath("//a[.='Machine Learning']"));
        clikJS(clickjs);
         wait(5);
         //scrollEndJS();
         WebElement endOfPage= driver.findElement(By.xpath("//a[.='Interview Corner']"));
         scrollIntoViewJS(endOfPage);
        Assert.assertEquals("Interview Corner",endOfPage.getText());
        wait(5);
    }

    @Test
    public void test2(){

        driver.get("https://affiliate.flipkart.com/login");

       driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));

       setAttiributeValueJS("inputEmail","a@a.com");
       wait(2);
       setAttiributeValueJS("inputPassword","test1234");
       wait(5);
       WebElement signIn= driver.findElement(By.id("submitLogin"));
       clikJS(signIn);
       WebElement eror=driver.findElement(
               By.xpath("//div[.='Either the email ID or the password is incorrect!']"));
       waitForVisibility(eror,20);
       Assert.assertEquals("Either the email ID or the password is incorrect!",eror.getText());


    }
    @Test
    public void test03(){

        driver.get("https://www.priceline.com/");

        scrollIntoViewJS(driver.findElement(By.xpath("//*[.='Check out with confidence. Priceline members always get our best price.']")));
        wait(2);
        scrollTopJS();
        wait(2);
        getValueByJS("hotelDates");
        wait(2);
        setAttiributeValueJS("endLocation-typeahead-downshift-container-input","Madrid");
        wait(2);
        getValueByJS("endLocation-typeahead-downshift-container-input");

        //button rengini değiştiremeim

        clikJS(driver.findElement(By.xpath("//*[.='Cars']")));
        wait(5);
        setAttiributeValueJS("startLocation-typeahead-downshift-container-input",
                "Istanbul Intl Airport (IST), Istanbul, Turkey");
        wait(2);
        setAttiributeValueJS("startDate","Tarih 28/08/2023  TİME 08:00 AM");
        wait(2);
        setAttiributeValueJS("endDate","Tarih 31/08/2023 TİME 08:00 AM");
        wait(2);
        clikJS(driver.findElement(By.xpath("//*[.='Find Your Car']")));
        wait(2);
        List<WebElement> arabalar = driver.findElements(
                By.xpath("//*[@class='sc-beqWaB sc-gueYoa VehicleListing__VehicleCard-dsr__sc-1vq8x0p-0 eNNlzY jtoEsL cVXSVH']"));
        System.out.println(arabalar.size());





    }
}

