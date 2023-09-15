package practising_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramePractise {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement frame1 = driver.findElement(By.id("iframe1"));
        WebElement frame2 = driver.findElement(By.id("iframe2"));
        driver.switchTo().frame(frame2);
        WebElement element = driver.findElement(By.xpath("//h1[text()='Error: Server Error']"));
        System.out.println(element.getText());
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//a[text()='Page One']")).click();


        Thread.sleep(2000);
        driver.close();
    }
}
