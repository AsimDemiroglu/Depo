package Homework;

import java.util.Scanner;

public class Homework04 {
    //    Kullanıcıdan 6 characterli bir kelime alın ve erkana kelimeyi tersten yazdırın

        // kelimeyi tersten yazdirma methodunu arastirdim ancak o methodun mantigini anlamadim

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 6 karakterli bir kelime giriniz");
        String kelime=input.next();

        if (kelime.length()==6){
            System.out.println(""+kelime.charAt(5)+kelime.charAt(4)
                    +kelime.charAt(3)+kelime.charAt(2)
                    +kelime.charAt(1)+kelime.charAt(0));
        }
        else {
            System.out.println("girdinginiz kelime 6 karakterli olmalidir");
        }







}
}
