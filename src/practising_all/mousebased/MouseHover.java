package practising_all.mousebased;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement mouseMovement = driver.findElement(By.id("mousehover"));
        Actions action = new Actions(driver);
        action.moveToElement(mouseMovement).perform();
        driver.findElement(By.xpath("//a[text()='Top']")).click();



        Thread.sleep(2000);
        driver.close();
    }
}
