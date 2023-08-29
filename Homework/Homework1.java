package Homework;

import java.util.Scanner;

public class Homework1 {
// Kullanıcıdan Erkek veya Kadın oldugu bilgisini alınız?
//Erkekler 65 yaş ve üzeri ise “Emekliliğin tadını çıkarabilirsiniz”
//65 altı ise kaç yıl sonra emekli olacagını yazdırın
//Kadınlarda ise 60 üzeri ise Emekliliğin tadını çıkarabilirsiniz”
//60 altı ise kaç yıl sonra emekli olacagını yazdırın
//Hatalı giriş için “Cinsiyet yanlış girildi” uyarısında bulunuz
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("cinsiyetinizi giriniz");
           String cinsiyet = input.next();
           System.out.println("yaş bilginiz");
           int yaş = input.nextInt();
           if (cinsiyet.equalsIgnoreCase("Erkek")){
               if (yaş>=65){
                   System.out.println("emekliliğin tadını cıkarınız");
               }else if (yaş<0) {
                   System.out.println("girdiginiz bilgi yanlıştır");
               } else if (yaş<65) {
                   System.out.println(65-yaş+"yıl sonra emekli olabilirsiniz");
               }
           }else if (cinsiyet.equalsIgnoreCase("Kadın")){
               if (yaş>=60){
                   System.out.println("emekliliğin tadını cıkarınız");
               }else if (yaş<0) {
                   System.out.println("girdiginiz bilgi yanlıştır");
               } else if (yaş<60) {
                   System.out.println(60-yaş+"yıl sonra emekli olabilirsiniz");
               }

           }else {
               System.out.println("cinsiyet bilginiz yanlıştır");
           }


}

}
