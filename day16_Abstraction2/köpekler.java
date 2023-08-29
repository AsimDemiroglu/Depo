package day16_Abstraction2;

public class köpekler extends Bmemeliler {
    @Override
    public void hareket() {
        System.out.println("köpekler yurur");
    }

    @Override
    public void eat() {
        System.out.println("köpekler yer");
    }
}
