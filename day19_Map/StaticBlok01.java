package day19_Map;

public class StaticBlok01 {

    private static String kelime;

    static {
        System.out.println(kelime = "ahmet" + kelime);
    }
    public static int sayılarTopl;

    static {
        sayılarTopl=5;
        System.out.println(sayılarTopl);
    }



    public static void main(String[] args) {
        System.out.println("main calıstı");
    }
}
