package IFrame04;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class WindowHandle04 extends TestBase {
    //uOrnek : Yeni bir class olusturun:WindowHandle
    //1.Amazon anasayfa adresine gidin.
    //2.Sayfa’nin window handle degerini String bir degiskene atayin
    //3.Sayfa title’nin “Amazon” icerdigini testedin
    //4.Yeni bir tab olusturup, acilan tab’da youtube adresine gidin
    //5.Sayfa title’nin “youtube” icerdigini testedin
    //6.Yeni bir window olusturup, acilan sayfada walmart.com adresinegidin
    //7.Sayfa title’nin “Walmart” icerdigini testedin
    //8.Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
    @Test public void test01(){
        driver.get("https://www.amazon.com/");
        String handleAmzn=driver.getWindowHandle();
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("YouTube"));
        String YouTube= driver.getWindowHandles().toString();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com/");
        Assert.assertTrue(driver.getTitle().contains("Walmart"));
        String handlewalmart=driver.getWindowHandle();
        switchToWindow(0);

        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        wait(5);

        driver.switchTo().window(handlewalmart);

       wait(5);

    }
}
