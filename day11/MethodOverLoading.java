package day11;

public class MethodOverLoading {
    public static void main(String[] args) {

        String name="ahmet";



        int sonuc1 =toplama(3,5);

        double sonuc2= toplama(5,8.0);

        toplama(20.0,4);
    }

    public static int toplama(int a, int b) {
        return a + b;
    }

    public static double toplama(double a, int b) {
        return a + b;
    }

    public static double toplama(int a, double b) {
        return a + b;
    }

    public static double toplama(double a, double b) {
        return a + b;
    }
}
