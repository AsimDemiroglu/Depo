package Selenium_VJ01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class örnek01 {
    public static void main(String[] args) throws InterruptedException {
        //u1. Yeni bir class olusturun (TekrarTesti)
        //u2. hepsiburada web sayfasına gidin ve sayfa başlığının “hepsiburada”olup olmadığını doğrulayın(verify),
        // eğer değilse doğru başlığı(Actual Title) konsoldayazdirin.
        //u3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa doğruURL'yi yazdırın.
        //u4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        //u5. Youtube sayfasina geri donun
        //u6. Sayfayi yenileyin
        //u7. Amazon sayfasina donun
        //u8. Sayfayi tamsayfa yapin
        //u9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksadoğru başlığı(Actual Title) yazdırın.
        //u10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğruURL'yi yazdırın
        //u11.Sayfayi kapatin
        //11:17
        //Ornek01
        System.setProperty("Webdriver.chrome.driver","src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");

        String HepsiBurada= driver.getTitle();

        if (HepsiBurada.contains("hepsiburada")){
            System.out.println("HepsiBurada iceriyor");
        }else {
            System.out.println("hepsiburada icermiyor");
            System.out.println(HepsiBurada);
        }

        String actualurl=driver.getCurrentUrl();
        if (actualurl.contains("youtube")){
            System.out.println("youtube yazısı iceriyor");
        }else {
            System.out.println(actualurl);
        }

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back();

        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        String baslık=driver.getTitle();
        if (baslık.contains("Amazon")){
            System.out.println("baslık dogru");
        }else {
            System.out.println("amazon icermiyor");
            System.out.println(baslık);
        }

        String url2=driver.getCurrentUrl();
        if (url2.equals("https://www.amazon.com/")){
            System.out.println("iceriyor");
        }else {
            System.out.println(url2);
        }



        driver.close();
    }
}
