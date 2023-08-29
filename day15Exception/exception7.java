package day15Exception;

import java.util.Scanner;

public class exception7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yas gir");
        int age = input.nextInt();
        // yasYazdırma(age);


        try {
            yasYazdırma(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------------------------");
    }

    public static void yasYazdırma(int a) {
        if (a < 0 || a > 200) {
            throw new IllegalArgumentException("yas negatif olamaz ve 200 den büyük olamaz");
        }
        System.out.println(a);
    }
}
