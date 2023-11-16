import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TescoExample {
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tesco.com/?preservedReferrer=https://www.google.com/");
        driver.findElement(By.linkText("Tesco Mobile")).click();
        driver.findElement(By.linkText("Pay monthly phones")).click();
    }
}
