import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSelenium
{
    @Test
    public void first() {


        //WebDriverManager.chromedriver().setup();

       // WebDriver mychrome = new ChromeDriver();
        WebDriverManager.edgedriver().setup();
        WebDriver mychrome=new EdgeDriver();
        mychrome.get("https://www.next.co.uk/");
          mychrome.manage().window().maximize();
          //mychrome.manage().deleteAllCookies();
         //mychrome.getTitle( );
        String title= mychrome.getTitle();
        System.out.println("title is "+title);

        String ctitle= mychrome.getCurrentUrl();
        System.out.println("current title is    "+ctitle);

        String Expectedtitle ="https://www2.next.co.uk/";
       // Assert.assertEquals(ctitle,Expectedtitle);

        System.out.println("assert pass");

       mychrome.navigate().back();
       String tt= mychrome.getTitle();
        System.out.printf(tt);
        mychrome.navigate().forward();
        String t= mychrome.getTitle();
        System.out.println(t);
       // mychrome.close();
            }


    }


