package validations;

import com.aventstack.extentreports.Status;
import framework.tools.Screenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static framework.tools.Report.extentTest;

public class LoginValidation {
    private final WebDriver driver;
    private final LoginPage loginPage;

    public LoginValidation(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }

    public void validarMensagemErroDeLogin(String actual) throws IllegalAccessException {
        extentTest.log(Status.INFO, "Mensagem exibida: " + actual, Screenshot.screenshotBase64(this.driver));
        Assert.assertEquals(this.loginPage.loginMessage().getText(), actual);
    }
}