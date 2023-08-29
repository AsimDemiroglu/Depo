package day13_İnheritancePolymorphism;

import java.sql.SQLOutput;

public class avrupa extends world {
    public avrupa(){
        super();
    }
    void konusmak(){
        System.out.println("En cok almanca konusulur");
    }
    long nufus=764000000L;
    void uretim(){
        System.out.println("sanayi uretimi gelişmiştir");
    }
}
