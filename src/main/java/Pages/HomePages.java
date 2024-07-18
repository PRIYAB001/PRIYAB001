package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePages extends BaseClass {

    public HomePages(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "nav-logo-sprites")
    WebElement amazonTxt;

    @FindBy(id = "nav-link-amazonprime")
    WebElement primeLbl;

    @FindBy(xpath = "//h1[contains(text(),' Welcome to Prime')]")
    WebElement primeTxt;

    @FindBy(xpath="//a[contains(text(),'Login to join Prime')]")
    WebElement loginToJoinPrimeBtn;

    @FindBy(xpath="//h1[contains(text(),'create account')]")
    WebElement createAccountBtn;

    @FindBy(id="ap_email_login")
    WebElement phoneNumberTxtBox;

    @FindBy(id="ap_password")
    WebElement passwordTxtBox;

    @FindBy(css = ".a-button-input")
    WebElement continueBtn;

    @FindBy(id="nav-hamburger-menu")
    WebElement openMenuLbl;

    @FindBy(xpath="(//a[contains(text(),'Best Sellers')])[2]")
    WebElement BestSellersTag;

    @FindBy(id="zg_banner_text")
    WebElement bestsellertxt;

    @FindBy(xpath = "//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']")
    List<WebElement> productNames;
    public boolean verifyHomePage() {
        amazonTxt.isDisplayed();
        return true;
    }

    public void clickOnPrimeLabel() {
        primeLbl.click();
    }

    public boolean verifyPrimePage() {
        primeTxt.isDisplayed();
        return true;
    }

    public void clickOnLoginPrimeBtn() {
        loginToJoinPrimeBtn.click();
    }

    public boolean verifySignInPAge() {
        explicitWait(createAccountBtn);
        createAccountBtn.isDisplayed();
        return true;
    }

    public void enterPhoneNumber() {
        phoneNumberTxtBox.sendKeys("9025982182");
    }

    public void enterPasswordInPasswordTxtBox() {
        passwordTxtBox.sendKeys("Priya*123");
    }

    public void clickOnContinueButton() {
        continueBtn.click();
    }

    public void clickOnBackButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.history.go(-3)");

    }

    public void clickOnOpenMenuLabel() throws InterruptedException {
        openMenuLbl.click();
        Thread.sleep(4000);
    }

    public void clickOnBestSellerTagInMenuBar() {
        BestSellersTag.click();
    }

    public boolean verifyBestSellerPage() {
        bestsellertxt.isDisplayed();
        return true;
    }

    public void clickOnAProductInBestSellerPage() {
           productNames.get(1).click();
    }

    public void verifyProductDetailPage() {
    }
}
