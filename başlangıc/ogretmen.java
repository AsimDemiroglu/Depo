package başlangıc;

import java.util.ArrayList;
import java.util.Scanner;

public class ogretmen extends Okul{

   public static ArrayList<String> ogretmenListesi = new ArrayList<>();

    public static void ogretmenMenu() {
        Scanner input = new Scanner(System.in);
        String girisOgretmen;

        do {
            System.out.println("---------------------------------------------------");
            System.out.println("1-Ogretmen listesi yazdır\n" +
                    "2-Soyisimden Ögretmen bulma\n" +
                    "3-Branstan Öğretmen bulma\n" +
                    "4-Yeni Öğretmen ekle\n" +
                    "5- silmek istegini hocanın tc gir\n" +
                    "A-Anamenü\n" +
                    "Q-Çıkış");
            System.out.println("------------------------------------------------------");
            girisOgretmen = input.next();

            switch (girisOgretmen) {
                case "1":
                    System.out.println("-----------------------------------------------");
                    System.out.println("TcNo   İsim  Soyİsim   D.yili   Brans");
                    System.out.println("12345678-Kayra-Uncu-1432-Sosyal Bilimler");
                    System.out.println("23456789-Esma-Yıldız-943-Matematik");


                    for (String ogretmenbilgi : ogretmenListesi) {
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
                        System.out.println("23456789-Esma-Yıldız-943-Matematik23456789-Esma-Yıldız-943-Matematik");
                    } else {
                        System.out.println("Bu soyad ile kimse yoktur");
                    }
                    break;
                case "3":
                    Scanner brans = new Scanner(System.in);
                    System.out.println("brans giriniz");
                    String arananBrans = brans.next();
                    if (arananBrans.equalsIgnoreCase("Sosyal Bilimler")) {
                        System.out.println("Kayra Uncu");
                    } else if (arananBrans.equalsIgnoreCase("Matematik")) {
                        System.out.println("Esma Yıldız");
                    } else {
                        System.out.println("Bu bransta ögretmen yoktur");
                    }
                    break;
                case "4":
                    Scanner yeni = new Scanner(System.in);
                    System.out.println("Bilgileri - ile giriniz (TcNo-İsim-Soyİsim-D.yili-Brans):");
                    String girilenYeni = yeni.nextLine();

                    ogretmenListesi.add(girilenYeni);
                    break;
                case "5":
                    Scanner silmek = new Scanner(System.in);
                    System.out.println("Silmek istediğiniz hocanın TcNo'sunu giriniz:");
                    String tcNoToDelete = silmek.next();

                    boolean removed = false;
                    // Find and remove the teacher with the given TcNo from the ArrayList
                    for (String ogretmenBilgi : ogretmenListesi) {
                        if (ogretmenBilgi.startsWith(tcNoToDelete + "-")) {
                            ogretmenListesi.remove(ogretmenBilgi);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Öğretmen başarıyla silindi.");
                    } else {
                        System.out.println("Belirtilen TcNo ile öğretmen bulunamadı.");
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