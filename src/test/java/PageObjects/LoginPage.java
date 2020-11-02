package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class LoginPage {
    WebDriver driver;
    Logger logger=Logger.getLogger(getClass().getName());
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="Email")
    WebElement emailField;

    @FindBy(id="Password")
    WebElement passwordField;

    @FindBy (xpath = "//input[@value='Log in']")
    WebElement loginButton;

    @FindBy (xpath = "//li[a[contains(span,'Catalog')]]")
    WebElement tabCatalog;

    @FindBy(linkText = "Logout")
    WebElement logoutLink;

    public boolean tabCatalogPresence(){
       return tabCatalog.isDisplayed();
    }
    public String tabCatalogGettext(){
        logger.info(tabCatalog.getText());

        return tabCatalog.getText();
    }

    public void setUserName(String uname)
    {
        emailField.clear();
        emailField.sendKeys(uname);
    }

    public void setPassword(String upassword){
        passwordField.clear();
        passwordField.sendKeys(upassword);
    }
    public void clickOnLogin(){
        loginButton.click();
    }
    public void clickLogout(){
        logoutLink.click();
    }
}
