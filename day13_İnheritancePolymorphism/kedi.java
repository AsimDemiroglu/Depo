package day13_İnheritancePolymorphism;

public class kedi extends memeliler{
    @Override
    public void hayvanlar() {
        System.out.println("kediler yemek yerler");
    }

    @Override
    public void memeliler() {
        super.memeliler();
    }



    public hayvanlar create1(){
        return new memeliler();
    }

    public void kedi(){
        System.out.println("kedi");


    }
}
