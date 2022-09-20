package automationpractice.SeleniumWebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Xpath extends Steps {

    @FindBy(xpath = "//div[@id='cookiebanner']")
    public WebElement cookieBanner;

    @FindBy(xpath = "//div[@id='cookiebanner']//button[@id='cookiebotDialogOkButton']")
    public WebElement cookieButton;

    @FindBy(xpath = "//*[@id='headerWrapper']/div[2]/div[3]/div[1]/div")
    public WebElement searchField;

    @FindBy(xpath = "//*[@id='algoliaContainer']/div[2]/div[1]/div[2]/div/div/input")
    public WebElement inputFieldForSearch;

    @FindBy(xpath = "//*[@id='center_column']/h1/span[1]")
    public WebElement searchWorld;

    @FindBy(xpath = "//div[@id='algoliaContainer']/div[2]/div[1]/div[4]/div/div[2]/div/div[1]")
    public WebElement searchElement;

    @FindBy(xpath = "//div[@id='algoliaContainer']/div[2]/div/div[3]/div[2]/div/div")
    public WebElement sortByDropDown;

    @FindBy(xpath = "//*[@id='algoliaContainer']/div[2]/div/div[3]/div[2]/div/ul/li[3]")
    public WebElement highestFirst;

    @FindBy(xpath = "//div[@id='algoliaContainer']/div[2]/div/div[5]/ul/li[1]/div/div[2]/div/div")
    public WebElement firstProductPrice;

    @FindBy(xpath = "//div[@id='algoliaContainer']/div[2]/div/div[5]/ul/li[2]/div/div[2]/div/div")
    public WebElement secondProductPrice;

    @FindBy(xpath = "//*[@id='productContainer']/section/div[1]/div/h1")
    public WebElement nameOfFirstProduct;

    @FindBy(xpath = "//div[@id='algoliaContainer']/div[2]/div/div[5]/ul/li[1]/div")
    public WebElement firstItem;

    @FindBy(xpath = "//*[@id='productContainer']/section/div[1]/section[4]/div/ul/li[3]")
    public WebElement selectSize;

    @FindBy(xpath = "//*[@id='productContainer']/section/div[1]/section[5]/button")
    public WebElement addToCardButton;

    @FindBy(xpath = "//button[@class='continue-shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "//*[@id='headerWrapper']/div[2]/div[3]/button[3]")
    public WebElement cardButton;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div/h2/a")
    public WebElement itemNameOnCard;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div/div[2]/p[1]")
    public WebElement itemPriceOnCard;

    @FindBy(xpath = "//*[@id='productContainer']/section/div[1]/section[2]/div/div/div/div")
    public WebElement price;

}
