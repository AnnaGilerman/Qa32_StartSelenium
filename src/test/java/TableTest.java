import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class TableTest {
    WebDriver wd;

    @Test

    public void tableCss()
    {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://www.w3schools.com/css/css_table.asp");

        WebElement el = wd.findElement(By.cssSelector("#customers td:last-child"));
    }


    @Test
    public void homework()
    {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("file:///C:/Users/alexa/Downloads/index.html");

        //WebElement item1 = ;

        WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement item2 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item4 = wd.findElement(By.cssSelector("#nav ul:last-child li:fist-child a"));

        WebElement item1_2 = wd.findElement(By.cssSelector("#nav ul li:first-child a"));

        WebElement inputName1 = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputName2 = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));

        WebElement button = wd.findElement(By.cssSelector(".btn"));

        WebElement inputName1_2 = wd.findElement(By.cssSelector("[name='name']"));


        WebElement russia = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(2)"));
        WebElement europe = wd.findElement(By.cssSelector("tr:first-child td:first-child Europe"));
        WebElement asia = wd.findElement(By.cssSelector("tr:first-child td:nth-child(2)"));
        WebElement america = wd.findElement(By.cssSelector("tr:first-child td:last-child America"));
        WebElement ukraine = wd.findElement(By.cssSelector("tr:nth-child(2) td:first-child Ukraine"));
        WebElement israel = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        WebElement usa = wd.findElement(By.cssSelector("tr:nth-child(2) td:last-child USA"));
        WebElement germany = wd.findElement(By.cssSelector("tr:nth-child(3) td:first-child Germany"));
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child Canada"));
        WebElement poland = wd.findElement(By.cssSelector("tr:last-child td:first-child Poland"));
        WebElement chine = wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        WebElement mexico = wd.findElement(By.cssSelector("tr:last-child td:last-child Mexico"));


        WebElement cube = wd.findElement(By.cssSelector("#alert"));

    }
}
