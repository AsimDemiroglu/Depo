package day16_Abstraction2;

public class yarıs implements motor,kaporta,ac{
    @Override
    public void digital() {
        System.out.println(" digital moddadır");
    }

    @Override
    public void klima() {
        System.out.println("klimaya sahiptir ");

    }

    @Override
    public void çelik() {
        System.out.println("çelikten kaportaya sahiptir");

    }


    @Override
    public void eco() {
        System.out.println("eco bir motora sahiptir");

    }

    @Override
    public void tsi() {
        System.out.println("tsi motoru vardır");
    }
}

