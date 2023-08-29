package homework2;

import java.time.LocalTime;
import java.time.ZoneId;

public class homework11 {
//    public static void main(String[] args) {
//        LocalTime turkiye = LocalTime.now(ZoneId.of("Europe/Istanbul"));
//
//        int numberFor = 1;
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(numberFor);
//        }
//
//        LocalTime turkiye2 = LocalTime.now(ZoneId.of("Europe/Istanbul"));
//        String number1 = "1";
//        StringBuilder sb = new StringBuilder(number1);
//        String number2 = sb.toString();
//        System.out.println(turkiye);
//
//        System.out.println("\n" + number2 .repeat(1000));
//        System.out.println(turkiye2);
//        int sonuc = turkiye.compareTo(turkiye2);
//
//        if (sonuc > 0) {
//            System.out.println("1>2");
//        } else if (sonuc < 0) {
//            System.out.println("2>1");
//        } else {
//            System.out.println("1=2");
//        }
//    }
public static void main(String[] args) {



    String kelime = "1";
    long Starttime = System.nanoTime();
    for (int i=0; i<1001; i++){
        kelime+=".";
    }
    System.out.println(kelime);
    long FinishTime = System.nanoTime();



    StringBuilder kelimeStr = new StringBuilder("1");
    long Starttime2 = System.nanoTime();
    for (int i=0; i<1001; i++){
        kelimeStr.append(".");
    }
    System.out.println(kelimeStr);
    long FinishTime2 = System.nanoTime();


    if ((FinishTime - Starttime)>(FinishTime2 - Starttime2)){
        System.out.println("String daha yavaş");
    }else {
        System.out.println("StringBuilder daha yavaş");
    }


}

}





