package day09_MultyArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList <Integer> sayilar1=new ArrayList<Integer>();
        ArrayList <Integer> sayilar2=new ArrayList<>();
        List<Integer> sayilar3=new ArrayList<Integer>();
        System.out.println(sayilar1);
        System.out.println(sayilar2);
//eleman ekleme
        sayilar1.add(15);
        sayilar1.add(5);
        sayilar1.add(35);
        //ekleme sırasına göre eklenmesine ınsertor order denir.
        System.out.println(sayilar1);
        sayilar1.add(1,45);
        System.out.println(sayilar1);
        sayilar2.add(-25);
        sayilar2.add(-185);
        System.out.println(sayilar2);
        //sayılar2 yi sayılar 1 e ekledi
        sayilar1.addAll(sayilar2);
        System.out.println(sayilar1);
        sayilar1.addAll(1,sayilar2);
        System.out.println(sayilar1);
        boolean eklemeSonuc =sayilar1.add(18);
        System.out.println(eklemeSonuc);
        System.out.println(sayilar1);

        System.out.println(sayilar1.size());
    }
}
