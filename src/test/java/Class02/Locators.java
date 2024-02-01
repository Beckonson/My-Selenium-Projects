package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
//       maximnize
        driver.manage().window().maximize();
//        goto google.com
        driver.get("https://www.facebook.com");
        //find the element email and send email
        WebElement email= driver.findElement(By.id("email"));
        //sending the data to the WebElement
        email.sendKeys("dgsdgsdgkk");

        //find the element password and send password
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("hello18");

        //find the element button login
        WebElement login= driver.findElement(By.name("login"));
        //login.click();
        WebElement createNewAccount=driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();


    }
}
