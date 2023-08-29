package day08_Array;

import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
//        int sickAges[] = new int[5];

//        sickAges[0] = 25;
//        sickAges[1] = 15;
//        sickAges[2] = 45;
//        sickAges[3] = 65;
//        sickAges[4] = 44;
//
//        int hastaYasları[] = {25, 15, 45, 65, 44};
//        System.out.println(Arrays.toString(hastaYasları));
//        System.out.println(Arrays.toString(sickAges));
//        System.out.println(hastaYasları[2]);
//        Arrays.sort(hastaYasları);
//        System.out.println(Arrays.toString(hastaYasları));
//        int toplam = 0;
//        for (int i = 0; i < hastaYasları.length; i++) {//toplama işlemi arraylerde
//            toplam = toplam + hastaYasları[i];
//
//        }
////        System.out.println(toplam);
////        int toplam1 = 1;
////       for (int w:hastaYasları){
////           toplam1=toplam1+w;
////           System.out.print(toplam1 + " ");
////           System.out.print(w + " ");
////        }
// Array i olusturup chracter sayilarinin toplamini bulup ekrana yazdırınız
//        String isim[]={"ahmet","hasan","deniz","hans"};
//       int sub = 0;
//       for (String w : isim){
//           sub=sub+w.length();
//           System.out.print(sub+ " ");
//       }
//        System.out.println("\n"+sub);
//       //
//       char karakterler[]={'a','B', 'C', 'd', 'x', 'Y', 'Z'};
//       for (char w : karakterler){
//           if (w>='A'&& w<='Z'){
//               System.out.print(w + " ");
////           }
////       }
//        //Jack, Mehmet, Deniz, Mark, Hans, Ali, Jale den bir array olusturup Hans ve Hans’tan öncekileri yazdırınız:
////        String isimler[]=new String[7];
////      isimler[0]="Jack";
////        isimler[1]="Mehmet";
////        isimler[2]="Deniz";
////        isimler[3]="Mark";
////        isimler[4]="Hans";
////        isimler[5]="Ali";
////        isimler[6]="Jale";
////        String isim[]={"Jack", "Mehmet", "Deniz", "Mark", "Hans", "Ali", "Jale"};
////        System.out.println(isim[0]);
////        System.out.println(isim[1]);
////        System.out.println(isim[2]);
////        System.out.println(isim[3]);
////        System.out.println(isim[4]);
//        String isim[] = {"Jack", "Mehmet", "Deniz", "Mark", "Hans", "Ali", "Jale"};
////        for (String w : isim){
////            System.out.println(w+ " ");
////            if (w.equals("Hans")){
////                break;
////            }//hansa kadar hans dahil yazdırır
////        for (String w : isim) {
////            if (w.equals("Deniz") || w.equals("Mark")) {//deniz ve mark dısındakıleri yazdırır
////                continue;
////            }
////            System.out.print(w + " ");
//////        }
        Scanner input = new Scanner(System.in);
        System.out.println("\nlutfen kac hasta kayıdı yapcagınızı yazın");
        int sayı = input.nextInt();

        String isimler[] = new String[sayı];
        for (int i = 0; i < sayı; i++) {
            System.out.println("\nlütfen " + (i + 1) + " . hasta isimlerini giriniz");
            String name1 = input.next();
            char exit = name1.toLowerCase().charAt(0);
            if (exit == 'q') {
                break;
            }
            isimler[i] = name1;
            System.out.println("cıkmak istiyorsanız q ye istemiyorsanız baska harde basın");
////        }
////        System.out.println(Arrays.toString(isimler));
//        //[0, 5, 15, 0, 9, 18 ] array'i sıfırlarınız en sona koyunuz.
//        //[5, 15, 9, 18, 0, 0] seklinde oluşturunuz
//        int first[]={0, 5, 15, 0, 9, 18 };
//        System.out.println(Arrays.toString(first));
//        int second[]=new int[first.length];
//        System.out.println(Arrays.toString(second));
//        int indexsecond=0;
//        for (int w : first){
//            if (w!=0){
//                second[indexsecond]=w;
//                indexsecond++;
//            }
//        }
//        System.out.println(Arrays.toString(second));
//        int sayılar[]={8,-3,11,8,5,8};
//        int aranan=8;
//        int sayac=0;
//        for (int w : sayılar){
//            if (w==aranan){
//                sayac++;
//            }
//        }
//        if (sayac > 0){
//            System.out.println(" aradıgınız sayı " + sayac+ "  kadar tekrar ediyor");
//        }else {
//            System.out.println("aradıgınız sayı mevcut deil");
//        }
//        String cumle="Java zor değildir calışana, calışmazsan ne kolay ki.";
//        System.out.println(cumle);
//        String cumle1=cumle.replaceAll("\\p{Punct}","");
//        System.out.println(cumle1);
//        String kelimeler1[]=cumle1.split(" ");
//        System.out.println(Arrays.toString(kelimeler1));
//        Arrays.sort(kelimeler1);
//        System.out.println(Arrays.toString(kelimeler1));
//
//
//        Arrays.sort(kelimeler1.Comparator.comparingInt(String:length));
//        System.out.println(Arrays.toString(kelimeler1));
//        System.out.println(kelimeler1[kelimeler1.length-1]);

        }
    }
}



