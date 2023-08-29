package day10_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<Integer> sayilar3 = new ArrayList<>();
        sayilar3.add(15);
        sayilar3.add(-24);
        sayilar3.add(155);
        sayilar3.add(20);
        sayilar3.add(85);
        sayilar3.add(-40);
        sayilar3.add(14);
        System.out.println(sayilar3.indexOf(-45));

        for (Integer w : sayilar3) {
            if (w % 2 == 0) {
                sayilar3.set(sayilar3.indexOf(w), w + 13);
            }

        }
        System.out.println(sayilar3);


        sayilar3.remove(2);//indexini yazıp sildiriyoruz
        System.out.println(sayilar3);
        System.out.println(sayilar3);

        Integer silinecek = 33;//silincek olan
        sayilar3.remove(silinecek);

        System.out.println(sayilar3);
        List<String> name = new ArrayList<>();//tekli siliyo buda
        name.add("hasan");
        name.add("ali");
        name.add("mehmet");
        name.add("huseyin");
        name.add("tom");
        name.add("john");
        name.add("angelina");
        name.add("huseyin");
        name.remove("huseyin");
        System.out.println(name);

        List<String> yabancılar = new ArrayList<>();//önceki listeden sectiklerimizi sildirtir. coklu siler

        yabancılar.add("tom");
        yabancılar.add("john");
        yabancılar.add("angelina");
        yabancılar.add("hans");
        System.out.println(name.removeAll(yabancılar));
        System.out.println(name);

        List<String> işeGelenler = new ArrayList<>();//var olup olmadıgını kontrol ediyo
        işeGelenler.add("hasan");
        işeGelenler.add("ali");
        işeGelenler.add("mehmet");
        boolean sonuc = name.containsAll(işeGelenler);
        System.out.println(sonuc);


    }
}
