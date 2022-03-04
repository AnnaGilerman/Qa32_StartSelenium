import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class StartPhoneBookCopy {
    WebDriver wd;

    @Test
    public void startPhonebook()
    {
        wd = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver", "path");
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/"); //open

        //wd.navigate().to( url: "https://contacts-app.tobbymarshall815.vercel.app/"); //open www + history
        wd.manage().window().maximize();

        //steps of test login Success
        //open login form  ----- find loginbtn + click  ------> opened form login
     //   WebElement el = wd.findElement(By.id("idel"));
     //  List<WebElement> el = wd.findElements(By.id("idel"));

     //   WebElement a = wd.findElement(By.tagName("a")); -----> HOME
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();

      //  WebElement element = wd.findElement(By.id("root"));
      //  WebElement element = wd.findElement(By.className("container"));





        // fill email  ----- find email element + click + clear + type email
        //fill password ---- find password element + click +clear +type password
        //click login btn ----- find login btn element + click



        //Assert

        //wd.close(); // close one tab
     //   wd.quit(); //close all tabs
    }

    @Test
    public void home(){
        wd = new ChromeDriver();
      //  wd.navigate().to( url: "https://contacts-app.tobbymarshall815.vercel.app/login" );
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        WebElement el1 = wd.findElement(By.tagName("body"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.tagName("h1"));
        WebElement el4 = wd.findElement(By.tagName("a"));
        WebElement el5 = wd.findElement(By.tagName("input"));
        WebElement el6 = wd.findElement(By.tagName("br"));
        WebElement el7 = wd.findElement(By.tagName("button"));

        WebElement el8 = wd.findElement(By.id("root"));

        WebElement el9 = wd.findElement(By.className("container"));
        WebElement el10 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el11 = wd.findElement(By.className("active"));
        WebElement el12 = wd.findElement(By.className("login_login__3EHKB"));

        //byLinkText///HOME, LOGIN, FDBGG,DDODMD,DDKDPA...

        WebElement el13 = wd.findElement(By.linkText("HOME"));
        WebElement el14 = wd.findElement(By.linkText("ABOUT"));
        WebElement el15 = wd.findElement(By.linkText("LOGIN"));
        WebElement el16 = wd.findElement(By.partialLinkText("HO"));


    }

    @Test
    public void cssLocatorsTest(){
        wd = new ChromeDriver();
        //wd.navigate().to( url: "https://contacts-app.tobbymarshall815.vercel.app/login" );
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector(""));

        //by tag name

        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));

        //by class
        wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //by id
        wd.findElement(By.cssSelector("#root"));

        //attribut
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.cssSelector("[placeholder='Password']"));
        wd.findElement(By.cssSelector("[placeholder*='ss']"));
        wd.findElement(By.cssSelector("[placeholder^='Pa']"));
        wd.findElement(By.cssSelector("[placeholder$='rd']"));



    }
}
