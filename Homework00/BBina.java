package Homework00;

public class BBina extends Bİlçe{
    String type;
    int yas;
    BBina(){
        System.out.println("bina constructer1");
    }
    BBina(String tip){
        System.out.println("bina constructer2");
    }
    BBina(String type , int yaş){
        super(30000);
        this.type=type;
        this.yas=yas;

        System.out.println("bina constructer3");
    }

}
