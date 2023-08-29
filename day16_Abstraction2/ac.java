package day16_Abstraction2;

public interface ac {
    void digital();
    void klima();
    default void ufleme(){
        System.out.println("ac hava üfler");
    }

}
