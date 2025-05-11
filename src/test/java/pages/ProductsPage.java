package pages;

import framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    private final WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement title() {
        Wait waitElement = new Wait(this.driver);
        return waitElement.waitVisibilityElement(By.cssSelector("#inventory_filter_container > div"));
    }
}