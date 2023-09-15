package practising_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class FetchingTableData {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*or you can write this syntax as well
        * List<WebElement> tableDetails = driver.findElements(By.xpath("//table[@id='table1']//following::th[text()='Place']"));*/
//        List<WebElement> tableDetails = driver.findElements(By.xpath("//table[@id='table1']//following::th[text()='Name']//following::th[text()='Age']//following::th[text()='Place']"));
        List<WebElement> tableDetails = driver.findElements(By.xpath("//table[@id='table1']//following::th[text()='Name']//following::td"));
        for(WebElement e : tableDetails){
            System.out.println(e.getText());
        }


        Thread.sleep(3000);
        driver.close();
    }
}
