package homework08;

import java.util.Arrays;
import java.util.Comparator;

public class homework3 {
    public static void main(String[] args) {
        //Verilen String’de en kısa kelimeyi bulunuz.
        //2 yol ile çözünüz. (biri loop)
        String[] arr1 = {"Mehmet", "Tunc", "Ilker", "Omer Faruk", "ali" , "Demir"};
        String enKücük = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i].length() < enKücük.length()) {
                enKücük = arr1[i];
            }
        }
        System.out.println(enKücük);
//        String[] arr2 = {"Mehmet", "Tunc", "Ilker", "Omer Faruk", "Demir"};
//         String kücük = arr2[0];
//        for (String w :arr2){
//            if (w.length() < kücük.length()) {
//                kücük = w;
//            }
//        }
//        System.out.println(kücük);
//
//        Arrays.sort(arr1, Comparator.comparingInt(String::length));
//        System.out.println(arr1[0]);


    }
}