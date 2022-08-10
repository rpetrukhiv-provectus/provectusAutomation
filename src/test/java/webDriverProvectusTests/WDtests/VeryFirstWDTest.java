package webDriverProvectusTests.WDtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class VeryFirstWDTest {
    @Test
    public void VeryFirstWDTest() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =  new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(@class, 'button')]")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'button alert')]")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'button success')]")).click();

        driver.findElements(By.xpath(""));
        driver.quit();
    }
}
