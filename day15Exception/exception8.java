package day15Exception;

import java.util.Scanner;

public class exception8 {
    //Kullanicidan TC kimlik numarasini isteyin. Bu kimlik
    //numarasinin son rakaminin cift rakam olarak bittigini ve Tc
    //kimlik numarasinin 11 haneden olustugunu kontrol eden non-
    //static bir method’ ta kontrol edin. Aksi durumda
    //IllegalArgumentException olusturun. Kontrol edeceginiz son
    //rakami ve 11 haneyi ic ice try-catch kullanarak yapin. Finally
    //blogunda Scanner’ i kapatin.

    public boolean TcKontrol(String a) {

        if (!a.matches("\\d{11}")) {
            throw new  IllegalArgumentException("tc kimlik 11 hane olmak zorundadır");
        }
        int last = Character.getNumericValue(a.charAt(a.length()-1));
        if (last % 2 != 0) {
            throw new ArithmeticException("tc kimlik son hanesi cift olmalıdır");
        }
        System.out.println(a);

       return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        exception8 bakar = new exception8();

        try {
            System.out.print("Tc kimlik giriniz ");
            String tcID = input.nextLine();
            bakar.TcKontrol(tcID);
            System.out.println(" TC Kimlik dogru.");
        } catch (IllegalArgumentException e) {
            System.out.println("11 haneden olusmalı " + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("son rakam cift olmalıdır " + e.getMessage());
        }finally {
            input.close();
        }


    }
}

