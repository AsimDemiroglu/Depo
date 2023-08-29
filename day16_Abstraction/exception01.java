package day16_Abstraction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exception01 {
    public static void main(String[] args) throws IOException {
        CharCharOkumaYazdımar();

    }
    public static void CharCharOkumaYazdımar(){
        try {
            FileInputStream fis= new FileInputStream("src/main/java/day16_Abstraction/file1.txt");

            int k=0;

            while ((k=fis.read())!=-1){
                System.out.println((char)k);
            }

        } catch (FileNotFoundException e)
        {

            throw new RuntimeException("adres hatalı ......"+ e.getMessage());




        } catch (IOException e) {
            throw new RuntimeException("okunamayan tanımsız karakter vardır.... " + e.getMessage());
        }


//        yol 2 public static void CharCharOkumaYazdımar() gereken exception{}
   //   int k=0;

//        while ((k=fis.read())!=-1){
//            System.out.print((char)k);
//
//        }
    }
}
