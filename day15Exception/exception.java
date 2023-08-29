package day15Exception;

public class exception {
    public static void main(String[] args) {
//        bolmeİslemiYap(10, 2);
//        bolmeİslemiYap(0, 6);
        bolmeİslemiYap2(8, 0);
        System.out.println("-------------------------------------");
        System.out.println("bölme işlemi yapıldı");

    }

    static void bolmeİslemiYap(int x, int y) {
        System.out.println(x / y);
    }

    public static void bolmeİslemiYap2(int a, int b) {
        try {
            System.out.println(a / b);

            System.out.println("basarı ile calıstı");

        } catch (ArithmeticException e) {
//            System.out.println("bölme isleminde bir islem olustu");
//
////            System.err.println("bölme işleminde bir problem olustu");
//
//            System.err.println(e.getMessage());


            e.printStackTrace();

        }
    }
}
