package day16_Abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exception02 {
    public static void main(String[] args) throws IOException {
       // satırSatırOku();
        satırSatırOku2();
    }
    public static void satırSatırOku() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src/main/java/day16_Abstraction/file1.txt"));

        String satır= br.readLine();
        while(satır!=null){
            System.out.println(satır);
            satır= br.readLine();
        }

    }
    public static void satırSatırOku2()  {
        BufferedReader br= null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/day16_Abstraction/file1.txt"));
            String satır=br.readLine();
            while (satır!=null){
                System.out.println(satır);
                satır=br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("dosya bulunamadı ...." + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("okunamayan bilgi...." + e.getMessage());
        }


    }
}
