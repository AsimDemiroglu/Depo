package Junit01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitBeforeAfter {

    @Test
    public void test01(){
        System.out.println("test 01");
    }

    @Test
    public void test02(){
        System.out.println("test 02");
    }

   @Before
    public void setup(){
        System.out.println("Before");
    }

   @After
    public void teardown(){
        System.out.println("After");
    }


}
