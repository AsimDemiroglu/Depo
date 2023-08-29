package homework3;

public class homework3 {
    public static void main(String[] args) {
        char harf = 'u';
        System.out.println("sıralama ;");
        for (char i = harf; i >= 'b'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        char i = harf;
        while (i>='b'){
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        i=harf;
        do {
            System.out.print(i+" ");
            i--;
        }while (i>='b');


    }
}
//’u’ harfinden baslayarak ‘b’ harfine kadar b
//dahil tum harfleri yazdirin.
//For ,  while ve do while ile"tek
////ekran cıktısı
//u t s r q p o n m l k j i h g f e d c