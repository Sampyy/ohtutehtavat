package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        
        Random r = new Random();
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://localhost:4567");
        
        sleep(1);
        /* onnistunut kirjautuminen
        System.out.println(driver.getPageSource());
        
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println(driver.getPageSource());

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        System.out.println(driver.getPageSource());
        
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("login"));
        
        System.out.println(driver.getPageSource());
        
        sleep(1);
        
        element.submit();
        System.out.println(driver.getPageSource());
        sleep(2);*/
        
        /* väärä salasana, oikea tunnus
        System.out.println(driver.getPageSource());
        
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        
        System.out.println(driver.getPageSource());

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        System.out.println(driver.getPageSource());
        
        element = driver.findElement(By.name("password"));
        element.sendKeys("jabadbabautra");
        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("login"));
        
        System.out.println(driver.getPageSource());
        
        sleep(1);
        
        element.submit();
        System.out.println(driver.getPageSource());
        sleep(2);
        */ 
        
        /* uuden käyttäjän luominen
        System.out.println(driver.getPageSource());
        
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        System.out.println(driver.getPageSource());

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("matti");
        System.out.println(driver.getPageSource());
        
        element = driver.findElement(By.name("password"));
        element.sendKeys("aweraewr23");
        
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("aweraewr23");
        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("signup"));
        
        System.out.println(driver.getPageSource());
        
        sleep(1);
        
        element.submit();
        System.out.println(driver.getPageSource());
        sleep(2);
        */
        
        System.out.println(driver.getPageSource());
        
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        System.out.println(driver.getPageSource());

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys("arto"+r.nextInt(100000));
        System.out.println(driver.getPageSource());
        
        element = driver.findElement(By.name("password"));
        element.sendKeys("aweraewr23");
        
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("aweraewr23");
        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("signup"));
        
        System.out.println(driver.getPageSource());
        
        sleep(1);
        
        element.submit();
        System.out.println(driver.getPageSource());
        sleep(2);
        
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        System.out.println(driver.getPageSource());
        
        sleep(1);
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
        System.out.println(driver.getPageSource());
        
        sleep(2);
        
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
