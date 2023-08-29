package day14;

public class practice {
    int i=10;
    static int k=15;

    public static void main(String[] args) {
        practice p1=new practice();
        practice p2=new practice();
        p1.i=18;
        p2.i=23;

        System.out.println("p1.k"+p1.k);
        System.out.println("p2.k"+p2.k);

        System.out.println("p1.i"+p1.i);
        System.out.println("p2.i"+p2.i);
    }
}
