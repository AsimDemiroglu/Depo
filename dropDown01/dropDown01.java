package dropDown01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class dropDown01 {
    WebDriver driver = new ChromeDriver();

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement year = driver.findElement(By.id("year"));
        Select yearr = new Select(year);
        yearr.selectByVisibleText("2015");
        WebElement act=yearr.getFirstSelectedOption();
        String actyear=act.getText();

        Assert.assertEquals("2015",actyear);

        WebElement month = driver.findElement(By.id("month"));
        Select monthh = new Select(month);
        monthh.selectByVisibleText("January");

        WebElement day = driver.findElement(By.id("day"));
        Select dayy = new Select(day);
        dayy.selectByVisibleText("11");


        Thread.sleep(3000);

    }


    @Test
    public void testSelection() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement select = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        Select selectt = new Select(select);
        List<WebElement> stateOptions=selectt.getOptions();
        for (WebElement w : stateOptions){
            System.out.println(w.getText()+ " ");
        }
        System.out.println(stateOptions.size());

    }

    public void selectDropDown(WebElement dropDown, String text){
        /*
         WebElement ddYear= driver.findElement(By.id("year"));
        //2 Select class'ından ddyear web elementi ile obje olustur.
        Select yearSlct=new Select(ddYear);
        //3. yearSlct objesi ile selectByVisibleText() methodu ile dropdown sectik
        yearSlct.selectByVisibleText("2015");
         */

        List <WebElement> allOptionsDD = dropDown.findElements(By.tagName("option"));

        for (WebElement w : allOptionsDD){

            if(w.getText().equals(text)){
                w.click();
                break;
            }
        }

    }
    @Test
    public void methodDeneme(){
        selectDropDown(driver.findElement(By.xpath("//select[@id='state']")), "Colorado");
    }


    @After
    public void teardown() throws InterruptedException {
        driver.close();
    }
}
