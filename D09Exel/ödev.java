package D09Exel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.safari.HasPermissions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ödev {
    //1.Ekte bulunan exel dosyasini projenize kaydedin ve path ini kullanmak uzere saklayin.
    //
    //2.Bu dosyada ilk sekmede (Mail Bilgisi) bulunan kisilerin sira numarasini , isimlerini ve mail
    //adreslerini yazdirin.
    //
    //3.1.Ismin Asim ve son ismin Merve oldugunu dogrulayin. Ahmet adli kisinin mail adresinin kurtlar
    //vadisinden alinma bir isim olan «aslanakbey245@gmail.com» olugunu dogrulayin 😊
    //
    //4.Odev Sirasi adli sekmede bulunan Odev sayisinin karsiligina odev listesinden bakarak 29. Odev
    //Sayi No sundan itibaren 38 e kadar katilimci adlarini bu dosya uzerine yazin.
    @Test
    public void ödevWrite() throws IOException {
        String path = "./src/test/java/resources/odev.xlsx";//bu exel dosyasının adresi
        String path1 = ".\\src\\test\\java\\resources\\odev.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path1);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Sheet sheet= workbook.getSheet("Sheet1");

       Map<String,String> ödev2=new HashMap<>();
       int satırsayısı=sheet.getLastRowNum()+1;
       for (int index=1;index<satırsayısı;index++){
           String numbers=sheet.getRow(index).getCell(0).toString();
           String names=sheet.getRow(index).getCell(1).toString();
           String emails=sheet.getRow(index).getCell(2).toString();
           ödev2.put(numbers,names);
           System.out.println("--------------------------------------");
           ödev2.put(names,emails);
           System.out.println(ödev2);
       }

        System.out.println("----------------------------------");
        String asım=sheet.getRow(1).getCell(1).toString();
        System.out.println(asım);
        Assert.assertEquals("Asim",asım);
        System.out.println("-----------------------------------");
        String merve=sheet.getRow(6).getCell(1).toString();
        System.out.println(merve);
        Assert.assertEquals("Merve",merve);
        System.out.println("------------------------------------");
        String ahmet=sheet.getRow(3).getCell(2).toString();
        System.out.println(ahmet);
        Assert.assertEquals("aslanakbey245@gmail.com",ahmet);
        System.out.println("--------------------------------------");

    }

    @Test
    public void  ödev2() throws IOException {
        String path = "./src/test/java/resources/odev.xlsx";//bu exel dosyasının adresi
        String path1 = ".\\src\\test\\java\\resources\\odev.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path1);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Sheet sheet= workbook.getSheet("Sheet2");

        List<String> ödev2=new ArrayList<>();
        int satırsayısı=sheet.getLastRowNum()+1;
        Scanner input=new Scanner(System.in);
        for (int index=29;index<satırsayısı;index++){
            Row row1=sheet.getRow(index);
            Cell cell1=row1.createCell(1);
            System.out.println("isim giriniz");
            String isim= input.next();
            cell1.setCellValue(isim);
            ödev2.add(isim);
        }
        input.close();

//
//        Row row1 = sheet.getRow(29);
//        Cell cell03 = row1.createCell(1);
//        cell03.setCellValue("Ahmet D.Bey");
//        Row row2 = sheet.getRow(30);
//        Cell cell2 = row2.createCell(1);
//        cell2.setCellValue("Abddurahim Bey");
//        Row row3 = sheet.getRow(31);
//        Cell cell3 = row3.createCell(1);
//        cell3.setCellValue("Asım");
//        Row row4 = sheet.getRow(32);
//        Cell cell4 = row4.createCell(1);
//        cell4.setCellValue("Merve Hanım");
//        Row row5 = sheet.getRow(33);
//        Cell cell5 = row5.createCell(1);
//        cell5.setCellValue("Ahmet D.Bey");
//        Row row6 = sheet.getRow(34);
//        Cell cell6 = row6.createCell(1);
//        cell6.setCellValue("Nihan Hanım");
//        Row row7 = sheet.getRow(35);
//        Cell cell7 = row7.createCell(1);
//        cell7.setCellValue("Abdurrahim Bey");
//        Row row8 = sheet.getRow(36);
//        Cell cell8 = row8.createCell(1);
//        cell8.setCellValue("Ahmet D.Bey");
//        Row row9 = sheet.getRow(37);
//        Cell cell9 = row9.createCell(1);
//        cell9.setCellValue("Abdurrahim Bey");
//        Row row92 = sheet.getRow(38);
//        Cell cel98 = row92.createCell(1);
//        cel98.setCellValue("Nihan Hanım");

        FileOutputStream fileOutputStream = new FileOutputStream(path1);

        workbook.write(fileOutputStream);
    }
}
