package day_18Collection;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
       TreeSet<String> emails=new TreeSet<>();
        emails.add("hasanyldz@gmail.com");
        emails.add("mehmtydemir@gmail.com");
        emails.add("kamilcangmail.com");
        emails.add("alimert@gmail.com");
        emails.add("zeynepsert@gmail.com");
        System.out.println(emails);//
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emailList=new TreeSet<>();
        emailList.add("a@gmail.com");
        emailList.add("b@gmail.com");
        emailList.add("z@gmail.com");
        emailList.add("s@gmail.com");
        emailList.add("v@gmail.com");
        emailList.add("c@gmail.com");
        emailList.add("k@gmail.com");
        System.out.println(emailList);
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(start1-end1);

        Long start2 = LocalTime.now().toNanoOfDay();
        HashSet<String> email2=new HashSet<>();
        email2.add("a@gmail.com");
        email2.add("b@gmail.com");
        email2.add("z@gmail.com");
        email2.add("s@gmail.com");
        email2.add("v@gmail.com");
        email2.add("c@gmail.com");
        email2.add("k@gmail.com");
        TreeSet<String> sonlist=new TreeSet<>(email2);
        System.out.println(sonlist);
        Long end2=LocalTime.now().toNanoOfDay();
        System.out.println(end2-start2);




    }
}
