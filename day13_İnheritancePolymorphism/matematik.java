package day13_İnheritancePolymorphism;

public class matematik extends kurs {
    public matematik(){

        System.out.println("kurs 1");
    }
    public matematik(int a ){

        System.out.println("kurs 2");

    }
    public matematik(String str ){
       super("ekders");
        System.out.println("kurs 3");

    }
}
