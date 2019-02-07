package tests;

import Rules.RetryRule;
import org.junit.Rule;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import pages.Helper;
import pages.TranslateElements;

import java.util.concurrent.TimeUnit;

public class Base {
    protected WebDriver driver;
    public TranslateElements translateElements;
    public Helper helper;

    @Before
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        helper = new Helper(driver);

        translateElements = new TranslateElements(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://translate.google.com.ua/");
    }

    @Rule
    public RetryRule rule = new RetryRule(2);

    @After
    public void tearDown() {
        driver.quit();
    }
}
