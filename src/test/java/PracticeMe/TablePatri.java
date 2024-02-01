package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class TablePatri {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//click on PIm option
        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
        WebElement calen = driver.findElement(By.xpath("//input[@id='calFromDate']"));
        calen.click();
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year.click();
        Select selyear = new Select(year);
        selyear.selectByValue("1980");
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        month.click();
        Select selmonth = new Select(month);
        selmonth.selectByValue("3");
        List<WebElement> months = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        for (WebElement ch : months){
            if (ch.getText().equals("3")){
                ch.click();
            }
        }
        WebElement calen2 = driver.findElement(By.xpath("//input[@id='calToDate']"));
        calen2.click();

        WebElement year2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year2.click();
        Select selyear2 = new Select(year2);
        selyear2.selectByValue("1990");

        WebElement month2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        month2.click();
        Select selmonth2 = new Select(month2);
        selmonth2.selectByValue("11");
        boolean foundMonth2 = false;
        List<WebElement> months2 = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        Iterator<WebElement> iterator2 = months2.iterator();
        while (iterator2.hasNext()) {
            WebElement ch2 = iterator2.next();
            if (ch2.getText().equals("25")) {
                ch2.click();
                foundMonth2 = true;
                break;
            }
        }

        if (!foundMonth2) {
            System.out.println("Month '6' not found.");
        }


    }
}
