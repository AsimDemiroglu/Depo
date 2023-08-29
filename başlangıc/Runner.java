package başlangıc;

import java.awt.*;
import java.util.Scanner;

public abstract class Runner {
    public static void main(String[] args) {
        System.out.println("----------Demiroglu--Eğitim------------");
        System.out.println("----------------Ana--Menü--------------");

        Scanner input = new Scanner(System.in);
        String giriş;
        do {
            System.out.println("  1-Okul bilgileri görüntüle\n" +
                    "  2-Ogretmen menu\n" +
                    "  3-Ogrenci menu\n" +
                    "  Q-Cıkıs için basınız");
            System.out.println("Lutfen menuden seciminizi yapınız");
            giriş = input.next();
            if (giriş.equals("1")) {
                Okul.okulBilgileri();

            } else if (giriş.equals("2")) {
                ogretmen.ogretmenMenu();


            } else if (giriş.equals("3")) {
                ogrenci.ogreciMenu();
            }

        } while (!giriş.equalsIgnoreCase("Q"));
        {
            System.out.println("sistemden cıkılıyor");
        }


    }
}
