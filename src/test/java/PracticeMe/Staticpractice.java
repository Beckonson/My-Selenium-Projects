package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Staticpractice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

        // geting all the row,

        List<WebElement> rowobj = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for(WebElement row:rowobj){
            System.out.println(row.getText());

            //finding column progress
            List<WebElement> columobj =driver.findElements(By.xpath("//table[@class='table table-hover']/tbody//tr/td[4]"));
            int count=1;

            for(WebElement colum:columobj){
                if(colum.getText().equals("in progress")){
                    System.out.println(count);
                    // actual row
                    WebElement roe = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                    System.out.println(roe.getText());
                }
                count=count+1;
            }

        }
    }
}
