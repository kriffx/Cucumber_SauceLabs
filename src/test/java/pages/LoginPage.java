package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement userNameField() {
        return this.driver.findElement(By.id("user-name"));
    }

    public WebElement passwordField() {
        return this.driver.findElement(By.id("password"));
    }

    public WebElement loginButton() {
        return this.driver.findElement(By.id("login-button"));
    }

    public WebElement loginMessage() {
        return this.driver.findElement(By.cssSelector("#login_button_container > div > form > h3"));
    }
}