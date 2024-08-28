package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public String name = "agileway";

    public final By etUserName = By.id("username");

    public final By etUserPassword = By.id("password");

    public final By btnSignIn = By.name("commit");



    public final By tvLoginError = By.id("flash_alert");

    public void fillUserName() {
        fillInput(etUserName, this.name);
    };

    public void fillUserPassword(){
        fillInput(etUserPassword, "testwise" );
    };

    public void clickBtnSigIn() {
        click(btnSignIn);
    }

    public void isOnLoginPage(){
        driver.get("https://travel.agileway.net/login");
        isVisible(btnSignIn);
    }




}
