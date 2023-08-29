package day12_AccesModifier;

public class StringBuilder1 {
    public static void main(String[] args) {

        bölgeler secilen=bölgeler.IcAnadolu;

        /*
         "Akdeniz"  turizm
"Karadeniz"  çay,
 "İç Anadolu"  bugday,
 "Doğu Anadolu"  hayvancılık,
 "Güneydoğu Anadolu"  tarih turizmi


         */



        switch (secilen){

            case Ege:
                System.out.println("zeytinyağı");
                break;
            case Marmara:
                System.out.println("sanayi");
                break;
            case Karadeniz:
                System.out.println("cay");
                break;
            case Akdeniz:
                System.out.println("turizm");
                break;
            case IcAnadolu:
                System.out.println("bugday");
                break;
            case DoguAnadolu:
                System.out.println("hayvamcılık");
                break;

            default:
                System.out.println("Gecerli değil");
        }
        // 1. Yol :
        StringBuilder cumle1strb = new StringBuilder("Java");
        System.out.println(cumle1strb);

        // 2. Yol :
        StringBuilder cumle2strb = new StringBuilder();
        System.out.println(cumle2strb); //

        cumle2strb.append("Ders");
        System.out.println(cumle2strb);

        cumle2strb.append(" çalışmadan").append(" başarı olmaz");
        System.out.println(cumle2strb);

        StringBuilder cumle3strb = new StringBuilder("");
        cumle3strb.append("java");
        int numofchar = cumle3strb.length();
        System.out.println(cumle3strb.capacity());
        cumle3strb.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(cumle3strb.capacity());
        cumle3strb.setCharAt(0, 'r');
        System.out.println(cumle3strb);
        cumle3strb.delete(4, 100);
        System.out.println(cumle3strb);
        cumle3strb.deleteCharAt(1);
        System.out.println(cumle3strb);

        System.out.println(cumle3strb.capacity());

        cumle3strb.reverse();
        System.out.println(cumle3strb);

        String name="Hasan";
        System.out.println(name.toLowerCase());
        System.out.println("name : " + name);
        cumle3strb.insert(1,"kk");
        System.out.println(cumle3strb);

        String cumle1=cumle3strb.toString();
        System.out.println(cumle1);

        String name1="Kamil";
        StringBuilder name1StrB=new StringBuilder(name1);
        System.out.println(name1);

        StringBuilder user1=new StringBuilder("giriş deneme");
        StringBuilder user2=new StringBuilder("giriş deneme");
        System.out.println(user1.compareTo(user2));
        StringBuilder user3=new StringBuilder("Hiriş deneme");
        System.out.println(user1.compareTo(user3));


    }

}
