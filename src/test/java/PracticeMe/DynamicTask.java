package PracticeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTask {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

//        get the column with the ids
        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

//        iterate to find the row number
        /*for( int i=0 ;i<ids.size();i++) {

            String id = ids.get(i).getText();

            if (id.equals("95843A")) {
//                print the row number
                System.out.println(i + 1);
                WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkbox.click();
                */
        int count=1;
        for (WebElement id :ids) {
            String idValue = id.getText();
            if (idValue.equals("95843A")) {
                id.click();
                //print the row number
                System.out.println(count+1);
                WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (count+ 1) + "]/td[1]"));
                checkbox.click();
            }

            }
        }

}
