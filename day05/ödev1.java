package day05;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class ödev1 extends TestBase {

    @Test
    public void cookies(){
        //Soru 1 Cookies
        //1. https://kitchen.applitools.com/ingredients/cookie sayfasina
        //gidin.
        //2. Cookie name i vegetable olan cookie nin adinin broccoli
        //oldugunu Assert edin.
        //3. Sayfadaki tum Cookie leri yazdirin.
        //4. Kuyruk yagi adinda bir cookie ekleyin , bu yeni cookienin
        //value degeri olarak Yag atayin.
        //5. Fruit adinda yeni bir cookie daha ekleyin , value olarak Apple
        //atayin.
        //6. En son eklediginiz cookie ler ile birlikte hepsini
        //yazdirin.Mevcut cookie sayisinin 4 oldugunu Assert edin.
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        Set<Cookie> allCookies = driver.manage().getCookies();
        wait(5);
        for (Cookie w: allCookies) {
            System.out.println(w.getName());

            if (w.getName().equals("vegetable")){
                Assert.assertEquals("broccoli",w.getValue());
            }
        }

        allCookies.add(new Cookie("Kuyruk yagi","Yag"));
        allCookies.add(new Cookie("Fruit","Apple"));
        int cookies=allCookies.size();
        for (Cookie w : allCookies){
            System.out.println(w.getName());
        }

        Assert.assertTrue(allCookies.size()==4);

    }
}
