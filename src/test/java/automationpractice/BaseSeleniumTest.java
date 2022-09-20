package automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BaseSeleniumTest {

    protected WebDriver driver;


    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        BaseSeleniumPage.setDriver(driver);

        driver.get("https://www.cropp.com/ua/uk/");
        PageFactory.initElements(driver, this);
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
