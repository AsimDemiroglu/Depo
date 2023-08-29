package D09Exel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class exelwrite {
    @Test
    public void tst() throws IOException {
        String path = "./src/test/java/resources/ornek.xlsx";//bu exel dosyasının adresi
        String path1 = ".\\src\\test\\java\\resources\\ornek.xlsx";
        //dosyayı ac
        FileInputStream fileInputStream = new FileInputStream(path1);

        //exel dosyasını ac
        Workbook workbook = WorkbookFactory.create(fileInputStream);//cift tıklama sayfayı acmıs gibi düşün

        Sheet sheet = workbook.getSheet("Sheet1");

        Row row1 = sheet.getRow(0);
        Cell cell03 = row1.createCell(2);

        cell03.setCellValue("KITA6");

        sheet.getRow(1).createCell(2).setCellValue("Asia&Europa");



        //exele yazdırmak için

    }


}
