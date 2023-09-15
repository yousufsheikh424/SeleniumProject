package practising_all.keyboardbased;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CtrlKey {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement clicking = driver.findElement(By.id("link1"));
        Actions action = new Actions(driver);
        action.moveToElement(clicking)
                        .keyDown(Keys.CONTROL)
                                .click()
                                        .keyUp(Keys.CONTROL)
                                                .build()
                                                        .perform();


        Thread.sleep(1000);
        driver.close();
    }
}
