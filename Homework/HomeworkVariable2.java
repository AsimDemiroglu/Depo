 package Homework;

 import java.util.Scanner;

 public class HomeworkVariable2 {

        public String marketAlisverisi;


            public void liste(){
                System.out.println("elma+armut");
                System.out.println("karpuz+kavun");
                System.out.println("çilek+armut");
                System.out.println("elma+kiraz");
                System.out.println("mandalina+armut");

            }


     public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
         System.out.println("baba adını girin");
                String baba = scan.next();
         System.out.println("dogum yılı girin");
                String yil = scan.next();

         System.out.println("\""+baba+"\""+"\n"+"\""+yil+"\"");






     }


}



