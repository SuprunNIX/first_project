package automationpractice.SeleniumWebDriver;

import automationpractice.BaseSeleniumTest;
import org.junit.Test;

public class Tests extends BaseSeleniumTest {

    @Test
    public void seleniumWebDriver() {
        Steps steps = new Steps();
        steps.acceptCookie();
        steps.checkSearchParameter("худи");
        steps.useSortByFilter();
        steps.checkSorting();
        steps.addItemToCard();
        steps.checkItemOnCard();
    }
}
