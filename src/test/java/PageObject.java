import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {

    @FindBy(xpath = "/html/body/div[7]/div")
    private WebElement modalPopup;

    public WebElement getModalPopup()
    {
        return modalPopup;
    }

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div/button[2]")
    private WebElement acceptButtonPopup;

    public WebElement getAcceptButtonPopup()
    {
        return acceptButtonPopup;
    }

    @FindBy(xpath = "/html/body/div[1]/header/div[3]/div[2]/div/div/div[2]/div/form/button")
    private WebElement trialButton;

    public WebElement getTrialButton()
    {
        return trialButton;
    }

    @FindBy(xpath = "//*[@id=\"modal-pro\"]/form/label[2]/button")
    private WebElement createAccountButton;

    public WebElement getAccountButton()
    {
        return createAccountButton;
    }

    // Form

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[1]/label[1]/button")
    private WebElement radioButton;

    public WebElement getRadioButton()
    {
        return radioButton;
    }

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[2]/label[1]/button")
    private WebElement nextRadioButton;

    public WebElement getNextRadioButton()
    {
        return nextRadioButton;
    }

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/div[3]/label[1]/button")
    private WebElement lastRadioButton;

    public WebElement getLastRadioButton()
    {
        return lastRadioButton;
    }

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div/form/button")
    private WebElement submitResultsButton;

    public WebElement getSubmitResultsButton()
    {
        return submitResultsButton;
    }

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[2]/div")
    private WebElement form;

    public WebElement getForm()
    {
        return form;
    }

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div[2]/div/div[1]/p[3]/button")
    private WebElement resendEmailButton;

    public WebElement getResendEmailButton()
    {
        return resendEmailButton;
    }

    // Twitter

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[1]/div/ul/li[1]/a")
    private WebElement twitterButton;

    public WebElement getTwitterButton()
    {
        return twitterButton;
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[1]/div/ul/li[1]/a//*[name()='use']")
    private WebElement twitterIcon;

    public WebElement getTwitterIcon()
    {
        return twitterIcon;
    }
}
