package homework2;

import java.util.Scanner;

public class homework12 {
    //    // Soru 2
//        // Kullanıcıdan bir kelime alın ve aldığı
//kelimeyi tersten yazdıran iki ayrı method
//olusturun(yöntemleri farklı olsun)
//        //eger tersi düzü ile aynı ise ekrana
//"Girdiginiz kelime polidron yazdırın",
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("kelime girin");
//        String alınan = input.next();
//        StringBuilder alınan2 = new StringBuilder(alınan);
//        System.out.println(alınan2.reverse());
//        if (alınan.equals(alınan2.toString())) {
//            System.out.println("girilen kelime polidrondur");
//        } else {
//            System.out.println(" ");
//        }
//
//        System.out.println("----------------------");
//
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("Kelime girin:");
//        String alinan = input2.next();
//
//        if (palindrom(alinan)) {
//            System.out.println("Girilen kelime palindromdur.");
//        } else {
//            System.out.println("Girilen kelime palindrom değildir.");
//        }
//    }
//
//    public static boolean palindrom(String word) {
//        int length = word.length();
//        for (int i = 0; i < length / 2; i++) {
//            if (word.charAt(i) != word.charAt(length - 1 - i)) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String kelime = input.next();
        StringBuilder yeni = new StringBuilder(kelime);
        dönüstürücü(yeni);
        System.out.println(yeni);
        manuelDönüştürücü(kelime);


        boolean result = kelime.equalsIgnoreCase(manuelDönüştürücü(kelime));
        if (result == true) {
            System.out.println("kelimeniz polidron.");
        } else {
            System.out.println("kelimeniz polidron değildir.");
        }

        //Bu karşılaştırmayı String kullanarak yaptım ama String Builder ifadeleri karşılaştırmadım neden?

        if(yeni.equals(dönüstürücü(yeni))){
            System.out.println("kelime polidrondur");
        }else {
            System.out.println("kelime polidron değildri.");
        }
    }

    public static StringBuilder dönüstürücü(StringBuilder a) {
        StringBuilder strB1 = new StringBuilder(a.reverse());
//    System.out.println(strB1);
        return strB1;
    }

    public static String manuelDönüştürücü(String a) {
        String olustur = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            olustur += a.charAt(i);
        }
        // System.out.println(olustur);


        return olustur;
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen bir kelime giriniz");
//        String word = input.next();
//        System.out.println(strTers(word));
//        if (word.equals(strTers(word))) {
//            System.out.println("Girdiginiz kelime polindromdur");  // String
//        } else {
//            System.out.println("Girdiginiz kelime polindrom degildir");
//        }
//
//
//        System.out.println(strBldReverse(word));
//
//        if (word.equals(strBldReverse(word).toString())) {
//            System.out.println("Girdiginiz kelime polindromdur");  // String
//        } else {
//            System.out.println("Girdiginiz kelime polindrom degildir");
//        }
//    }
//
//    public static String strTers(String a) {
//        String result = "";
//        for (int i = a.length() - 1; i >= 0; i--) {
//            result = result + a.charAt(i);
//        }
//
//        return result;
//    }
//
//    public static StringBuilder strBldReverse(String a) {
//        StringBuilder tersten = new StringBuilder(a);
//        tersten.reverse();
//        return tersten;
//
//    }
}

