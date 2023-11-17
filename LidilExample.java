import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LidilExample {
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lidl.com/");
        driver.findElement(By.xpath("//span[@class='menu-item-text']")).click();
        driver.findElement(By.xpath("//span[@class='category-filter__text']")).click();
    }
}
