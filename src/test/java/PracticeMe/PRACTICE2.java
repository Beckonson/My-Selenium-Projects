package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class PRACTICE2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//waiting for 10 sec
        driver.findElement(By.xpath("//button[@id='show_text_synchronize']")).click();
        //text
        WebElement Text2=driver.findElement(By.xpath("//div[@class='card-body']/p"));
        //Text2.getText();
        System.out.println(Text2.getText());




    }
}
