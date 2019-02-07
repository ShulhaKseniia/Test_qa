package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class SmokeTest extends Base {

    //проверка открытия ожидаемой страницы
    @Test
    public void accessTest(){
        Assert.assertEquals("Переводчик",helper.getValue(translateElements.pageTitle));
    }

    //проверка того, что введенный текст переводится
    @Test
    public void textTranslateTest() throws InterruptedException {
        helper.click(translateElements.fromRuLang);
        helper.click(translateElements.toEnLang);
        helper.inputValue("тест",translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertEquals("test", helper.getValue(translateElements.resultArea));
    }

    @Test (timeout=6000)
    public void textTranslateTimeTest() throws InterruptedException {
        helper.click(translateElements.toEnLang);
        helper.inputValue("Мовлення як вид людської діяльності завжди зорієнтоване на виконання певного комунікативного завдання",translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);

    }


}
