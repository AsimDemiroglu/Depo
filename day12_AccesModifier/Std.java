package day12_AccesModifier;

public class Std {
    //public her class da kullanilabilir
    public String ogrenciName="Mehmet Yılmaz";
    //protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir.
    protected String address="Miami";
    //default olanlar baska package'dan kullanilamazlar
     String email="myilamz@gmail.com";  //onune default yazinca uyari veriyor cunku yazmamiz gerekiyor
    //privated olanlar sadece olusturulduklari class icinde kullanilabilirler
    private String ogrenciId="20231215003";

}
