package Homework00;

public class AİstanbulBayi extends AMarmaraBölge {
    int stokAracSayısı=30000;
     void siparis(){
        System.out.println("Siparişlerde  Bayi Stogunun %90 ı sevk edilir");
    }
    @Override
    public void AMarmara(){
        System.out.println("siparis falan filan");
    }

    @Override
    public int getToplamYıllıkSatıs() {
        return super.getToplamYıllıkSatıs();
    }
}
