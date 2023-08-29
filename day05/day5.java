package day05;
import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class day5 extends TestBase {


    

    /*
    Ornek :  https://the-internet.herokuapp.com/basic_auth sayfasina gidin asagidaki yontem ve test datalarini kullanarak authentication'i yapin
    URL              : https://username:password@URL
    Username    : admin                                  password    : admin
    Basarili sekilde sayfaya girin ve 'Congratulations!' yasizini içerdiği doğrulayın


    https://admin:admin@the-internet.herokuapp.com/basic_auth

     */

        @Test
        public void Test01(){
            driver.get("https://the-internet.herokuapp.com/basic_auth");

            wait(3);


            //Basarili sekilde sayfaya girin
            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

            WebElement testControl= driver.findElement(By.tagName("p"));

            //Basarili sekilde sayfaya girin ve 'Congratulations!' yasizini içerdiği doğrulayın
            Assert.assertTrue(testControl.getText().contains("Congratulations!"));


        }
}
