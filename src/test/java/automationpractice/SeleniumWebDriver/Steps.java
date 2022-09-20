package automationpractice.SeleniumWebDriver;

import automationpractice.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;



public class Steps extends BaseSeleniumPage {
    static Xpath xpath = new Xpath();

    public Steps() {
        PageFactory.initElements(driver, this);
    }



    public static void acceptCookie() {
        if (xpath.cookieBanner.isDisplayed()) {
            xpath.cookieButton.click();
        }
    }

    public void checkSearchParameter(String search) {
        xpath.searchField.click();
        xpath.inputFieldForSearch.sendKeys(search);
        xpath.inputFieldForSearch.sendKeys(Keys.ENTER);


    }

    public void useSortByFilter() {
        xpath.sortByDropDown.click();
        xpath.highestFirst.click();
    }

    public static void checkSorting() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String firstEl = xpath.firstProductPrice.getText();
        int first = Integer.parseInt(firstEl.substring(0, firstEl.length()-4));
        String secondEl = xpath.secondProductPrice.getText();
        int second = Integer.parseInt(secondEl.substring(0, secondEl.length()-4));

        Assert.assertTrue("Sorting is working incorrect.", first > second);
    }

    public static void addItemToCard() {
        xpath.firstItem.click();
        xpath.selectSize.click();
        xpath.addToCardButton.click();
        xpath.continueShopping.click();
    }



    public static void checkItemOnCard() {
        String name = xpath.nameOfFirstProduct.getText();
        String price = xpath.price.getText();

        xpath.cardButton.click();

        String nameOnCard = xpath.itemNameOnCard.getText();
        String priceOnCard = xpath.itemPriceOnCard.getText();

        System.out.println(name + " = " + nameOnCard);
        System.out.println(price + " = " + priceOnCard);

        if (nameOnCard == name) {
            Assert.fail("Item name is different");
        }
        if (priceOnCard == price) {
            Assert.fail("Item price is different");
        }
    }
}
