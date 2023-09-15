package practising_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assessment {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-apps.doselect.in/mibe/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[text()='One']")).click();
        driver.findElement(By.className("adding")).click();
        driver.findElement(By.xpath("//li[text()='Two']")).click();
        driver.findElement(By.className("removing")).click();


    }
}
