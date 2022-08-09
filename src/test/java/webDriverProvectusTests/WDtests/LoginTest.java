package webDriverProvectusTests.WDtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void LoginTest(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver =  new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submit = driver.findElement(By.className("radius"));

        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        submit.click();

        WebElement actual = driver.findElement(By.xpath("//div[@id=\"flash\"][contains(text(),'You logged into a secure area!')]"));
        Assert.assertEquals(true, actual.isDisplayed());
        driver.quit();
    }
    @Test
    public void FailedLogin(){
        {
            WebDriverManager.chromedriver().setup();

            WebDriver driver =  new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/login");

            driver.manage().window().maximize();
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement submit = driver.findElement(By.className("radius"));

            username.sendKeys("tomsmit");
            password.sendKeys("SuperSecretPassword!");
            submit.click();

            WebElement actual = driver.findElement(By.xpath("//div[@id=\"flash\"][contains(text(),'Your password is invalid!')]"));
            //wait = WebDriverWait(driver, 10);
            Assert.assertEquals(true, actual.isDisplayed());
            driver.quit();
        }
    }
}
