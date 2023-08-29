package day19_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ıterator01 {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();
        nameList.add("ahmet yılmaz");
        nameList.add("hasan demir");
        nameList.add("ali durmus");
        nameList.add("kamil yılmaz");

        System.out.println(nameList);

        ListIterator<String> isimler=nameList.listIterator();

        while (isimler.hasNext()){
            String sonuc= isimler.next();
            isimler.set(sonuc+"*");
        }

        System.out.println(nameList);


        List<String> ogrenciler=new ArrayList<>();
        ogrenciler.add("ahmet yılmaz");
        ogrenciler.add("hasan demir");
        ogrenciler.add("ali durmus");
        ogrenciler.add("kamil yılmaz");

        ListIterator<String> ogrencikayıtları=ogrenciler.listIterator();

//        while (ogrencikayıtları.hasNext()){
//            ogrencikayıtları.next();
//            ogrencikayıtları.remove();
//
//
//        }
        System.out.println(ogrenciler);


        while (ogrencikayıtları.hasNext()){
          //  System.out.println(ogrencikayıtları.next());
            ogrencikayıtları.next();
        }



        while (ogrencikayıtları.hasPrevious()){
            System.out.print(ogrencikayıtları.previous()+"  ");
        }
    }


}
