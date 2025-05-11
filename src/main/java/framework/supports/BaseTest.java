package framework.supports;

import framework.webDrivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

    protected WebDriver driver;

    private final ScenarioContext scenarioContext;

    public BaseTest(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

//    @Before
    public void setUp() {
        System.out.println("setUp");
        WebDriver driver = new ChromeDriver();
        scenarioContext.setDriver(driver);
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

//    @After
    public void tearDown() {
        System.out.println("tearDown");
        WebDriver driver = scenarioContext.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }

}