package D08Exception01;

import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ödev2 extends TestBase {
    @Test
    public void test(){
        //Soru 2 Web tables
        //1. https://demo.guru99.com/test/web-table-element.php  sayfasina gidin
        //2. Cikan tablonun basliklarini  yazdirin (Dongu ile)
        //3. 2.Satirda bulunan IL&FS Transportation  adli firmaya ait Prev Close (Rs) in 14.1 oldugunu dogrulayin
        //4. Son satirda bulunan  Kwality adliu firmanin % Change oraninin + 4.8 oldugunu dogrulayin
        //
        //Note: Degerler degismis ise beklenen değerleri site ile ayni yaparak odevi tamamlayin.


        driver.get(" https://demo.guru99.com/test/web-table-element.php");
        List<WebElement> tablo=driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr"));
        for (WebElement w : tablo){
            System.out.println(w.getText());
        }
        //table[@class='dataTable']//tbody//tr[2]//td[3]
        WebElement look= driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[2]//td[3]"));
        System.out.println(look.getText());
        //değerler sürekli değişiyor sabit bir şey ile kontrol edemiyorum
        //table[@class='dataTable']//tbody//tr[26]//td[5]
        WebElement check=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[26]//td[5]"));
        System.out.println(check.getText());
        //aynı sekilde sürekli değişiyor
    }
}
