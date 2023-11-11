import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CheckChromeDriverIsPluged {
    @Test
    public void getSite() {
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com");
       /* try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        List<WebElement> list = driver.findElements(By.xpath("//h5"));
        for(WebElement element : list) {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
