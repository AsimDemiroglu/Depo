package day15Exception;

import java.util.Scanner;

public class exception9 {
    //bir method olsuturun ve boy kilo indexinin hesaplayıp ekrana yazdırsın?
    //kullanıcıdan boy ve kilo degerlerini alıp  method ile ekrana yazdırın .
    //kullanıcının kiloyu sıfır girdiginde exception kilo sifir olamaz uyarisi versin
    // ve catch edilsin ve her halülarda sonunda “işlem tamamlandıgında server ile baglantınız kesildi yazdırsın”
    public double  boyvekilo(int boy, int kilo) {
        if (kilo == 0) {
            throw new IllegalArgumentException("kilo 0 olamaz ");
        } else if (boy == 0) {
            throw new ArithmeticException("boy 0 olamaz ");
        }
        double result = (boy * boy) / kilo;

        return result;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        exception9 kontrolcu = new exception9();

        try {
            System.out.println("boy giriniz");
            int boy = input.nextInt();
            System.out.println("kilo giriniz");
            int kilo = input.nextInt();

            System.out.println(kontrolcu.boyvekilo(boy, kilo));


        } catch (IllegalArgumentException e) {
            System.out.println(" yanlış girdiniz: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(" yanlıs girdiniz " + e.getMessage());
        } finally {
            System.out.println("sistem ile olan bağlantınız kesildi");
            input.close();
        }
    }
}


