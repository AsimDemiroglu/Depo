package day04Switch;

public class NestedTenary {
    public static void main(String[] args) {

        int yil = 1800;
        if (yil%100==0){
//            if (yil%400==0){
//                System.out.println("artik yıldır");
//            }
//            else {
//                System.out.println("artık yıl deil");
//            }
//        }else if (yil%100!=0){
//            if (yil%4==0){
//                System.out.println("artık yıldır");
//            } else {
//                System.out.println("artık yıl deil");
//            }
//
//        }
//        String sonuc =yil%100==0 ? (yil%400==0 ? "artık yıl": "artık yıl deil") : (yil%4==0 ? "artık yıl" : "artık yıl deil");
//        System.out.println(sonuc);

            String pswd = "asdf1";
            int uzunluk = pswd.length();
            System.out.println(uzunluk);

            String sonuc = pswd.length()>5? (pswd.charAt(0)=='a' ? "pswd olustu" : "hatalı pswd")
                        : (pswd.charAt(0)=='Z')? "pswd olustu":"pswd olusmadı";


    }
}
}