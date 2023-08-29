package homework09;

import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {
        int[][] numbers={{5,12,1,8},{4,7},{5,3,2},{14},{6,9}};
        int yeni[]=new int[numbers.length];
        int toplam=0;
        int atama=0;
        for (int w[] : numbers){
            for (int k : w){
                toplam=toplam+k;
            }
            yeni[atama]=toplam;
            toplam=0;
            atama++;
        }

        System.out.println(Arrays.toString(yeni));
    }
}
//Verilen 2 katli bir array’de her bir ic
//array’deki elementleri toplayip, yeni
//olusturacagimiz tek katli bir array’e bu
//toplamlari atayin.
//int[][] numbers={{5,12,1,8},{4,7},{5,3,2},{14},
//{6,9}};
////  cıktı => yeni[]=[26, 11, 10, 14, 15]
//3.
//String cumle[][]={{"Ali", "süt", "ic"},{"Muhammed Ali",