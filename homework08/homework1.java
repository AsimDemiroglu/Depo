package homework08;

public class homework1 {
    public static void main(String[] args) {
        ///* iki Array'ın
        //a ) ortak eleman varsa ortak elemanları ekrana yazdıran
        //b ) yoksa ortak iki " Array'larin ortak elemanı yoktur"
        //yazdıran kodu yazar mısınız?
        //        String[] arr1 = {"A", "O", "B", "K", "J"};
        //        String[] arr2 = {"A", "J", "R", "O", "C", “D”};
        String[] arr1 = {"A", "O", "B", "K", "J"};
        String[] arr2 = {"A", "J", "R", "O", "C", "D"};

        boolean ortakEleman=false;
        for (String w : arr1){
            for (String i : arr2){
                if (w.equals(i)){
                    System.out.println(w+ " ");
                    ortakEleman=true;
                    break;
                }
            }
        }
      if (!ortakEleman){
          System.out.println("ortak eleman yoktur");
      }
    }
//        public static void main(String[] args) {
//            String arr1[] = {"A", "O", "B", "K", "J"};
//            String arr2[] = {"A", "J", "R", "O", "C", "D"};
//            // {"E", "N", "R", "G", "C", "D"}; ortak eleman olmayinca sonucu denemek icin
//            String ortak=null;
//            for (String w: arr1){
//                for (String k: arr2){
//                    if (w.equals(k)){
//                        System.out.print(w+" ");
//                        ortak=ortak+w;
//                    }
//                }
//            }
//            if (ortak==null){
//                System.out.println("Array'larin ortak elemani yoktur");
//            }
//
//            {
//            }
     //   }
    }
