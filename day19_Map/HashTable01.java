package day19_Map;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        Hashtable <String,Integer> ogrenciNotları=new Hashtable<>();
        ogrenciNotları.put("Ali demir",95);
        ogrenciNotları.put("Hasan Yıldız",85);
        ogrenciNotları.put("Hatice turk",100);
        ogrenciNotları.put("Kamil yılmaz",65);
      //  ogrenciNotları.put(null,45);
      //  ogrenciNotları.put("asa",null);
        System.out.println(ogrenciNotları);





        bayi deneme=new bayi("İstanbul","Kadıköy",350,false);
        System.out.println(deneme.city);

        bayi deneme1=new bayi("Ankara","Çankaya",150,false);
        String deneme1Town=deneme1.town;
        System.out.println(deneme1Town);
        System.out.println("------------------------------------------------------------------------");


        Hashtable<String,bayi> güncelStok=new Hashtable<>();
        güncelStok.put("içanadolu",new bayi("ankara","Akdere",20,true));
        System.out.println(güncelStok);

        güncelStok.put("marmara",new bayi("istanbul","taksim",110,false));
        güncelStok.put("ege",new bayi("izmir","alsancak",95,false));
        güncelStok.put("akdeniz",new bayi("antalya","kemer",65,true));
        System.out.println(güncelStok);

    }


}
