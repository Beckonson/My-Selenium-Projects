package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        //        to draw a boundary around the WebElement
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

//        using java script executor
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0]. setAttribute('style', 'background: white; border: 3px solid red;');",hoverBtn);

        //scroll down
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
//        scroll up
        js.executeScript("window.scrollBy(0,-1000)");

        //        get the click button
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Right Click!']"));// not working bcos its rightclick
        js.executeScript("arguments[0]. click();",clickBtn);

        //        get the click button
        WebElement fileUpload = driver.findElement(By.xpath("//a[text()='File Upload']"));
        js.executeScript("arguments[0]. click();",fileUpload);

    }
}
