package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Patrick {
    public static void main(String[] args) {
        //        initiate the instance of WebDriver
        WebDriver driver = new ChromeDriver();
//       maximnize
        driver.manage().window().maximize();
//        goto fb.com
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        //Select from from drop down
        List<WebElement>Selectdrpd=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for (WebElement option : Selectdrpd) {
            String optionsValue = option.getText();
            if (optionsValue.equals("japan")) {
                option.click();
            }
            /*

        Select sel = new Select();
        sel.selectByVisibleText("japan");

        System.out.println(sel.isMultiple());
        }*/
    }
}
}
