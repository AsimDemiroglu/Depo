package day09_MultyArray;

import java.util.Arrays;

public class array {
    // //Asağıdaki Array için ek buyuk negatif ve en kucuk pozitif sayiyi bulunuz.
    public static void main(String[] args) {
        int sayılar[] = {45, -70, 95, -3, 8, 20, -15};
        Arrays.sort(sayılar);
        System.out.println(Arrays.toString(sayılar));
        int enkücükpoztif = sayılar[sayılar.length - 1];
        int enbüyüknegatif = sayılar[0];
        for (int w : sayılar) {
            if (w < 0) {
                if (enbüyüknegatif < w) {
                    enbüyüknegatif = w;
                }

            }
            if (w > 0) {
                if (enkücükpoztif > w) {
                    enkücükpoztif = w;
                }
            }
        }
        System.out.println(" " + enbüyüknegatif+ " " + enkücükpoztif);


        System.out.println(Math.max(2, 8));
        System.out.println(Math.min(2, 8));

        int number[][]={ {5 , 3 } , {8 , 16} , {6 , -3 }};
        System.out.println(Arrays.deepToString(number));
        System.out.println(Arrays.toString(number[0]));
        System.out.println(number[0][1]);
        System.out.println(number[2][0]);



        //[[Ali, ata bak], [Ali, topu, tut], [Ali, okula, git], [Ali, eve, gel]]

    }

}
