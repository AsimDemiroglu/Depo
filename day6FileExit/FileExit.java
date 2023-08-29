package day6FileExit;

import Utulities.TestBase;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExit  {
    @Test
    public void test(){
        String userDır=System.getProperty("user.dir");
        System.out.println(userDır); //C:\Users\Bahadır\IdeaProjects\FirstMavenProject

        String userHome=System.getProperty("user.home");
        System.out.println(userHome); //C:\Users\Bahadır

        String logoPath=userHome+"//Desktop//logo.jpg";  //  ==>  "C:\Users\Yns"+""\\Desktop\\logo.jpeg"

        Boolean sonuc=Files.exists (Paths.get (logoPath));
        System.out.println(sonuc);
    }
}
