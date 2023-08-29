package day09_MultyArray;

import java.util.Arrays;

public class MulltyDimensiolArray {
    public static void main(String[] args) {
        String bişi[][] = {{"Ali", "ata", "bak"}, {"Ali", "topu", "tut"}, {"Ali", "okula", "git"}, {"Ali", "eve", "gel"}};
        System.out.println(Arrays.deepToString(bişi));
        System.out.println(bişi[0][1]);
        System.out.println(Arrays.toString(bişi[1]));
        System.out.println(bişi[3][1]);
        System.out.println(Arrays.deepToString(bişi));
        int sub = 0;
        for (String w[] : bişi) {
            for (String i : w) {
                sub = sub + i.length();
            }
        }
        System.out.println(sub);
        //[Calisirsan Java kolaydir] [calismazsan hicbir] [sey kolay degildir].
        //Multidimentional Array’in içinde a içeren elemanları yazdırınız.
        String ornek[][] = {{"Calisirsan", "Java", "kolaydir"}, {"calismazsan", "hicbir"}, {"sey", "kolay", "degildir"}};

//
//        for (String w[] : ornek) {
//            /*
//                w[] -> ["Calisirsan", "Java", "kolaydir"]
//                w[] -> ["calismazsan", "hicbir"]
//                w[] -> ["sey", "kolay", "degildir"]
//             */
//
//
//            for (String k : w) {
//                //w[] -> ["Calisirsan", "Java", "kolaydir"] --> k -->Calisirsan"
//                //w[] -> ["Calisirsan", "Java", "kolaydir"] --> k -->Java
//                //w[] -> ["Calisirsan", "Java", "kolaydir"] --> k -->kolaydır
//                if (k.toLowerCase().contains("a")) {
//                    System.out.print(k + " ");
//                }
//            }
//
//        } //[ [8, 16, 4], [68, 2], [45, 9, 6, 1] ] Array’in elemanlari toplamini hesplayiniz.
//        int sayılar[][] = {{8, 16, 4}, {68, 2}, {45, 9, 6, 1}};
//        System.out.print(sayılar[2][1]);
//        int toplam=0;
//
//        for (int w[]: sayılar){
//            for (int k : w){
//                toplam=toplam+k;
//            }
//        }
//        // System.out.print(toplam);
//        int sayilar[][]={{8, 16, 4}, {68, 2}, {45, 9, 6, 1}};
//
//        System.out.println(sayilar[2][1]);
//
//        int toplam=0;
//
//        for(int w[] : sayilar){
//            for(int k : w){
//                toplam=toplam+k;
//            }
//        }
//        System.out.println(toplam);

//        /*
//        Multidimensional Array'i normal Array'e ceviren kodu yazınız.
//       [ [8, 16, 4], [68, 2] ]
//         */

//        int number1[][]={{8, 16, 4},{68, 2}};
//
//        System.out.println(Arrays.deepToString(number1));
//
//        int elemanSayisi=0;
//        for(int w[] : number1){
//            elemanSayisi=elemanSayisi+w.length;
//
//        }
//        int tekArray[]=new int[elemanSayisi];  //[0, 0, 0, 0, 0]
//
//
//        int index=0;
//        for (int w[] : number1){
//            for(int k : w){
//                tekArray[index]=k;
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(tekArray));
        //int number2[][]={{8, 16, 4},{68, 2}};
        //en buyuk ve en kucuk sayilari bulunuz .
        int number2[][] = {{8, 16, 4}, {68, 2}};

        int enBüyük = number2[0][0];
        int enKücük = number2[0][0];
        for (int w[] : number2) {

            for (int k : w) {
                enBüyük = Math.max(enBüyük, k);
                enKücük = Math.min(enKücük, k);
            }

        }



    }
}
