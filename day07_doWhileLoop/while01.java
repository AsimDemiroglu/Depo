package day07_doWhileLoop;

import java.util.Scanner;

public class while01 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

//       while (i<12){
//           System.out.print(i+" ");
//           i++;
//       }
        //21 den 8 e kadar tum cift sayilari ekrana yazdiriniz
//        int i = 21;
//        while (i > 8) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//            i--;
//        }
//        int sub = 0 ;
//        int a = 25;
//        while (a<41){
//            sub=sub+a;
//            a++;
//        }
//        System.out.println(sub);
//        int result = 0;
//        int number = 438;
//        while (number>0){
//            result=result+number%10;
//            number= number/10;
//        }
//        System.out.println(result);
        int toplam = 0 ;
        int sayac = 0;
        Scanner input = new Scanner(System.in);
        while (toplam<1000){
            System.out.println();
            System.out.println("toplamak icin sayı giriniz ");
            int sayi = input.nextInt();
            if (sayi== 0){
                break;
            }
            toplam=toplam+sayi;
            sayac=sayac+1;
        }
        System.out.println("girilen sayı ; "+sayac + "rakamların toplamı ; " + toplam );

//        4 carpım tablosu
        int n =1;
        while (n<11){
            System.out.println("4 * "+ n+ "= "+(n*4));
            n++;
        }
    }
}
