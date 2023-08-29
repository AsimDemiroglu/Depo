package day15Exception;

public class exception6 {
    //String'deki character sayisini bulunuz, String'i integer'a ceviriniz, Integer'i character sayisina bolunuz
    public static void main(String[] args) {

        System.out.println(aranan("123"));

    }public static double aranan(String a){
        double sonuc=0;
       try {
           int uzunluk=a.length();
           int sayısalDeğeri=Integer.valueOf(a);
            sonuc=sayısalDeğeri/uzunluk;
       }catch (NumberFormatException e){
           System.out.println(e.getMessage());
       }catch (NullPointerException e){
           System.out.println(e.getMessage());
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }


        return sonuc;
    }
}
