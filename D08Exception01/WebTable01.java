package D08Exception01;

import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import java.util.List;

public class WebTable01 extends TestBase {



    /*

        //    https://the-internet.herokuapp.com/tables
        //    Create a class: WebTables
        //    Task 1 : Table1’i print edin
        //    Task 2 : 3. Row' datalarını print edin
        //    Task 3 : Son row daki dataları print edin
        //    Task 4 : 5. Column datalarini print edin
        //    Task 5 : Iki parametreli bir Java metot oluşturalım: printData
        //    Parameter 1 = row numarasi
        //    Parameter 2 = column numarasi
        //    printData(2,3);  => 2nd row, 3rd column daki datayı print etsin

     */


        @Test
        public void  WebTablesTest01(){
            driver.get(" https://the-internet.herokuapp.com/tables");

            WebElement tablo1 = driver.findElement(By.xpath("//table[@id='table1']"));

            System.out.println(tablo1.getText());

            System.out.println("------------------------------------------------------------");
            System.out.println("------------------------------------------------------------");
            List<WebElement> tablo1Eleman= driver.findElements(By.xpath("//table[@id='table1']//tr"));

            for (WebElement w : tablo1Eleman){
                System.out.println(w.getText());
            }


            System.out.println("------------------------------------------------------------");
            System.out.println("------------------------------------------------------------");
            // 2. Row datalarını print edin



                WebElement lastRow= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[last()]"));
            System.out.println(lastRow.getText());


            //    Task 3 : Son row daki dataları print edin

            WebElement elemanlar3Satir= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]"));
            System.out.println(elemanlar3Satir.getText());

            //rowları tek tek alma

            List<WebElement> onebyone=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
            for (WebElement w: onebyone){
                System.out.println(w.getText()+" ");
            }

            // Task 4 : 5. Column datalarini print edin

           List <WebElement> sutunelement=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[5]"));

           for (WebElement w : sutunelement){
               System.out.println(w.getText());
           }
           tableYazdir(2,3);
        }


    public void tableYazdir(int satir, int sutun){

        ////table[@id='table1']//tbody//tr[2]//td[5]"))

        String xpathistenen="//table[@id='table1']//tbody//tr["+satir+"]"+"//td["+sutun+"]";

        // System.out.println(xpathistenen);
        WebElement istenen= driver.findElement(By.xpath(xpathistenen));
        System.out.println(istenen.getText());
    }
    }

