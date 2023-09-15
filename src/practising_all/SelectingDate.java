package practising_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class SelectingDate {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("src")).sendKeys("Adoni");
        List<WebElement> sourceCities = driver.findElements(By.xpath("//ul[@class = 'sc-dnqmqq eFEVtU']//child::div/text"));
        for(WebElement e:sourceCities){
            if(e.getText().equalsIgnoreCase("Adoni bypass"));{
                e.click();
                break;
            }
        }
        driver.findElement(By.id("dest")).sendKeys("hyderabad");
        List<WebElement> destCities = driver.findElements(By.xpath("//li[@class = 'sc-iwsKbI jTMXri']//child::div/text"));
        for(WebElement e1: destCities){
            if(e1.getText().equalsIgnoreCase("Lakdikapul")){
                e1.click();
                break;
            }
        }
        String date = "26", month = "Aug", year = "2023";

        driver.findElement(By.xpath("//span[text()='Date']")).click();
        //List<WebElement> allDates = driver.findElements(By.)


        Thread.sleep(3000);
        driver.close();
    }
}
