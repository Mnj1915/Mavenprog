import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MywebElemant {

    @Test
    public void locators()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver mydriver=new ChromeDriver();

        mydriver.get("https://www.next.co.uk/");
        mydriver.manage().window().maximize();
        String title= mydriver.getTitle();
        System.out.println("Title of application is ;;;;;;;;;"+title);

      mydriver.findElement(By.id("onetrust-accept-btn-handler")).click();
        System.out.println("validating search ");
        System.out.println("type now");
        mydriver.findElement(By.name("header-big-screen-search-box")).sendKeys("purse");
        System.out.println("you have typed ");


        mydriver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button")).click();
       // System.out.println("you have clicked on search button");
       //mydriver.findElement(By.id("onetrust-accept-btn-handler")).click();
       //mydriver.findElement(By.xpath("//*[@id=\"meganav-link-8\"]/div")).click();
        System.out.println("click on colour");


//mydriver.findElement(By.tagName("Colour")).click();

        mydriver.findElement(By.xpath("//*[@id=\"plp-f-h-colour\"]/div[1]/div/h3/legend")).click();
        System.out.println("black colour");
        mydriver.findElement(By.name("plp-facet-checkbox-colour:black")).click();
    int size=    mydriver.findElements(By.tagName("a")).size();
        System.out.println("size is images are      "+size);
        //mydriver.close();
    }

}
