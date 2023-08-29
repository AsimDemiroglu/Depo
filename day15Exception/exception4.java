package day15Exception;

public class exception4 {
    String değisimSayı="360";

    public static void arrayDeğişim(String a[],int b){
        int s=0;
        try {
            String.valueOf(a);
        }catch (NumberFormatException e){
            System.out.println("sayı dışı giriş");
        }

    }

}
