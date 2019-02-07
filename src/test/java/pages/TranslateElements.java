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
    //public String text;

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

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[2]/div[1]")
    public static WebElement countSymbol;

    @FindBy(xpath = "//*[@id=\"gt-ovfl-msg\"]")
    public static WebElement warning;

    @FindBy(xpath = "//*[@id=\"gt-ovfl-xlt\"]")
    public static WebElement overText;

    public String text = "Императорский Рим\n" +
            "\n" +
            "Убийство Юлия Цезаря на картине Винченцо Камуччини, 1805 г.\n" +
            "Гай Юлий Цезарь воздвигает новое здание сената и кладет основание новой колоссальной базилике на западной стороне форума, названной его именем. Ему же принадлежит идея создать новую территорию для общественных зданий на Марсовом поле и соединить рядом построек общественного и религиозного характера старый город у форума с новым городом на Марсовом поле. Первая из этих идей нашла своё выражение в постройке портика для голосований[en] на Марсовом поле, вторая — в создании искусственных площадей (fora), в сущности являющихся ничем иным, как периболами (дворами) вокруг центрального храма. Первой из них был форум Юлия Цезаря с храмом Венеры-Прародительницы, прародительницы Юлиев. Полное осуществление планы Цезаря нашли только при Августе, который создал новый город четырнадцати кварталов. Рим с этого времени теряет свой характер укрепленного города, пространство внутри Сервиевой стены окончательно застраивается, в пределы города входят и предместья.\n" +
            "\n" +
            "На Римском форуме, кроме реставрации и перестройки храмов, курии и Юлиевой базилики, Августу принадлежит постройка храма Цезаря и нового центра политической жизни Рима, перешедшей теперь на форум и сосредоточившейся вокруг новой народной трибуны, новых ростр. Возле форума Цезаря возник форум Августа, а поблизости расположился Храм Марса-Мстителя, чем сделан был новый шаг к соединению центра с Марсовым полем. Был также построен сохранившийся до наших дней Пантеон.\n" +
            "\n" +
            "\n" +
            "Рим в имперскую эпоху. Современная реконструкция\n" +
            "В правление императора Нерона в Риме произошёл «великий пожар». Город полностью отстраивается, на этот раз более красиво, только с утверждением династии Флавиев. Ряд мер полицейского характера меняет вид улиц. Новые дома имеют более благообразный вид: одной из мер Веспасиана было обязательное снабжение каждого дома портиком, благодаря чему улицы получали вид крытых галерей. Свободным пространством после пожара Флавии воспользовались для своих монументальных построек. В долине между Палатином и Эсквилином возник Колизей, вокруг него — ряд построек служебного характера.\n" +
            "\n" +
            "Деятельность первых императоров блестящим образом довершает Траян; он окончательно связывает ряд императорских площадей с Марсовым полем колоссальной площадью (forum Traianum). Всемирно известна созданная в это время колонна Траяна. Главным созданием Адриана был Храм Венеры и Ромы на Велии, возведением которого было закончено превращение центральной части города в ряд блестящих построек, связывавших форум с Марсовым полем с одной стороны и с площадью у Колизея — с другой. За Тибром Адриан выстроил себе мавзолей, существующий ещё и теперь в виде крепости св. Ангела; там же возник в это время и новый цирк. Императоры вели активное строительство грандиозных терм (общественных бань).\n" +
            "\n" +
            "Позднее строительство новых зданий значительно замедлилось из-за осложнившегося положения Римской империи. В конце III в. были возведены новые укрепления, известные как стена Аврелиана. Они охватывали весь разросшийся город с его затибрской частью. Они совпадали с таможенной линией и отчасти с границей померия, но во многих случаях в пределы стены были введены и гробницы (в том числе пирамида Цестия и гробница Эврисака[it]). В IV веке начинается строительство христианских храмов.\n" +
            "\n" +
            "Сложное для города время наступило в V веке. В 410 году Рим взял и разграбил вождь вестготов Аларих, в 455 году город жестоко разграбили вандалы.\n" +
            "\n" +
            "Рим в Средние века\n" +
            "\n" +
            "Папа Лев III возлагает императорскую корону на голову Карла Великого на Рождество 800 г. в Риме, миниатюра из Больших французских хроник, ок 1455—1460 г.\n" +
            "В 476 году Одоакр низложил последнего западно-римского императора, но скоро в свою очередь уступил место остготу Теодориху, правление которого ознаменовалось началом широкой реставраторской деятельности в городе.\n" +
            "\n" +
            "В войне Византии с остготами (536—552) Рим шесть раз подвергался осаде и переходил из рук в руки. При этом остготские цари, и в особенности Тотила, брали многочисленных заложников из числа жителей Рима, что привело к уничтожению самых знатных фамилий и уменьшило население Рима до 30—40 тыс. человек.\n" +
            "\n" +
            "В течение последующих двух веков (570—750), когда значительная часть Италии была отторгнута от Византии лангобардами, папы стали играть первенствующую роль в светских делах города при номинальном подчинении слабой Византии (равеннскому экзарху).\n" +
            "\n" +
            "Хотя покинувшие Рим императоры продолжают поддерживать отдельные здания, но эти реставрации — только исключения; большинство общественных зданий медленно разрушается. Только Теодорих попробовал было развить широкую реставраторскую деятельность, но она помогла ненадолго. Разрушению зданий сопутствовало похищение из них украшений из бронзы, мрамора и другого дорогого материала очередными завоевателями.\n" +
            "\n" +
            "С возвышением пап все большую роль в городе играет базилика святого Петра и центр города перемещается на Ватиканский холм, вокруг которого уже при Льве IV возводятся новые оборонительные сооружения.\n" +
            "\n" +
            "Старые здания беспрепятственно разрушаются, сохраняются лишь те, в которых нашли себе приют христианские церкви или феодальные крепости. Так мавзолей Адриана, выгодно расположенный рядом с Ватиканским холмом, ещё при постройке стен Аврелиана стал небольшой крепостью, а со временем превратился в неприступный папский Замок Святого Ангела, выдержавший несколько осад (последнюю в 1527 году во время т. н. Разграбления Рима).";












}
