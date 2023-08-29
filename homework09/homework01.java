package homework09;

import java.time.LocalDate;

public class homework01 {
    public static void main(String[] args) {
        //  //soru 3
        //Kullanıcıdan  asal sayı girmesini isteyin
        //        // bir method olusturun saynın asal olup
        //olmadıgını sorgulasın
        //        // bir oyun duzenegi kurun sayi asal ise
        //"Tebrikler bildiniz yeni asal sayi girer
        //misiniz" yazdırsın
        //        // Yanlış girer ise "sayi asal değildir" 3
        //"hakkınız var tekrar deneyiniz" yazdırsin
        //        // kullanıcının girdigi sayıları bir
        //arraylist'in icine atsın ve kullanıcı aynı sayıyı
        //girmeye çalışırsa
        //        // bu sayıyı girmiştiniz tekrar asal sayi
        //giriniz uyarısı versin
        //        // her girdigi asal sayi için 100 puan
        //ekleyiniz ve oyun sonu puanını yazdırınız
        //        // 3 hakkı doldugunda oyunu kaybettiniz
        //yazsın
        //        // kullanıcıya oyun basında 0 a
        //basarsanız oyunda cıkabilirsiniz uyarısı
//        //versin ve sıfıra basınca oyundan cıksın
//        Scanner input = new Scanner(System.in);
//        System.out.println("asal sayı gir");
//        int asal= input.nextInt();


        ////soru 4
        ///* program calıstıgı gunu göre ekrana o gun
        //dogan bırının burcunu ayzdıran kodu
        //yazınız. (if - else if - else)
        //*/
        //        /*acıklama
        //        LocalDate class'ında olusturulan bir
        //obje ile .getDayOfMonth() methodu
        //sayesinde ay bilgisini int olarak alabilirsiniz.
        //        LocalDate class'ında olusturulan bir
        //obje ile .getDayMonthValue() methodu
        //sayesinde gun bilgisini int olarak
        //alabilirsiniz.
        //         */
        //
        LocalDate currentDate = LocalDate.now();
        int gün = currentDate.getMonthValue();
        int ay = currentDate.getDayOfMonth();

        if ((ay == 3 && gün >= 21) || (ay == 4 && gün <= 19)) {
            System.out.println("koc");
        } else if ((ay== 4 && gün >= 20) || (ay == 5 && gün <= 20)) {
            System.out.println("boğa");
        } else if ((ay == 5 && gün >= 21) || (ay == 6 && gün <= 20)) {
            System.out.println("ikizler");
        } else if ((ay == 6 && gün >= 21) || (ay == 7 && gün <= 22)) {
            System.out.println("yengec");
        } else if ((ay == 7 && gün >= 23) || (ay == 8 &&gün <= 22)) {
            System.out.println("aslan");
        } else if ((ay == 8 && gün >= 23) || (ay == 9 && gün <= 22)) {
            System.out.println("basak");
        } else if ((ay == 9 && gün >= 23) || (ay == 10 && gün <= 22)) {
            System.out.println("terazi");
        } else if ((ay == 10 && gün >= 23) || (ay == 11 && gün<= 21)) {
            System.out.println("akrep");
        } else if ((ay == 11 && gün >= 22) || (ay == 12 && gün<= 21)) {
            System.out.println("yay");
        } else if ((ay == 12 && gün >= 22) || (ay == 1 && gün <= 19)) {
            System.out.println("oglak");
        } else if ((ay == 1 && gün >= 20) || (ay == 2 && gün <= 18)) {
            System.out.println("kova");
        } else {
            System.out.println("balık");
        }

        //bir method overloading olsuturunuz
        ////
        //// int sayi ile bir kelimenin harf sayisinin
        //carpımını int olarak veren
        ////
        //// verilen iki Stirng Kelimenin uzunlularının
        //çarpımını hesaplıp ekrana yazdıran
        ////


        double sonuc=carpım(5,2);
        int sonuc2=carpım3(5,3);
        System.out.println(sonuc2);

        int sayi = 5;
        String word = "ali";

        int cevap1 = kelimeh(sayi, word);
        System.out.println(  cevap1);

        String ilk = "ehe";
        String son = "yey";

        int cevap = kelimey(ilk, son);
        System.out.println(cevap);
    }

    public static double carpım(double a, int b) {
         double carpım2=1;
         carpım2 = a*b ;
        System.out.println(carpım2);
        return carpım2;
    }
    public static double carpım2(double a, double b) {
        return a * b;
    }
    public static int carpım3(int a, int b) {
        return a * b;
    }
    public static int kelim1(String kelime, int a){
        int carpım3=1;

        carpım3 =kelime.length()*a;
        return carpım3;
    }

    public static int kelimeh(int number, String word) {
        int wordLength = word.length();
        return number * wordLength;
    }
    public static int kelimey(String bişi, String bişi2) {
        int length1 = bişi.length();
        int length2 = bişi2.length();

        return length1 * length2;
    }

}

