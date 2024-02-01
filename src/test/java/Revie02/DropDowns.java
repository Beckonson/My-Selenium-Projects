package Revie02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto fb.com

        driver.get("https://www.fb.com");
        //        initiate the instance of WebDriver
//       maximnize
        driver.manage().window().maximize();
//        goto fb.com
        driver.get("https://www.fb.com");

//        get the create new account
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
//        find the drop dwon
        WebElement DD = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel= new Select(DD);
        sel.selectByVisibleText("12");

        System.out.println(sel.isMultiple());

    }
}
