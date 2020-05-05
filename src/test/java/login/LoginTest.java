package login;

import base.ScriptBase;
import org.testng.annotations.BeforeTest;
import pagecontroller.LogInController;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {

    LogInController login;
    @BeforeTest
    public void Init(){
        Beforetest();

    }

    @Test
    public void verifySignInButton(){
        login=new LogInController(driver);
        login.SignInTab();

    }
}
