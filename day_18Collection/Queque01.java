package day_18Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queque01 {
    public static void main(String[] args) {
        Queue<String> depoList = new LinkedList<>();
        depoList.add("süt");
        depoList.add("un");
        depoList.add("kırmızı et");
        depoList.add("bal");
        System.out.println(depoList);

        boolean result1=depoList.offer("un");
        System.out.println(depoList);
        System.out.println(result1);
        depoList.peek();
        System.out.println(depoList);
    }
}
