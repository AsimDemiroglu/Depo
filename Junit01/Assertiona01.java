package Junit01;

import org.junit.Assert;
import org.junit.Test;

public class Assertiona01 {

    @Test
    public void denemetesti(){

        String name1="Has";
        String name2="Hasan";
        Assert.assertEquals(name1,name2);
    }

    @Test
    public void denemetesti02(){

        Assert.assertTrue(5>10);
    }
}
