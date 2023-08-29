package day16_Abstraction;

public class CustomExpection {
    public static void main(String[] args) throws  IllegalGradeException {

        notlarıYazdır(100);
        boolean denemeSonuc=nameChecked("Deniz");
        System.out.println(denemeSonuc);


    }
    public static void notlarıYazdır(int a) throws  IllegalGradeException{
        if (0>a||a>100){
            throw new IllegalGradeException("notlar 0 ile 100 arasında olmalıdır");
        }else{
            System.out.println(a);
        }
    }
    public static boolean nameChecked(String name) {
        boolean sonuc = true;
        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            sonuc = true;
        } else {
            sonuc=false;
            throw new IllegalNameExpection("ilk harf büyük olmalı");

        }

        return sonuc;
    }
}
