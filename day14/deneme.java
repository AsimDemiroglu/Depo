package day14;

public class deneme {
    int a;
    static int b;
    deneme(int k){
        a+=k;
        b+=k;
    }

    public static void main(String[] args) {
       deneme dnm1= new deneme( 3);
       deneme dnm2= new deneme( 4);

        System.out.println( "a degeri : "+ dnm2.a + ","+"b degeri: "+ dnm1.b);
        System.out.println( "a degeri : "+ dnm1.a + ","+"b degeri: "+ dnm2.b);
    }
}
