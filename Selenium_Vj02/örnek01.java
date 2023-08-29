package Selenium_Vj02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class örnek01 {
    public static void main(String[] args) throws InterruptedException {
        // İlk önce browser'i maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 saniye belirtelim
        //2 Sırasıyla hepsiburada, instagram ve youtube sayfalarına gidelim.
        //3 hepsiburada sayfasına tekrar dönelim.
        //4 hepsiburada sayfasının Url'inin https://www.hepsiburada.com/ adresine eşit olduğunu test edelim
        //5 Sayfanın konumunu ve size'ını yazdıralım
        //6 Sayfanın konumunu ve size'inı istediğimiz şekilde ayarlıyalım
        //7 ve istediğimiz şekilde olduğunu test edelim
        //8 ve sayfayı kapatalım
        System.setProperty("Webdriver.chrome.driver","src/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get(" https://www.hepsiburada.com/");
        driver.get("https://www.instagram.com/");
        driver.get("https://www.youtube.com/");

        driver.navigate().back();
        driver.navigate().back();

        String expectedUrl="https://www.hepsiburada.com/ ";
        String actUrl=driver.getCurrentUrl();

        if (actUrl.equals( expectedUrl)){
            System.out.println("sayfanın urlsi eşittir");
        }else {
            System.out.println("eşit değildir");
        }


        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        int posx=0;
        int posy=60;
        int weight=800;
        int heigth=800;

        driver.manage().window().setPosition(new Point(posx,posy));
        driver.manage().window().setSize(new Dimension(weight,heigth));

        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        Dimension actNewSize=driver.manage().window().getSize();
        if (actNewSize.getWidth()==800 && actNewSize.getHeight()==800){
            System.out.println("testi gecti");
        }else System.out.println("testi gecemedi");


        Point actNewPoint=driver.manage().window().getPosition();
        if (actNewPoint.getX()==0 && actNewPoint.getY()==60){
            System.out.println("point testini gecti");
        }else System.out.println(" point testini gecemedi");


        WebElement searchBox;


        driver.close();



    }
}
