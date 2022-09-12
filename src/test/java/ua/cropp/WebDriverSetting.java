package ua.cropp;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {


    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.opera.driver", "C:/Users/User/Desktop/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
