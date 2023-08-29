package day19_Map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Treemap01 {
    public static void main(String[] args) {
        TreeMap<String, Double> guncelStok = new TreeMap<>();
        guncelStok.put("avakado", 40.5);
        guncelStok.put("kırmızı et", 85.5);
        guncelStok.put("un", 3.0);
        guncelStok.put("pirinc", 20.0);
        guncelStok.put("ekmek", 15.5);
        guncelStok.put("sogan", 12.0);
        System.out.println(guncelStok);
        NavigableMap<String, Double> sonuc2 = guncelStok.tailMap("kırmızı et", false);
        System.out.println(sonuc2);
        SortedMap<String, Double> result3 = guncelStok.subMap("ekmek", "sogan");
        System.out.println(result3);//subway belirtilen keyler arası entryleri verir

        Map.Entry<String, Double> result4 = guncelStok.lowerEntry("avakado");
        System.out.println(result4);//lowerentry girlen keyden önceki entry seti verir

        Map.Entry<String, Double> result5 = guncelStok.lowerEntry("patates");
        System.out.println(result5);//girilen değer keyde yoksa alfabetik olarak bi önceki(var olan)

        Map.Entry<String, Double> result6 = guncelStok.higherEntry("pirinc");
        System.out.println(result6);


        Map.Entry<String, Double> result8=guncelStok.ceilingEntry("kırmızı et");
        System.out.println(result8);


        Map.Entry<String, Double> result9=guncelStok.ceilingEntry("dondurma");
        System.out.println(result9);


        Map.Entry<String, Double> result10=guncelStok.floorEntry("dondurma");
        System.out.println(result10);

        Map.Entry<String, Double> result11=guncelStok.floorEntry("ananas");
        System.out.println(result11);




    }
}
