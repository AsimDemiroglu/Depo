package Homework;

import java.util.Scanner;

public class Homework4 {
    //Switch
    //Kullanicidan ay numasını alarak ekrana hangi mevsim oldugunu yazdıran kodu yazınız
    //12 , 1, 2 Kış
    //3, 4, 5 İlkbahar
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ay numarası giriniz");
        int ayNo = input.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("kış");
                break;
            case 2:
                System.out.println("kış");
                break;
            case 3:
                System.out.println("ilkbahar");
                break;
            case 4:
                System.out.println("ilkbahar");
                break;
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
                System.out.println("yaz");
                break;
            case 7:
                System.out.println("yaz");
                break;
            case 8:
                System.out.println("yaz");
                break;
            case 9:
                System.out.println("sonbahar");
                break;
            case 10:
                System.out.println("sonbahar");
                break;
            case 11:
                System.out.println("sonbahar");
                break;
            case 12:
                System.out.println("kış");
                break;
            default:
                System.out.println("lütfen gecerli bir sayı giriniz");


        }
    }
}
