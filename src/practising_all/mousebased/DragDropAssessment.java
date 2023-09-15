package practising_all.mousebased;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragDropAssessment {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://selenium-apps.doselect.in/flag_match/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement sourceRed = driver.findElement(By.id("red"));
        WebElement destRed = driver.findElement(By.xpath("//target[text()='target with top class']"));
        WebElement sourceWhite = driver.findElement(By.id("white"));
        WebElement destWhite = driver.findElement(By.xpath("//target[text()='target w/ middle class']"));
        WebElement sourceBlue = driver.findElement(By.id("blue"));
        WebElement destBlue = driver.findElement(By.xpath("//target[text()='target w/bottom class']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceRed,destRed).perform();
        actions.dragAndDrop(sourceWhite,destWhite).perform();
        actions.dragAndDrop(sourceBlue,destBlue).perform();
    }
}