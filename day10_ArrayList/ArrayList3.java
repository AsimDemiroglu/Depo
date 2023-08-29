package day10_ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        //Bir List'teki elemanlardan birbirine en yakın olanları bulunuz.
        //[10, 18, 13, 30, 20]                 [10, 13, 18, 20, 30]


        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(18);
        sayilar.add(13);
        sayilar.add(30);
        sayilar.add(20);
        System.out.println(sayilar);
    }
}
