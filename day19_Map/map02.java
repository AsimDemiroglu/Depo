package day19_Map;

import java.util.Arrays;
import java.util.HashMap;

public class map02 {
    public static void main(String[] args) {
        String deneme = "abcdcbb";

        String harfler[] = deneme.split("");

        System.out.println(Arrays.toString(harfler));

        HashMap<String, Integer> tekrarAdedi = new HashMap<>();


        for (String w : harfler) {

            Integer sayac = tekrarAdedi.get(w);

            if (sayac == null) {
                tekrarAdedi.put(w, 1);

            } else {
                tekrarAdedi.put(w, sayac + 1);
            }
        }
        System.out.println(tekrarAdedi);

    }

}


