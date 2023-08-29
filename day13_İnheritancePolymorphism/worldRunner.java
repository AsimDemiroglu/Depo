package day13_İnheritancePolymorphism;public class worldRunner {
    public static void main(String[] args) {
        Turkey insan=new Turkey();
        insan.konusmak();
        System.out.println(insan.nufus);            //83000000

        avrupa avrupali =new Turkey();
        avrupali.konusmak();                   //Turkce konusulur
        System.out.println(avrupali.nufus);     //764000000


        world human=new france();
        human.konusmak();                         //Fransızca konusulur
        System.out.println(human.nufus);            //80000000
    }
}

