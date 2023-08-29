package day_18Collection;

import java.util.PriorityQueue;

public class Deque01 {
    public static void main(String[] args) {
        PriorityQueue<String> deneme=new PriorityQueue<>();
        deneme.add("k");
        deneme.add("a");
        deneme.add("z");
        deneme.add("d");
        deneme.add("v");
        System.out.println(deneme);

        String s=deneme.poll();
        System.out.println(deneme);
        System.out.println(s);


    }
}
