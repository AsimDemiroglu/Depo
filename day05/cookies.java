package day05;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class cookies extends TestBase {

    @Test
    public void cookiesTest01(){

        /*
        1-Amazon anasayfayagidin
        2-tum cookie'leri listeleyin
        3-Sayfadaki cookies sayisinin5’den buyuk oldugunu test edin
        5-ismi"ensevdigimcookie" ve degeri"cikolatali"olan bir cookie olusturun ve sayfaya ekleyin
        6-eklediginiz cookie'nin sayfaya eklendigini test edin
        7-ismi skin olan cookie'yi silin ve silindigini test edin
        8-tum cookie'leri silin ve silindigini test edin
         */

        driver.get("https://www.amazon.com/");

        Set<Cookie> allCookies =driver.manage().getCookies();

        for (Cookie w : allCookies ){
            System.out.println(w.getName());
        }
        int sayac=allCookies.size();
        System.out.println(sayac);

        Assert.assertTrue(allCookies.size()>5);

        Cookie favori=new Cookie("ensevdigimcookie","cikolatalı");
        driver.manage().addCookie(favori);

        Assert.assertTrue(driver.manage().getCookies().size() >sayac);

        for (Cookie w : allCookies ){
            System.out.println(w.getName());
        }

        driver.manage().deleteAllCookies();
        Assert.assertTrue(driver.manage().getCookies().size()==0);

        driver.manage().deleteCookieNamed("session-id");
        for (Cookie w: allCookies){
            System.out.println(w.getName());
            //Assert.assertFalse(w.getName().contains("skin"));
        }



    }
}
