package day13_İnheritancePolymorphism;

public class renault extends araba {
    String color;
    public renault(){
        super( "gri",80000);
        System.out.println("renault Constructer1");
    }
    public renault(String color){
        this.color=color;
        System.out.println("renault Constructer2");
    }
}
