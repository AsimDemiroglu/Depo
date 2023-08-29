package day04Switch;

import java.util.Scanner;

public class İfSatament01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("alınan notu giriniz");
        int not = input.nextInt();

        if (not < 0) {
            System.out.println("deger girilemezz");
        } else if (not < 41) {
            System.out.println("D");
        } else if (not < 62) {
            System.out.println("alınan not c");
        } else if (not < 81) {
            System.out.println("alınan not  B");
        } else if (not < 101) {
            System.out.println("alınan not A");
        } else {
            System.out.println("deger girilemez");
        }
    }


}





