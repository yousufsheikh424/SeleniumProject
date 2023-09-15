package practising_all.keyboardbased;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ShiftKeyEx {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//input[@name='userid']"));
        Actions action = new Actions(driver);
        action.moveToElement(username)
                        .click(username)
                                .keyDown(Keys.SHIFT)
                                        .sendKeys("z")
                                                .keyUp(Keys.SHIFT)
                                                        .sendKeys("ainab")
                                                                .build()
                                                                        .perform();

        WebElement password = driver.findElement((By.xpath("//input[@name = 'pswrd']")));
        action.moveToElement(password)
                        .click(password)
                                .keyDown(Keys.SHIFT)
                                        .sendKeys("m")
                                                .keyUp(Keys.SHIFT)
                                                        .sendKeys("ohammed")
                                                                .build()
                                                                        .perform();
        driver.findElement(By.xpath("//input[@value = 'Login']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        Thread.sleep(1000);
        driver.close();
    }
}
