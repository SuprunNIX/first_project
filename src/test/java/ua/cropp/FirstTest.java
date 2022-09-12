package ua.cropp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSetting {


    @Test
    public void firstTest() {


        driver.get("https://www.cropp.com/ua/uk/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Жіноча та чоловіча колекція Cropp - відкрийте для себе останні тренди"));


    }

}
