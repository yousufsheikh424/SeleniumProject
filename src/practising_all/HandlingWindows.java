package practising_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class HandlingWindows {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("openwindow")).click();
        String parentWD = driver.getWindowHandle();
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWD);
        driver.findElement(By.id("bmwcheck")).click();
        Thread.sleep(2000);
        Set<String> childWD = driver.getWindowHandles();
        for(String s : childWD){
            if(!parentWD.contentEquals(s)){
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.findElement(By.xpath("//a[text() = 'Privacy Policy']")).click();
                driver.close();
            }
        }
        driver.switchTo().window(parentWD);
        WebElement multiSelection = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(multiSelection);
        select.selectByIndex(1);
        select.selectByIndex(2);

        Thread.sleep(2000);
        //driver.close();
    }
}
