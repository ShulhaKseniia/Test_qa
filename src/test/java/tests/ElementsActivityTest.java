package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class ElementsActivityTest extends Base{

    //Тесты работоспособности элементов на странице
    @Test
    public void cleaningFieldTest() {
        helper.inputValue("очистка",translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.click(translateElements.clearTextButton);
        Assert.assertEquals("", helper.getValue(translateElements.sourceArea));
    }

    @Test
    public void countSymbolsTest() {
        helper.inputValue("тест",translateElements.sourceArea);
        Assert.assertEquals("4/5000", helper.getValue(translateElements.countSymbol));
    }

    @Test
    public void additionalPosibilitiesTest() {
        helper.click(translateElements.fromRuLang);
        helper.inputValue("тест",translateElements.sourceArea);
        helper.click(translateElements.microphone);
        Assert.assertTrue(helper.isClicable(translateElements.audio));
    }

    @Test
    public void listeningResultTranslatingTest() {
        helper.inputValue("тест",translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        Assert.assertTrue(helper.isClicable(translateElements.listenTranslation));;
    }

    @Test
    public void historyRedirectTest ()  {
        helper.click(translateElements.historyButton);
        Assert.assertEquals("История", helper.getValue(translateElements.historyFormElement));
    }

    @Test
    public void savedRedirectTest () throws InterruptedException {
        helper.click(translateElements.savedButton);
        Assert.assertEquals("ВОЙТИ", helper.getValue(translateElements.savedFormElement));

    }

    @Test
    public void communityRedirectTest () {
        helper.click(translateElements.communityButton);
        Assert.assertEquals("НАЧАТЬ", helper.getValue(translateElements.communityFormElement));
    }

    @Test
    public void feedbackRedirectTest() throws InterruptedException {
        Assert.assertTrue(helper.isClicable(translateElements.sendFeedback));;
    }

    @Test
    public void docDownloadOpportunityTest() {
        helper.click(translateElements.fileDownloadButton);
        Assert.assertTrue(helper.isClicable(translateElements.chooseDownloadbutton));;
    }

}



