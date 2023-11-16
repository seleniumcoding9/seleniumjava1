import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeExample {
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.linkText("Subscriptions")).click();
        driver.findElement(By.linkText("Home")).click();
    }
}