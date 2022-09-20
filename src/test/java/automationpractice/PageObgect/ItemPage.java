package automationpractice.PageObgect;

import automationpractice.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ItemPage extends BaseSeleniumPage {
    //static XpathItemPage xpath = new XpathItemPage();

    @FindBy(xpath = "//*[@id='productContainer']/section/div[1]/section[3]/ul/li/button")
    public static WebElement setGreyColor;

    @FindBy(xpath = "//*[@id='productContainer']/section/div[1]/section[4]/div/ul/li[3]")
    public WebElement setSize;

    @FindBy(xpath = "//*[@id='productContainer']/section/div[1]/section[5]/button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement board;

    @FindBy(xpath = "//button[@class='continue-shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "//*[@id='headerWrapper']/div[2]/div[3]/div[1]/div/div/input")
    public WebElement searchField;

    @FindBy(xpath = "//*[@id='algoliaContainer']/div[2]/div[1]/div[2]/div/div/input")
    public WebElement inputField;

    @FindBy(xpath = "//*[@id='productContainer']/section/div[1]/section[3]/ul/li[2]/button")
    public WebElement setColor;

    @FindBy(xpath = "//div[@id='algoliaContainer']/div[2]/div/div[5]/ul/li[1]/div/div[1]")
    public WebElement setSizeItem;

    @FindBy(xpath = "//*[@id='ModalRoot-soctxjo8jn9']/div/div[2]/div/div[2]/div[2]/a")
    public WebElement openCartButton;

    public ItemPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     *  На деталях товара ставим Size = L, Color = grey
     */

    public void setColorAndSize() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        setGreyColor.click();
        setSize.click();
    }

    /**
     * Кликаем по "Add to cart" кнопке
     */

    public void addItemToCart() {
        addToCartButton.click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    /**
     * Убеждаемся что появилась модалка c названием "Product successfully added to your shopping cart"
     */

    public void checkThatBoardIsDisplayed() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        if (!board.isDisplayed()) {
            Assert.fail("Board is not returned.");
        }

    }

    /**
     * В открывшейся модалке кликаем по "Continue shopping"
     */

    public void continueShopping() {
        continueShopping.click();
    }

    /**
     * В поле поиска вводим "Кеди" и нажимаем значок поиска
     */

    public void searchOtherItem(String search) {
        searchField.click();
        inputField.sendKeys(search);
        inputField.sendKeys(Keys.ENTER);
    }

    /**
     * На деталях товара ставим Size = 40, Color = фіолетовий
     */

    public void setSizeAndColor() {
        setColor.click();
        setSizeItem.click();

    }

    /**
     * Кликаем по "Proceed to checkout" кнопке
     */

    public void openCart() {
        openCartButton.click();
    }

}
