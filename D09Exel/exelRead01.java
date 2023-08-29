package D09Exel;

import Utulities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class exelRead01  {
    @Test
    public void ExelReadTest01() throws IOException {
        /*
        1.satirdaki 2.hucreye gidelim ve yazdiralim
        1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        Satir sayisini bulalim
        Fiziki olarak kullanilan satir sayisini bulun
        Ulke isimleri ve baskentleri bir map olarak kaydedelim
         */
        //    WORKBOOK (EXCEL DOSYASI) > WORKSHEET/SHEET(SAYFA) >ROW (SATIR)> CELL(VERI HUCRESI)
        String path = "./src/test/java/resources/ornek.xlsx";//bu exel dosyasının adresi
        String path1 = ".\\src\\test\\java\\resources\\ornek.xlsx";
        //dosyayı ac
        FileInputStream fileInputStream = new FileInputStream(path1);

        //exel dosyasını ac
        Workbook workbook = WorkbookFactory.create(fileInputStream);//cift tıklama sayfayı acmıs gibi düşün

        Sheet sheet=workbook.getSheet("Sheet1");


        String cell21=sheet.getRow(1).getCell(0).toString();
        System.out.println(cell21);


        String cel42=sheet.getRow(3).getCell(1).toString();
        Assert.assertEquals("London",cel42);
        System.out.println(cel42);

        int satırsayısı=sheet.getLastRowNum();
        System.out.println(satırsayısı);
        Assert.assertTrue(10==satırsayısı+1);


        int activecell=sheet.getPhysicalNumberOfRows();
        System.out.println(activecell);
        //ilk satırı al
//        Row row1 =sheet.getRow(0);
        //ikinci hücreyi al ilk satırda
//        Cell cell01=row1.getCell(1);
//        System.out.println(cell01);

        Map<String,String> RowCell = new HashMap<>();
        //int satırindeks=1;

        for (int satırindeks=1; satırindeks<satırsayısı; satırindeks++){
            String ulke=sheet.getRow(satırindeks).getCell(0).toString();
            String baskent=sheet.getRow(satırindeks).getCell(1).toString();
            RowCell.put(ulke,baskent);
            System.out.println(RowCell);

        }



    }
}
