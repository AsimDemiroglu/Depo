package homework09;

import java.util.Arrays;

public class homework5 {
    ////int[][] numbers = {{5, -12, 1, -8}, {4, -7}, {5,
    //3, -2}, {14}, {6, 9}};
    //a) en kucuk pozitif ve en buyuk
    //negatif sayiyi bulunuz
    //            b) MultidimentionalArray'i her elmanı
    //2 katını alıp yeni bir array'e aktarın
    public static void main(String[] args) {
        int[][] numbers = {{5, -12, 1, -8}, {4, -7}, {5, 3, -2}, {14}, {6, 9}};
        //   a)
        int kucuk=numbers[0][0];
        int buyuk=numbers[0][1];

        for (int w[]: numbers){
            for (int k: w){
                if(k>0){
                    kucuk=Math.min(kucuk,k);

                }
                if (k<0){
                    buyuk=Math.max(buyuk,k);
                }
            }
        }
        System.out.println("En buyuk Negatif sayi: "+buyuk+"\nEn kucuk Pozitif sayi: "+kucuk);
        // b)
        int eleman=0;
        for (int w[]: numbers) {
            eleman = eleman + w.length;
        }
        int tekArray[]= new int[eleman];

        int index=0;

        for (int w[]: numbers){
            for (int k: w){
                tekArray[index]=k*2;
                index++;
            }
        }

        System.out.println(Arrays.toString(tekArray));

    }
}
