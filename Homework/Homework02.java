package Homework;

import java.util.Scanner;

public class Homework02 {
    //    Kullanıcıdan alınan userName bilgisinin aşagıdaki şartları karşıladıgını kontrol edin ?
//        1) İfadenin sonunun “@gmail.com” ya da “@hotmail.com” ya da @yahoo.com olması gerekmektedir.
//        2) İfadesinde @ ten once
//    a. En az Bir buyuk harf
//    b. En az 2 kucuk harf
//    c. En az bir sesli harf icermesi gerekmektedir.
//    d. Space karakteri içermemesi gerekmektedir
//    e. En az 5 chracter olması gerekmektedir.
//    f. Son character rakam olmamalı
//    Sartlar dogru ise “Kullanıcı giriş ismi kabul edildi ”
//    Değil ise “hatalı giriş” yazmasını saglayan kodu yazınız}


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen giris icin mail adresini giriniz");
        String userName=input.next();
        boolean ilk= userName.endsWith("@gmail.com")
                ||userName.endsWith("@hotmail.com")
                ||userName.endsWith("@yahoo.com");
        String userName1=userName.split("@")[0];
        boolean aaa= userName1.replaceAll("[^A-Z]","").length()>0;
        boolean bbb= userName1.replaceAll("[^a-z]","").length()>1;
        boolean ccc= userName1.replaceAll("[^aeiouAEIOU]","").length()>0;
        boolean ddd=!userName1.contains(" ");
        boolean eee= userName1.length()>4;
        boolean fff= userName1.charAt(userName1.length()-1)>='0'
                && userName1.charAt(userName1.length()-1)<='9';

        if (ilk&&aaa&&bbb&&ccc&&ddd&&eee&&fff){
            System.out.println("Kullanici giris ismi kabul edildi");
        }
        else {
            System.out.println("hatali giris");
        }






    }
}

