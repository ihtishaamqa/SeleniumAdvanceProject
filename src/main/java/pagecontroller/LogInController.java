package pagecontroller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInController {
    @FindBy(xpath = "//*[@id='header']//a[contains(text(),'Sign in')]")
    WebElement signInButton;

    @FindBy(id = "email")
    WebElement userName;

    @FindBy(id = "passwd")
    WebElement userPassword;

    @FindBy(css = "#SubmitLogin > span")
    WebElement submitLogIn;

    @FindBy(xpath = "//p[contains(text(),'There is 1 error')]")
    WebElement invalidLogInError;




    public LogInController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void SignInTab(){
        signInButton.isDisplayed();
    }
    public void InvalidSignIn() throws InterruptedException {
        Thread.sleep(1000);
        signInButton.click();
        userName.sendKeys("abcd@gmail.com");
        userPassword.sendKeys("abc123");
        submitLogIn.click();
        invalidLogInError.isDisplayed();
        Assert.assertEquals(invalidLogInError,invalidLogInError);
    }
}
