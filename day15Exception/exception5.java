package day15Exception;

public class exception5 {
    //uString bir veriden indexdeki char elemanı getiren method olsuturunuz.
    public static void main(String[] args) {

        System.out.println(chrımsı("hasan", 4));
        System.out.println(chrımsı("hasan", 2));
        System.out.println(chrımsı("hasan",8));

    }

    public static char chrımsı(String a, int x) {
        char sonuc = ' ';
        try {
             sonuc = a.charAt(x);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
        return sonuc;

    }
}
