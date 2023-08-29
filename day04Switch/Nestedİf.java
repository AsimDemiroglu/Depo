package day04Switch;

import java.util.Scanner;

public class Nestedİf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("almak istediginiz marka araba");
        String marka = input.next();
        System.out.println("nakit mıktarı");
        int nakit = input.nextInt();
        if (marka.equalsIgnoreCase("Toyota")) {
            if (nakit < 30000) {
                System.out.println(30000 - nakit + "kadar bakiyeniz yetersiz");
            } else if (nakit > 30000) {
                System.out.println(nakit - 30000 + "kadar bakiyeniz fazladır");
            } else {
                System.out.println("toyota siparisiniz olusturuldu");
            }
        } else if (marka.equalsIgnoreCase("honda")) {
            if (nakit < 40000) {
                System.out.println(40000 - nakit + "kadar nakitiniz eksik");
            } else if (nakit> 40000) {
                System.out.println(nakit - 40000 + "kadar nakitiniz fazladır");
            } else {
                System.out.println("honda siparisiniz olusturuldu");
            }
        } else {
            System.out.println("ürün bayimizde yoktur");
        }


    }
}
