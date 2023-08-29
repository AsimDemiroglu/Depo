package day19_Map;

import java.util.Arrays;
import java.util.HashMap;

public class map01 {
    public static void main(String[] args) {
        String cumle="Ali pas at, hadi pas at,";

        cumle.replaceAll("\\p{Punct}","");//noktalama işratelerini atmak icin
        System.out.println(cumle);

        String kelimeler[]=cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        HashMap<String,Integer> tekrarAdedi=new HashMap<>();


        for (String w :kelimeler){
            Integer sayac= tekrarAdedi.get(w);

            if (sayac == null){
                tekrarAdedi.put(w,1);

            }else {
                tekrarAdedi.put(w,sayac+1);
            }
        }
        System.out.println(tekrarAdedi);

    }
}
