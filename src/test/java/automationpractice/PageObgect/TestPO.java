package automationpractice.PageObgect;

import automationpractice.BaseSeleniumTest;
import org.junit.Test;

public class TestPO extends BaseSeleniumTest {

    @Test
    public void pageObject() {
        MainPage stepsMP = new MainPage();
        ItemPage stepsIP = new ItemPage();
        CartPage stepsCP = new CartPage();

        stepsMP.acceptCookie();
        stepsMP.searchItem("Худі");
        stepsMP.openPageOfFirstItem();
        stepsIP.setColorAndSize();
        stepsIP.addItemToCart();
        stepsIP.checkThatBoardIsDisplayed();
        stepsIP.continueShopping();
        stepsIP.searchOtherItem("Кеди");
        stepsMP.openItemPage();
        stepsIP.setSizeAndColor();
        stepsIP.addItemToCart();
        stepsIP.checkThatBoardIsDisplayed();
        stepsIP.openCart();
        stepsCP.checkColorAndSize();
        stepsCP.checkTotalPrice();
        stepsCP.removeItemFromCart();
        stepsCP.checkThatSecondElementIsNotDisplayed();
    }
}
