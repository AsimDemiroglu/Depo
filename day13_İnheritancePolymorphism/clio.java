package day13_İnheritancePolymorphism;

public class clio extends renault  {
    int price;
    int year;
    public clio(){
        System.out.println("clio Constructer1");
    }
    public clio(int price){
        this.price =price;
        System.out.println("clio Constructer2");
    }
    public clio(int price, int year){
        super();
        this.price=price;
        this.year=year;
        System.out.println("clio Constructer3");
    }
}
