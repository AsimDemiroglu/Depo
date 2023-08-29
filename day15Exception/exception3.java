package day15Exception;

public class exception3 {
    public static void main(String[] args) {
        String deneme1="hasan";
        arrayKarakter(deneme1);
        String denem2=null;
        arrayKarakter(denem2);
    }
    public static void arrayKarakter(String a){
        try {
            System.out.println(a.length());
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
