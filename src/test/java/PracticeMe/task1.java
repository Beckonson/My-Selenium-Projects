package PracticeMe;
/*
Fill in the text box in the advance xpath tab of syntaxprojects.com
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public interface task1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");

        //finding the element and sending key to text box
        WebElement favourite=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        favourite.sendKeys("Englishtextbook");
        //finding the first or following sibling text box and sending key
        WebElement tbox1=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        tbox1.sendKeys("Mathtextbook");
        //finding the second or following sibling text box and sending keyn  book1.sendKeys("Mathtextbook");
        //finding second preceding text box and sending key
        WebElement book2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        book2.sendKeys("Englishtextbook");

        //finding the text box parent child relationship
        //WebElement parent=driver.findElement(By.xpath("//div[@id='familyTree']"));

        //finding the first box and sending key
        WebElement firstbox=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        firstbox.sendKeys("taylorMathins");
        //finding the second box and sending key
        WebElement Secondbox=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        Secondbox.sendKeys("taylorMathinsJoy");
        //finding the third box and sending key
        WebElement Thirdbox=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        Thirdbox.sendKeys("taylorMathinsJoyMary");
        
    }
}
