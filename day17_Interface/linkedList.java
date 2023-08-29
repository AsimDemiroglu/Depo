package day17_Interface;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();


        name.add("ahmet");

        name.add("hasan");

        name.add("ali");

        name.add("hans");

        name.add("kazım");

        System.out.println(name);

        name.add(1,"Angelina");

        System.out.println(name);

        name.addLast("ugur ıslak kek yicen mi");

        name.addFirst("ugur bey corbanıza * gibi dedi");

        System.out.println(name);

        name.removeLast();

        System.out.println(name);

        LinkedList<String> visitor = new LinkedList<>();
//        visitor.removeLast();
//        System.out.println(visitor);

        name.removeFirst();

        System.out.println(name);

        name.addLast("Angelina");

        name.addLast("hans");

        System.out.println(name);

        name.removeFirstOccurrence("hans");

        System.out.println(name);

        name.removeLastOccurrence("Angelina");

        System.out.println(name);

        String bilinen=name.pop();
        System.out.println(name);
        System.out.println(bilinen);

        String ilknode=name.peek();
        System.out.println(name);
        System.out.println(ilknode);

        System.out.println(visitor.peek());

        System.out.println(name.element());
        System.out.println(name);




        System.out.println(name.get(0));

//        for (String w : name){
//            if (w.startsWith("a")||w.startsWith("A")){
//                name.set(name.indexOf(w),"*****");
//            }
//        }
//        System.out.println(name);
//
        for (int i = name.size() - 1; i >= 0; i--) {
            String w = name.get(i);
            if (w.length() > 4) {
                name.remove(i);
            }
        }

        System.out.println(name);
    }


}
