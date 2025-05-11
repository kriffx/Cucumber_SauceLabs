package validations;

import com.aventstack.extentreports.Status;
import framework.tools.Screenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;

import static framework.tools.Report.extentTest;

public class ProductsValidation {
    private final WebDriver driver;
    private final ProductsPage productsPage;

    public ProductsValidation(WebDriver driver) {
        this.driver = driver;
        this.productsPage = new ProductsPage(driver);
    }

    public void validarPaginaProdutos() throws IllegalAccessException {
        extentTest.log(Status.INFO, "Estou na página produtos.", Screenshot.screenshotBase64(this.driver));
        Assert.assertTrue(this.productsPage.title().isDisplayed());
    }
}