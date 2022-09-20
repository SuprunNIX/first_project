package automationpractice.PageObgect;

import automationpractice.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseSeleniumPage {
    //static XpathCartPage xpath = new XpathCartPage();

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[1]/div[1]/h3[1]/text()[3]")
    public WebElement colorOfFirstItem;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[1]/div[1]/h3[2]")
    public WebElement sizeOfFirstItem;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[1]/div[3]/div")
    public WebElement countOfFirstItem;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[2]/div[1]/h3[1]")
    public WebElement colorOfSecondItem;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[2]/div[1]/h3[1]")
    public WebElement sizeOfSecondItem;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[2]/div[3]/div")
    public WebElement countOfSecondItem;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[1]/div[2]/p[1]")
    public WebElement priceOfFirstItem;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[2]/div[2]/div[1]/p[2]")
    public WebElement priceOfSecondItem;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[2]/div[1]/dl/div[3]/dd/p[1]")
    public WebElement totalPrice;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[2]/button")
    public WebElement removeFromCart;

    @FindBy(xpath = "//*[@id='cartRoot']/div/div[1]/div/div[2]")
    public WebElement secondElement;

    public CartPage() {
        PageFactory.initElements(driver, this);
    }
    /**
     * На открывшейся странице, убеждаемся что для каждого из 2-ух добавленных продуктов показываются верные: Имя, цвет, размер, цена за один товар(Unit price), количество товаров, общая цена с учетом количества товаров(Total)
     */
     public void checkColorAndSize() {
         //first item
         String colorFirst = colorOfFirstItem.getText();
         Assert.assertTrue("Incorrect item color is displayed.", colorFirst.contains("light grey"));
         String sizeFirst = sizeOfFirstItem.getText();
         Assert.assertTrue("Incorrect item size is displayed.", sizeFirst.contains("L"));
         String countFirst = countOfFirstItem.getText();
         Assert.assertTrue("Incorrect item count is displayed.", countFirst.contains("1"));

         //second item
         String colorSecond = colorOfSecondItem.getText();
         Assert.assertTrue("Incorrect item color is displayed.", colorSecond.contains("фіолетовий"));
         String sizeSecond = sizeOfSecondItem.getText();
         Assert.assertTrue("Incorrect item size is displayed.", sizeSecond.contains("41"));
         String countSecond = countOfSecondItem.getText();
         Assert.assertTrue("Incorrect item count is displayed.", countSecond.contains("1"));
     }

     public void checkTotalPrice() {
         String priceOfFirstEl = priceOfFirstItem.getText();
         String priceOfSecondEl = priceOfSecondItem.getText();
         int first = Integer.parseInt(priceOfFirstEl.substring(0, priceOfFirstEl.length()-4));
         int second = Integer.parseInt(priceOfSecondEl.substring(0, priceOfSecondEl.length()-4));

         String total = totalPrice.getText();

         int count = first+second;

         Assert.assertTrue("Incorrect total price is displayed.", total.equals(count + " UAH"));
     }

    /**
     * Кликаем по знаку корзины напротив "Кеди"
     */

    public void removeItemFromCart() {
        removeFromCart.click();
    }

    public void checkThatSecondElementIsNotDisplayed() {
        if(secondElement.isDisplayed()) {
            Assert.fail("The second item wasn't removed");
        }
    }

}
