package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Table2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get(" http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        //clicking on leave
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        //select the calender month
        driver.findElement(By.xpath("//input[@id='calToDate']")).click();
        //selecting the year
        driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
        List<WebElement>year=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]/option"));


/*
        //iterating
        if(year.contains(2012){
            System.out.println(year);
        }
        /*for(WebElement sel:year ){
            sel.getText();
            String selvalue= sel.getText();
            if (selvalue.equals(1975)){
                sel.click();
                System.out.println(sel);
            }
        }*/

    }
}
