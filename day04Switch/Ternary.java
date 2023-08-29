package day04Switch;

public class Ternary {
    public static void main(String[] args) {

        int sayi = 1;

       if (sayi % 2 == 0) {
           System.out.println("çift sayıdır");
     } else {
           System.out.println("tek sayıdır");
       }
       String sonuc = sayi % 2 == 0 ? "cift sayıdır" : "tek sayıdır";
      System.out.println(sonuc);
        int sayi1 = 65;
       int sayi2 = 45;
       String sonuc1 = sayi1 > sayi2 ? "sayi1 büyük" : "sayi2 büyük";
        System.out.println(sonuc1);
        int nmbr1 = - 65;
        int nmbr2 = - 45;
        Object result =(nmbr1>=0 || nmbr2>=0)&&(nmbr1<=0 || nmbr2<=0) ? nmbr1+nmbr2 :"islem yapmam";





    }
}
