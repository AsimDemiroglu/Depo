package dropDown01;

import Utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class örnel01 extends TestBase {
    @Test
    public void denemeTest01(){


        driver.get("https://www.youtube.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("youtube"));
    }
}

