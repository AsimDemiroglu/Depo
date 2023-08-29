package day11;

public class PassByValue {
    public static void main(String[] args) {

        int price = 100;

        change(price);

        System.out.println(price);

        sale(price);
        System.out.println(sale(price));
        System.out.println("price :" + price);
        int yemek = 1200;
        int ogrenciYemek = saleogrenci(yemek);
        System.out.println(ogrenciYemek);

        int personelYemek = salePersonel(yemek);

        System.out.println(personelYemek);


        int e = 40;
        int f = e--;
        System.out.println(f);
        System.out.println(e);


    }

    public static void change(int a) {
        System.out.println(a * 3);
    }

    public static int sale(int a) {
        return a * 9 / 10;
    }

    public static int saleogrenci(int x) {
        return x * 9 / 10;
    }

    public static int salePersonel(int g) {
        return g * 8 / 10;
    }

    public static long sonsucCarpma(int... k) {
        int carpım = 1;
        for (int w : k) {
            carpım = carpım * w;

        }
        return carpım;
    }
}
