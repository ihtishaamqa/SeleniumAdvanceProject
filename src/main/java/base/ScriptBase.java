package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptBase {
    public WebDriver driver;

    public void Beforetest(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");




    }
}
