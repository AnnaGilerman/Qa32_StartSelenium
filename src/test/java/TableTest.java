import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;

    @Test

    public void tableCss()
    {
        wd = ChromeDriver;
        wd.manage().window().maximize();
        wd.get(url:"https://www.w3schools.com/css/css_table.asp");

        WebElement el = wd.findElement(By.cssSelector("#customers td:last-child"));
    }


    @Test

    public void homework()
    {
        wd = ChromeDriver;
        wd.manage().window().maximize();
        wd.get(url:"file:///C:/Users/alexa/Downloads/index.html");

        //WebElement item1 = ;

        
    }
}
