package pagecontroller;

import org.openqa.selenium.By;
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


    public LogInController(WebDriver driver) {
        PageFactory.initElements(driver,  this);
    }

    public void SignInTab(WebDriver driver) {
        //signInButton.isDisplayed();
        String signIn="Sign it";
        stringReplacement(driver,signIn.replace("it","in"));
        System.out.println(signIn.replace("it","in"));
    }

    public void InvalidSignIn(WebDriver driver, String message) throws InterruptedException {
        Thread.sleep(1000);
        signInButton.click();
        userName.sendKeys("abcd@gmail.com");
        userPassword.sendKeys("abc123");
        submitLogIn.click();
        invalidLogInError.isDisplayed();
        //Assert.assertEquals(invalidLogInError, invalidLogInError);
        errorMessage(driver,message);
    }

    public void errorMessage(WebDriver driver, String message) {
        driver.findElement(By.xpath("//p[contains(text(),'" + message + "')]")).isDisplayed();
    }
    public void stringReplacement(WebDriver driver,String signIn){
        driver.findElement(By.xpath("//a[contains(text(),'"+signIn+"')]")).click();
    }
}
