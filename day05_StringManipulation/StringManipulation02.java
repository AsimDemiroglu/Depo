package day05_StringManipulation;

import java.util.Scanner;

public class StringManipulation02 {
    public static void main(String[] args) {
        String kelime = "TEKRARLAMA";
        int deneme = kelime.indexOf("K");
        System.out.println(deneme);
        int deneme2 = kelime.lastIndexOf("K");
        System.out.println(deneme2);

        int denemea = kelime.indexOf("A");
        System.out.println(denemea);
        int denemeA = kelime.lastIndexOf("A");
        System.out.println(denemeA);
        boolean tekrar = kelime.indexOf("E") == kelime.lastIndexOf("E");
        System.out.println(tekrar);

        String kelime1 = "";
        System.out.println(kelime1.isEmpty());
        System.out.println(kelime1.isBlank());
        Scanner input = new Scanner(System.in);
        System.out.println("sifre gir");
        String sifre = input.nextLine();
        if (sifre.isBlank()) {
            System.out.println("sifreniz gecerli bi kelime giriniz");
        } else {
            System.out.println("sifreniz olustu");
        }



    }
}
