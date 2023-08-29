package day17_Interface;

public class corolla implements motor, ac {
    @Override
    public void run() {
        System.out.println("");
    }

    @Override
    public double sayac() {
        return 0;
    }

    int model = 2022;
}
