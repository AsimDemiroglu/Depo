package day10_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        List<Double> salary = new ArrayList<>();
        salary.add(1500.0);
        salary.add(2100.0);
        salary.add(1800.0);
        salary.add(2000.0);
        System.out.println(salary);
        for (double w : salary) {
            if (w > 2000.0) {
                salary.set(salary.indexOf(w), (w * 110 / 100));

            } else {
                salary.set(salary.indexOf(w), (w * 120 / 100));
            }
        }
        System.out.println(salary);
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('D');


        list1.add('A');
        list1.add('B');
        list1.add('D');

       int counter=0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.size() != list2.size()) {
                counter++;
                System.out.println("esit deil");
                break;
            }
            if (list1.get(i) != list2.get(i)) {
                System.out.println("eşit değil");
                counter++;
                break;
            }
        }
        if (counter==0){
            System.out.println("eşit");
        }
         boolean sonuc = list1.equals(list2);
        if (sonuc){
            System.out.println("eşit");
        }else {
            System.out.println("eşit deil");
        }
        //Verilen bir listteki elemanları tekrarsız olaraz yazınız.
        // [5, 8, 3, 5, 7, 8, 5]
        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(5);
        sayılar.add(8);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(8);
        sayılar.add(5);

        System.out.println(sayılar);
        List<Integer> yeniSayılar = new ArrayList<>();
        for (Integer w: sayılar){
            if (!yeniSayılar.contains(w)){
                yeniSayılar.add(w);

            }
        }
        System.out.println(yeniSayılar);


//[B, D, L, T]
//
//Kullanıcıdan bir harf alınız, harf sizin List'in içinde varsa o harfi BULUNDU ya çeviriniz
//    yoksa o harfi listeye ekleyiniz.





        ArrayList<String> listem=new ArrayList<>();

        listem.add("B");
        listem.add("D");
        listem.add("L");
        listem.add("T");

        System.out.println("-------------------------------------------------");
        System.out.println(listem);

        String harf="";
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen tahmininiz olan bir harf giriniz : ....");
            harf = input.next().substring(0, 1);

            if (listem.contains(harf)) {
                listem.set(listem.indexOf(harf), "Bulundu");
            } else if(!harf.equalsIgnoreCase("q")){
                listem.add(harf);
            }
        }while (!harf.equalsIgnoreCase("q"));
        System.out.println(listem);





    }
}


