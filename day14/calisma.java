package day14;

public class calisma {
    static int sayi=10;
    public static void main(String[] args) {
        calisma clsm1=new calisma();
        calisma clsm2=new calisma();

        clsm1.sayi=sayi+5;
        clsm2.sayi=sayi+20;
        System.out.println(clsm1.sayi);
        System.out.println(clsm2.sayi);
    }
}
