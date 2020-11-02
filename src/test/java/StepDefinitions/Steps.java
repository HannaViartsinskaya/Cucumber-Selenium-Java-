package StepDefinitions;

import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.PendingException;

public class Steps {
    public WebDriver driver;
    public LoginPage loginPage;

    @Given("^User Launch Chrome browser$")
    public void user_Launch_Chrome_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver=new ChromeDriver();
        loginPage = new LoginPage(driver);
    }


    @When("^User opens URL \"([^\"]*)\"$")
    public void user_opens_URL(String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.get(url);
    }

    @When("^User enters email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enters_email_as_and_Password_as(String email, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.setUserName(email);
        loginPage.setPassword(password);
    }

    @When("^Click on Login$")
    public void click_on_Login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       loginPage.clickOnLogin();
    }

    @Then("^Page Title should be \"([^\"]*)\"$")
    public void page_Title_should_be(String title) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if(driver.getPageSource().contains("Login was unsuccessful.")){
            driver.close();
            Assert.assertTrue(false);
        }else {
            Assert.assertEquals(title,driver.getTitle());
        }

    }
    @Then("^\"([^\"]*)\" tab should be present$")
    public void tab_should_be_present(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       Assert.assertEquals(arg1,loginPage.tabCatalogGettext());
    }

    @When("^User click on log out link$")
    public void user_click_on_log_out_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickLogout();
        Thread.sleep(3000);
    }


    @Then("^close browser$")
    public void close_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.quit();
    }
}
