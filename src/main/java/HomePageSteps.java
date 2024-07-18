import Pages.BasePage;
import Pages.HomePages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class HomePageSteps  {

    HomePages HP=new HomePages(BasePage.getDriver());
    @Given("user is on home page")
    public void userIsOnHomePage() {
        Assert.assertTrue(HP.verifyHomePage(),"User is not on the home page");

    }

    @When("User click on Prime label in home page")
    public void userClickOnPrimeLabelInHomePage() {
        HP.clickOnPrimeLabel();
    }

    @Then("Verify user is on Prime Page")
    public void verifyUserIsOnPrimePage() {
        Assert.assertTrue(HP.verifyPrimePage(), "User is not redirected to prime page");

    }

    @And("User click on login to join prime button")
    public void userClickOnLoginToJoinPrimeButton() {
        HP.clickOnLoginPrimeBtn();
    }

    @And("Verify user is redirected to create account page")
    public void verifyUserIsRedirectedToCreateAccountPage() {
        Assert.assertTrue(HP.verifySignInPAge(),"user is not redirected to sign in page");
    }

    @And("user enters the phone number in create accout page")
    public void userEntersThePhoneNumberInCreateAccoutPage() {
        HP.enterPhoneNumber();
    }

    @And("users enters the password in password text box")
    public void usersEntersThePasswordInPasswordTextBox() {
        HP.enterPasswordInPasswordTxtBox();
    }

    @And("user click on continue button in create account page")
    public void userClickOnContinueButtonInCreateAccountPage() {
        HP.clickOnContinueButton();
    }
    @And("user clicks on back button {string}")
    public void userClicksOnBackButton(String count) {
        HP.clickOnBackButton();
    }

    @And("user click on open menu label in home page")
    public void userClickOnOpenMenuLabelInHomePage() throws InterruptedException {
        HP.clickOnOpenMenuLabel();
    }

    @And("user click on best sellers tag in the menu bar")
    public void userClickOnBestSellersTagInTheMenuBar() {
        HP.clickOnBestSellerTagInMenuBar();
    }

    @Then("verify user is on best seller page")
    public void verifyUserIsOnBestSellerPage() {
         Assert.assertTrue(HP.verifyBestSellerPage(),"user is not redirected to best seller page");
    }

    @And("user click on a product in best seller page")
    public void userClickOnAProductInBestSellerPage() {
        HP.clickOnAProductInBestSellerPage();
    }

    @Then("verify user is redirected to Product detail page")
    public void verifyUserIsRedirectedToProductDetailPage() {
        HP.verifyProductDetailPage();
    }
}
