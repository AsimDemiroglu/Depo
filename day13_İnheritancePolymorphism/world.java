package day13_İnheritancePolymorphism;

public class world {

    public world(){
        super();
    }

    void konusmak(){
        System.out.println("yerel dil dısında en cok ingilizce konusulur");
    }
    long nufus=8000000000L;
    public static final int toplam(int a , int b){
        return a+b;
    }
    public static final double toplam(double a , int b){
        return (int) (a+b);
    }
    public static final double toplam(int a , double b){

        return (int) (a+b);
    }
    public static final double toplam(double a , int b, int c){

        return (int) (a+b+c);
    }
}
