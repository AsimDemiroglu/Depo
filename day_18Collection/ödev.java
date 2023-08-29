package day_18Collection;

import day04Switch.Switch;

import java.util.LinkedList;
import java.util.Scanner;

public class ödev {
    //1.Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun.
    //Kullanicidan bir isim alin.Bu isim LinkedList'de varsa silin ve kullaniciya
    //"Bu isim LinkedList'de vardi ve silindi“diye mesaj verin. Bu isim
    //LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye
    //mesaj verin
    //
//    public static void main(String[] args) {
//        LinkedList<String> name = new LinkedList<>();
//        name.add("Ali");
//        name.add("Veli");
//        name.add("Can");
//        name.add("Ayse");
//        System.out.println(name);
//        Scanner input=new Scanner(System.in);
//        System.out.println("İsim giriniz");
//        String Girilen = input.next();
//        if (removeName(name, Girilen)) {
//            System.out.println("Bu isim LinkedList'de vardi ve silindi");
//        } else {
//            System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi ");
//        }
//        System.out.println(name);
//    }
//    public static boolean removeName(LinkedList<String> list, String a) {
//        return list.removeIf(n -> n.equalsIgnoreCase(a));
//    }
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Can");
        names.add("Ayse");

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String girilenIsim= input.next();


        // 1. yol
        boolean bl=names.remove(girilenIsim);
        // remove methodunun boolean return ettigini gostermek icin bu yontemle yaptim
        if (bl){
            System.out.println("Bu isim LinkedList de vardi ve silindi");
            System.out.println(names);
        }
        else {
            System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
            System.out.println(names);
        }

        // 2. yol
//            if (names.contains(girilenIsim)){
//                names.remove(girilenIsim);
//                System.out.println("Bu isim LinkedList de vardi ve silindi");
//                System.out.println(names);
//
//            }else {
//                System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
//                System.out.println(names);
//      }

        // 3.yol
        // buyuk kucuk harf duyarli olmasin istenirse for dongusu ile de yapilabilir.
        //bu soru icin dongu clear olmayabilir belki ama

//        int sayac=0;
//        for(int i=0; i<names.size(); i++){
//            if (names.get(i).equalsIgnoreCase(girilenIsim)){
//                names.remove(i);
//                i--;
//                sayac++;
//            }
//
//        }if (sayac!=0){
//            System.out.println("Bu isim LinkedList de vardi ve silindi");
//            System.out.println(names);
//        }
//        else {
//            System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
//            System.out.println(names);
//        }





    }
}


//       if (name2.equalsIgnoreCase("Ali")){
//           name.remove("Ali");
//           System.out.println("Bu isim LinkedList'de vardi ve silindi");
//       }else if (name2.equalsIgnoreCase("Veli")){
//           name.remove("Veli");
//           System.out.println("Bu isim LinkedList'de vardi ve silindi");
//       }else if (name2.equalsIgnoreCase("Can")) {
//           name.remove("Can");
//           System.out.println("Bu isim LinkedList'de vardi ve silindi");
//       }else if (name2.equalsIgnoreCase("Ayse")) {
//           name.remove("Ayse");
//           System.out.println("Bu isim LinkedList'de vardi ve silindi");
//       }else {
//           System.out.println( name2 + " " + "Bu isim LinkedList'de yok bu yuzden silinemedi ");
//       }
//        System.out.println(name);
//    }


