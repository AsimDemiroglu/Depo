package Homework;

public class Homework05 {
    //  “sarkastik” kelimesinde a harflerinin tekrarlı olup olmadıgını bulan 2 farklı kod yazın

    public static void main(String[] args) {
//   1.yol

        String word="sarkastik";
        if (word.indexOf('a')==word.lastIndexOf('a')){;
            System.out.println("kelimede bir tane a harfi vardir");

        }
        else {
            System.out.println("kelimede a harfi tekarlidir");
        }
//    2.yol

        String word1="sarkastik";
        String word2=word1.replace("a","");
        if(word1.length()-word2.length()>1){
            System.out.println("kelimede a harfi tekarlidir");

        }
        else {
            System.out.println("kelimede bir tane a harfi vardir");
        }


    }





}
