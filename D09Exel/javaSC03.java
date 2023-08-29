package D09Exel;

import Utulities.TestBase;
import org.junit.Test;

public class javaSC03 extends TestBase {

    @Test
    public void javaSC03(){
       driver.get("https://www.obilet.com/");
        getValueByJS("origin-input");
    }
}
