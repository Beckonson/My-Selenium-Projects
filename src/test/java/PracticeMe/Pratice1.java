package PracticeMe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class Pratice1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

                driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //WebElement alartclick= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        //alartclick.click();
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        Alert alert =driver.switchTo().alert();

        //alert.accept();


        //System.out.println(driver.getTitles());


    }
}
