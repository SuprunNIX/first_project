package automationpractice.PageObgect;

import automationpractice.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainPage extends BaseSeleniumPage {
    //static XpathMainPage xpath = new XpathMainPage();

    @FindBy(xpath = "//div[@id='cookiebanner']")
    public WebElement cookieBanner;

    @FindBy(xpath = "//div[@id='cookiebanner']//button[@id='cookiebotDialogOkButton']")
    public WebElement cookieButton;

    @FindBy(xpath = "//*[@id='headerWrapper']/div[2]/div[3]/div[1]/div")
    public WebElement searchField;

    @FindBy(xpath = "//*[@id='algoliaContainer']/div[2]/div[1]/div[2]/div/div/input")
    public WebElement inputFieldForSearch;

    @FindBy(xpath = "//*[@id='algoliaContainer']/div[2]/div/div[5]/ul/li[1]/div/div[2]/a")
    public WebElement itemFirst;

    @FindBy(xpath = "//*[@id='algoliaContainer']/div[2]/div/div[5]/ul/li[1]/div/div[1]/a")
    public WebElement itemSecond;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public void acceptCookie() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        if (cookieBanner.isDisplayed()) {
            cookieButton.click();
        }
    }

    /**
     * В поле поиска вводим ключевое слово: 'Худі' и нажимаем значок поиска
     */

    public void searchItem(String search) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        searchField.click();
        inputFieldForSearch.sendKeys(search);
        inputFieldForSearch.sendKeys(Keys.ENTER);
    }

    /**
     * Кликаем по первому найденному товару
     */

    public void openPageOfFirstItem() {
        itemFirst.click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    public void openItemPage() {
        itemSecond.click();
    }
}
