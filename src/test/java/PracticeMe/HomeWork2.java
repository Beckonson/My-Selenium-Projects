package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();
        WebElement option1=driver.findElement(By.xpath("//div[@class='checkbox']"));
        option1.click();
        if(option1.isSelected()){
            System.out.println("option1 is selected");
        }else {
            System.out.println("option1 is not selected");
        }

    }
}
