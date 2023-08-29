package Junit01;

import org.junit.*;

public class JunitBeforeAfter03 {

    @Test
    public void test01(){
        System.out.println("test 01");
        System.out.println("-----------------------------------------------------------------------");
    }

    @Test
    public void test02(){
        System.out.println("test 02 ");
        System.out.println("----------------------------------------------------------------------");
    }
    @Before
    public void setup(){
        System.out.println("Before her testten once calisir");
        System.out.println("---------------------------------------------------------------------");
    }

    @After
    public void teardown(){
        System.out.println("After her testten sonra calisir");
        System.out.println("---------------------------------------------------------------------");
    }

    @BeforeClass
    public static void setup01(){
        System.out.println("BeforeClass \" class'da \" bir kere tum testler once calisir");
        System.out.println("---------------------------------------------------------------------");
    }

    @AfterClass
    public static void teardown01(){
        System.out.println("AfterClass \" class'da \" bir kere tum testler sonra calisir");
        System.out.println("---------------------------------------------------------------------");
    }


}
