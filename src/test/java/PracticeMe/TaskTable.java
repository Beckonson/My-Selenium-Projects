package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TaskTable {
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

        //click the calender
        driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
        WebElement selectyr = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        selectyr.click();
        Select sel = new Select(selectyr);
        sel.selectByValue("1975");
        //select month
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select mon = new Select(month);
        mon.selectByIndex(4);

        //finding the date in the month
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td")).click();

        }
        }


