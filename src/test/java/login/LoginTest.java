package login;

import base.ScriptBase;
import org.testng.annotations.BeforeTest;
import pagecontroller.LogInController;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {

    LogInController login;

    @BeforeTest
    public void Init() {
        Beforetest();

    }

    @Test (priority = 1)
    public void verifySignInButton() {
        login = new LogInController(driver);
        login.SignInTab();

    }

    @Test (priority = 2)
    public void verifyInvalidLogIn() throws InterruptedException {
        login = new LogInController(driver);
        login.InvalidSignIn();

    }
}
