package day05_StringManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("ad ve soyad gir");
        String nameSurname = input.nextLine();

        char ilk = nameSurname.charAt(0);
        char surname1= nameSurname.split(" ")[1].charAt(0);
       System.out.println(""+ilk+surname1);
//
//        String psw = "deneme.";
//        boolean first = psw.length() > 5;
//        boolean second = !psw.contains(" ");
//        boolean thirds = psw.charAt(0) >= 'a' && psw.charAt(0) >= 'z';
//        boolean forth = psw.charAt(psw.length() - 1) == '.'; //son harfi . yapmak icin
//        if (first && second && thirds && forth) {
//            System.out.println("sifre gecerli");
//        } else {
//            System.out.println("sifre gecersiz");
//        }
//        String name = "Hasan Ali";
//        System.out.println(name.substring(5));
//        String sonuc = name.substring(2, 5);//2 den 5.harf aralgı yazıyo
//        System.out.println(sonuc);
//        System.out.println(name.substring(name.length() - 3));//son uc harf
//        String cumle = "Kara kara Ankara";
//        System.out.println(cumle.replace('a', '*'));
//        String sonuc1 = cumle.replace("kara", "?");
//        System.out.println(sonuc1);
//        String cumle1 = "Hasam ana sınıfına basladı.";
//        System.out.println(cumle1.replace(" ", ""));
//        int result = cumle1.replace(" ", "")
//                .length();
//        System.out.println(result);
//        String cumle2 = "AC458265";
//        String cumle2new = cumle2.replaceAll("[0-9]", "*");
//        System.out.println(cumle2new);
//        String cumle3new = cumle2.replaceAll("[a-zA-Z]", "n");
//        System.out.println(cumle3new);
//        String ornek = "Ben sınavdan 100 aldım, dersem inanma!:)";
//        int orneksonuc = ornek.replaceAll("[ ]", "") //Bensınavdan100aldım,derseminanma!:)
//                .replaceAll("\\p{Punct}", "")        //Bensınavdan100aldımderseminanma
//                .replaceAll("[0-9]", "")             //Bensınavdanaldımderseminanma
//                .length();                                          //kalan harflerin uzunlugunu saydı
//        System.out.println(orneksonuc);
//
//        String cumle3 = "Alısveriş harikadır";
//        System.out.println(cumle3.indexOf("harika"));
//        System.out.println(cumle3.lastIndexOf("a"));
//
//
//        System.out.println(cumle3.startsWith("veriş", 4));
//        boolean kural1 = cumle3.startsWith("Al");
//        boolean kural2 = cumle3.endsWith("dır");
//        if (kural1&&kural2){
//            System.out.println("haklısın");
//        }else {
//            System.out.println("zaman zaman");
//        }
//      String kelime = "Kara kara karcık, ici dolu mayacık";
//        System.out.println(kelime.lastIndexOf("a",10)); //kara kara k nin icindeki en son a yı bulcak

    }
}
