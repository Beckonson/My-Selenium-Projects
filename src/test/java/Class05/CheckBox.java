package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        //NNOTE Steps: inspect , write  down a locator and perform click operation
        //        click on the checkbox
        WebElement cb1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        cb1.click();
        //select all options from the checkboxes
        List<WebElement> options = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement option:options){
            String optionVal = option.getAttribute("value");
            if(optionVal.equals("Option-3")) {
                option.click();
                break;
            }
        }
    }
}
