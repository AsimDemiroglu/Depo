package homework3;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cümle giriniz:");
        String cumle = input.nextLine();

        System.out.println("Bir harf seçiniz:");
        char harf = input.next().charAt(0);

        int harftekrarı = 0;
        int index = 0;
        while (index < cumle.length()) {
            if (Character.toLowerCase(cumle.charAt(index)) == Character.toLowerCase(harf)) {
                harftekrarı++;
            }
            index++;
        }

        System.out.println("Harf tekrarı: " + harftekrarı);
    }
}
    //Kullanıcıdan bir cumle alınız ve kullanıcıdan
//girdiği cumlede istediği karakterin kaç kere
//tekrar ettiğini hesaplayiniz
//(hepsini buyuk ya da kucuk harf yapip
//hesaplayınız)
//Kulladınıcım girdiği cumle : “Ali ata bak.”
//Kullanıcının hesaplanmasini istediği harf : ‘a’;
//Ali ata bak. Cumlede ‘a’ harfi 4 tanedir.
