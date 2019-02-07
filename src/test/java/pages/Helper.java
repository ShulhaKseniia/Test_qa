package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Helper {
    public WebDriver driver;
    public Select select;
    public TranslateElements translateElements;

    public Helper(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


       public void click(WebElement element) {
            try {
                new WebDriverWait(driver, 1000).until(ExpectedConditions.elementToBeClickable(element));
                element.click();
            }  catch (StaleElementReferenceException e) {
                System.out.println("Element " + element + "is not attached to the page document "
                        + e.getStackTrace());
            } catch (NoSuchElementException e) {
                System.out.println("Element " + element + " was not found in DOM "
                        + e.getStackTrace());
            }
            new WebDriverWait(driver, 1000);
       }

        public void inputValue(String value, WebElement field) {
            new WebDriverWait(driver, 1000).until(ExpectedConditions.visibilityOf(field));
            field.sendKeys(value);
        }



    public boolean isClicable(WebElement element) {
        boolean result = false;
        try {
          // new WebDriverWait(driver, 1000).until(ExpectedConditions.visibilityOf(element));
            element.click();
            result = true;
        }
        catch (WebDriverException e) {
            System.out.println("Element " + element + " is not visible ");
        }
        return result;
    }

    public void wait(WebElement element){
        new WebDriverWait(driver, 10000).until(ExpectedConditions.visibilityOf(element));
      //  click(element);
    }

    public static String getValue(WebElement element) {
        String value = element.getText();
        return value;
    }





}
