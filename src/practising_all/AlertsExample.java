package practising_all;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsExample {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Zainab");
        driver.findElement(By.id("confirmbtn")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);

        System.out.println(alert.getText());
        alert.accept();


        Thread.sleep(2000);
        driver.close();

    }
}
