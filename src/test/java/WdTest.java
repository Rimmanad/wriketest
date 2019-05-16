import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class WdTest {
    @Test
    public void testLogin() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wrike.com/");
        Thread.sleep(2000);

        PageObject page = PageFactory.initElements(driver, PageObject.class);

        if (page.getModalPopup().isDisplayed())
        {
            page.getAcceptButtonPopup().click();
        }

        page.getTrialButton().click();

        WebElement currentElement = driver.switchTo().activeElement();
        currentElement.sendKeys(TestUtils.randomString(6) + "+wpt@wriketask.qaa");
        Thread.sleep(2000);

        page.getAccountButton().click();
        Thread.sleep(10000);
        Assert.assertEquals("https://www.wrike.com/resend/", driver.getCurrentUrl());

        // Form

        page.getRadioButton().click();
        Thread.sleep(2000);

        page.getNextRadioButton().click();
        Thread.sleep(2000);

        page.getLastRadioButton().click();
        Thread.sleep(2000);

        page.getSubmitResultsButton().click();
        Thread.sleep(8000);

        boolean isFormVisible = page.getForm().isDisplayed();
        Assert.assertFalse(isFormVisible);

        page.getResendEmailButton().click();
        Thread.sleep(8000);
        boolean isButtonVisible = page.getResendEmailButton().isDisplayed();
        Assert.assertFalse(isButtonVisible);

        // Twitter

        Assert.assertEquals("https://twitter.com/wrike", page.getTwitterButton().getAttribute("href"));

        Assert.assertEquals("/content/themes/wrike/dist/img/sprite/vector/footer-icons.symbol.svg?v2#twitter", page.getTwitterIcon().getAttribute("xlink:href"));

        driver.quit();
    }
}
