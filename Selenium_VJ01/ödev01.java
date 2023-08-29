package Selenium_VJ01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ödev01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");

        String İnstaBaslık= driver.getTitle();

        if (İnstaBaslık.contains( "instagram")){
            System.out.println("doğrulamayı basarı ıle gectı");
        }else {
            System.out.println("dogrulamayı gecemedi");
            System.out.println(İnstaBaslık);
        }

        String instaActUrl=driver.getCurrentUrl();
        if (instaActUrl.contains("instagram")){
            System.out.println("url dogrulamayı gecti");
        }else {
            System.out.println("url dogrulamayı gecemedi");
            System.out.println(instaActUrl);
        }

        driver.get("https://www.walmart.com/");
        String walmartActTitle= driver.getTitle();
        if (walmartActTitle.contains("Walmart.com")){
            System.out.println(" wal dogrulamayı basarı ile gecti");
        }else {
            System.out.println("dogrulamayı gecemedi");
            System.out.println(walmartActTitle);
        }
        String pageSource = driver.getPageSource();
        if (pageSource.contains("aria-hidden")) {
            System.out.println("Kaynak kod testi başarılı: aria-hidden bulundu.");
        } else {
            System.out.println("Kaynak kod testi başarısız: aria-hidden bulunamadı.");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(5000);

        Dimension windowSize = driver.manage().window().getSize();

        int width = windowSize.getWidth();
        int height = windowSize.getHeight();

        System.out.println("Pencere Genişliği: " + width);
        System.out.println("Pencere Yüksekliği: " + height);



        Dimension newSize = new Dimension(600, 600);
        driver.manage().window().setSize(newSize);

        Thread.sleep(5000);
        driver.close();

    }
}
