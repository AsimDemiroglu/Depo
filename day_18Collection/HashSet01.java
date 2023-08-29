package day_18Collection;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet<Integer> hastakayıt=new HashSet<>();
        hastakayıt.add(12202211);
        System.out.println(hastakayıt);
        hastakayıt.add(12202313);
        hastakayıt.add(12202105);
        hastakayıt.add(12202401);
        System.out.println(hastakayıt);
        hastakayıt.add(12202105);
        System.out.println(hastakayıt);

        HashSet<String> depoKayıt=new HashSet<>();
        depoKayıt.add("elma");
        depoKayıt.add("armut");
        depoKayıt.add("süt");
        depoKayıt.add(null);
        System.out.println(depoKayıt);
    }
}
