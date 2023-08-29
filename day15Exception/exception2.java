package day15Exception;

public class exception2 {
    public static void main(String[] args) {

        String hasta[]={"ahmet","veli","hasan","deniz"};

        arrayELemanGetir(hasta,0);
        arrayELemanGetir(hasta,3);
        arrayELemanGetir(hasta,5);
    }
    public static void arrayELemanGetir(String str[],int index){
        try {
            System.out.println(str[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            System.out.println("index değeri arrayden uzundur");
            e.printStackTrace();

        }


    }

}
