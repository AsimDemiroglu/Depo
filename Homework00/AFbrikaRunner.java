package Homework00;

public class AFbrikaRunner {
    public static void main(String[] args) {
        AİstanbulBayi bayi = new AİstanbulBayi();
        System.out.println(bayi.getToplamYıllıkSatıs());

        bayi.AMarmara();


        AFabrika f1 = new AİstanbulBayi();
        System.out.println(f1.stokAracSayısı);
        f1.siparis();
        //setter ile değişir
        //ancak final oldugu icin değişmez
    }

}
