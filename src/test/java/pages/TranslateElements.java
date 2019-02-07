package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import tests.Base;

public class TranslateElements extends Base{
    public WebDriver driver;

    public TranslateElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[1]/div[4]/div/a/span[2]")
    public static WebElement pageTitle;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[1]")
    public static WebElement textButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[2]/div")
    public static WebElement fileDownloadButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/div/form/div[1]/label")
    public static WebElement chooseDownloadbutton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    public static WebElement defineLang;

    @FindBy(xpath = "//*[@class=\"sl-wrap\"]//*[@id=\"sugg-item-ru\"]")
    public static WebElement fromRuLang ;

    @FindBy(xpath = "//*[@class=\"sl-wrap\"]//*[@id=\"sugg-item-en\"]")
    public static WebElement fromEnLang;

    @FindBy(xpath = "//*[@class=\"tl-wrap\"]//*[@id=\"sugg-item-ru\"]")
    public static WebElement toRuLang ;

    @FindBy(xpath = "//*[@class=\"tl-wrap\"]//*[@id=\"sugg-item-en\"]")
    public static WebElement toEnLang ;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/div")
    public static WebElement clearTextButton;

    @FindBy(xpath = "//*[@id=\"gt-speech\"]")
    public static WebElement microphone;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")
    public static WebElement audio;

    @FindBy(xpath = "//*[@id=\"source\"]")
    public static WebElement sourceArea;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")
    public static WebElement resultArea;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[3]/a")
    public static WebElement sendFeedback;

    @FindBy(xpath = "/html/body/div[2]/div/div/uf-describe-page/form/header/div[2]/label/button/svg")
    public static WebElement feedbackFormElement;

//    @FindBy(css = "body > div:nth-child(3) > div > div > uf-describe-page > form > header > h1")
//    public static WebElement feedbackFormElement;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[5]/div")
    public static WebElement listenTranslation;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[1]")
    public static WebElement definition;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/div[1]" )
    public static WebElement meaning;

    @FindBy(xpath =  "/html/body/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public static WebElement translating;

    @FindBy(xpath = "//*[@id=\"ft-icon-img-hst\"]")
    public static WebElement historyButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]")
    public static WebElement historyFormElement;

    @FindBy(xpath = "/html/body/div[9]/div[3]/button[2]")
    public static WebElement savedFormElement;

    @FindBy(xpath = "//*[@id=\"ft-icon-img-svd\"]")
    public static WebElement savedButton;

    @FindBy(xpath = "//*[@id=\"ft-icon-img-cmn\"]")
    public static WebElement communityButton;

    @FindBy(xpath = "//*[@id=\"get-started-desktop\"]")
    public static WebElement communityFormElement;












}
