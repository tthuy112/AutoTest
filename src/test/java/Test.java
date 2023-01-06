import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

 public class Test {
        String projectPath = System.getProperty("user.dir");
        @org.junit.Test
        public void site_header_is_on_home_page() throws InterruptedException {
            WebDriver driver;
            //Firefox's geckodriver *requires* you to specify its location.

            System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://testingbot.com");
            WebElement chat = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/a"));
            assertTrue((chat.isDisplayed()));
            driver.close();
        }
    }

