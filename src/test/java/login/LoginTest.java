package login;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import pagecontroller.LogInController;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {

    LogInController login;


    @Test (priority = 1)
    public void verifySignInButton() {
        login = new LogInController(driver);
        login.SignInTab(driver);

    }

    @Test (priority = 2)
    public void verifyInvalidLogIn() throws InterruptedException {
        login = new LogInController(driver);
        login.InvalidSignIn(driver,"There is 1 error");

    }
}
