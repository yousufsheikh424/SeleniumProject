package practising_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class UploadingFile {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement fileUploading = driver.findElement(By.id("file-upload"));
        fileUploading.sendKeys("D:\\Software Testing\\Selenium WebDriver\\screenshots\\absolute sxpath.png");
        driver.findElement(By.id("file-submit")).click();
        WebElement fileUploaded = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if(fileUploaded.isDisplayed()){
            System.out.println("File is successfully uploaded");
        }else {
            System.out.println("File is not uploaded");
        }


        Thread.sleep(2000);
        driver.close();
    }
}
