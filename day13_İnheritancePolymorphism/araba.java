package day13_İnheritancePolymorphism;

public class araba extends vasıta {
    String color;
    int km;
    public araba(){
        System.out.println("araba Constructer1");
    }

    public araba(String color, int km){
        super("araba");
        this.color=color;
        this.km=km;
        System.out.println("araba Constructer2");
    }
}
