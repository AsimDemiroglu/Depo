package başlangıc;

import java.util.ArrayList;
import java.util.Scanner;

public class ogrenci extends Okul{
        public static ArrayList<String> ogrenciListesi = new ArrayList<>();

        public static void ogreciMenu() {
            Scanner input = new Scanner(System.in);
            String girisogrenci;

            do {
                System.out.println("---------------------------------------------------");
                System.out.println("1-Ogrenci listesi yazdır\n" +
                        "2-Soyisimden Ögrenci bulma\n" +
                        "3-sınıf ve subeden ögrenci\n" +
                        "4-Yeni Öğrenci ekle\n" +
                        "5- silmek istegini ögrencinin tc gir\n" +
                        "A-Anamenü\n" +
                        "Q-Çıkış");
                System.out.println("------------------------------------------------------");
                girisogrenci = input.next();

                switch (girisogrenci) {
                    case "1":
                        System.out.println("-----------------------------------------------");
                        System.out.println("TcNo   İsim  Soyİsim   D.yili   okulNo   SınıfSube");
                        System.out.println("12345678-Kayra-Uncu-1432-1234-11/A");
                        System.out.println("23456789-Esma-Yıldız-943-12345-12/C");


                        for (String ogretmenbilgi : ogrenciListesi) {
                            System.out.println(ogretmenbilgi);
                        }
                        System.out.println("---------------------------------------------");
                        break;
                    case "2":
                        Scanner soyIsim = new Scanner(System.in);
                        System.out.println("soy isim giriniz");
                        String arananSoyIsim = soyIsim.next();
                        if (arananSoyIsim.equalsIgnoreCase("Uncu")) {
                            System.out.println("Kayra Uncu");
                        } else if (arananSoyIsim.equalsIgnoreCase("Yıldız")) {
                            System.out.println("Esma Yıldız");
                        } else {
                            System.out.println("Bu soyad ile kimse yoktur");
                        }
                        break;
                    case "3":
                        Scanner brans = new Scanner(System.in);
                        System.out.println("sınıf ve sube");
                        String arananBrans = brans.next();
                        if (arananBrans.equalsIgnoreCase("11/a")) {
                            System.out.println("Kayra Uncu");
                        } else if (arananBrans.equalsIgnoreCase("12/c")) {
                            System.out.println("Esma Yıldız");
                        } else {
                            System.out.println("Böyle bir sınıf yoktur");
                        }
                        break;
                    case "4":
                        Scanner yeni = new Scanner(System.in);
                        System.out.println("Bilgileri aralarda - işareti ile " +
                                "giriniz (TcNo   İsim  Soyİsim   D.yili   okulNo   SınıfSube):");
                        String girilenYeni = yeni.nextLine();

                        ogrenciListesi.add(girilenYeni);
                        break;
                    case "5":
                        Scanner silmek = new Scanner(System.in);
                        System.out.println("Silmek istediğiniz ögrencinin TcNo'sunu giriniz:");
                        String tcNoToDelete = silmek.next();

                        boolean removed = false;

                        for (String ogrenciBilgi: ogrenciListesi) {
                            if (ogrenciBilgi.startsWith(tcNoToDelete + "-")) {
                                ogrenciListesi.remove(ogrenciBilgi);
                                removed = true;
                                break;
                            }
                        }

                        if (removed) {
                            System.out.println("Öğrenci basarı ile silindi.");
                        } else {
                            System.out.println("Belirtilen TcNo ile öğrenci bulunamadı.");
                        }
                        break;
                    case "A":
                        return; // Return to the main menu
                    case "Q":
                        System.out.println("Çıkılıyor...");
                        System.exit(0); // Exit the program
                        break;
                    default:
                        System.out.println("Geçersiz seçim, tekrar deneyiniz.");
                }
            } while (true);
        }
    }

