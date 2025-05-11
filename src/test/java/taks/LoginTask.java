package taks;

import com.aventstack.extentreports.Status;
import framework.tools.Screenshot;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static framework.tools.Report.extentTest;

public class LoginTask {
    private final LoginPage loginPage;

    public LoginTask(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
    }

    public void login(String usuario, String senha) {
        this.loginPage.userNameField().clear();
        this.loginPage.userNameField().sendKeys(usuario);
        this.loginPage.passwordField().clear();
        this.loginPage.passwordField().sendKeys(senha);
        this.loginPage.loginButton().click();
        extentTest.log(Status.INFO, "Login realizado utilizando o usuário '" + usuario + "'.");
    }
}