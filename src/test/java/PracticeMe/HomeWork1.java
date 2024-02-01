package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //click on button 2 select male
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']")).click();
        // selecting the radio button male
        WebElement radiobutt=driver.findElement(By.xpath("//input[@value='Male']"));
        radiobutt.click();
        if(radiobutt.isSelected()){
            System.out.println("male button is selected");
        }else {
            System.out.println("male button is not selected");
        }

        //clicking on button 3 and select option1
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();
        WebElement option1=driver.findElement(By.xpath("//div[@class='checkbox']"));
        option1.click();
        //if(option1.isSelected()){
            //System.out.println("option1 is selected");
        //}else {
            //System.out.println("option1 is not selected");
        //}

    }
}

