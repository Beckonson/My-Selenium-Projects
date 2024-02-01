package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalenders {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

//        click on the box for calender to appear
        WebElement calender = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        calender.click();

//        select from calander
        boolean notFound=true;
        while(notFound){
//            get the current month
            String currentMonth = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
            if(currentMonth.equals("August 2024")){
                notFound=false;
                //select the date
            }
            if(notFound){
//            click on next button
                WebElement next = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
                next.click();
            }


        }

    }
}
