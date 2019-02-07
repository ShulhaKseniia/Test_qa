package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Keys;

import java.util.Arrays;
import java.util.Collection;

public class RegressionTest extends Base {

    //проверка отображения блока с определением данных, которые хотят переводить
    @Test
    public void definitionPartTest() {
        helper.inputValue("перевод", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertTrue(helper.isClicable(translateElements.definition));
    }

    @Test(expected = AssertionError.class)
    public void definitionPartNegativeTest() {
        helper.inputValue("1", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertTrue(helper.isClicable(translateElements.definition));
    }

    //проверка отображения блока со значением данных, которые хотят переводить
    @Test
    public void meaningTest() {
        helper.inputValue("перевод", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertTrue(helper.isClicable(translateElements.meaning));
    }

    @Test(expected = AssertionError.class)
    public void meaningNegativeTest() {
        helper.inputValue("7", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertTrue(helper.isClicable(translateElements.meaning));
    }

    //проверка отображения блока с аналогами перевода (если есть)
    @Test
    public void translatingTest() {
        helper.click(translateElements.fromRuLang);
        helper.click(translateElements.toEnLang);
        helper.inputValue("перевод", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertTrue(helper.isClicable(translateElements.translating));
    }

    @Test(expected = AssertionError.class)
    public void translatingNegativeTest() {
        helper.click(translateElements.fromRuLang);
        helper.click(translateElements.toEnLang);
        helper.inputValue("7", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertTrue(helper.isClicable(translateElements.translating));
    }

    //Проверка перевода Автоопределение языка -> Английский
    @Test
    public void Auto_En_TranslateTest() throws InterruptedException {
        helper.click(translateElements.defineLang);
        helper.click(translateElements.toEnLang);
        helper.inputValue("тест", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertEquals("test", helper.getValue(translateElements.resultArea));
    }

    //Проверка перевода Русский -> Английский
    @Test
    public void Ru_En_TranslateTest() throws InterruptedException {
        helper.click(translateElements.fromRuLang);
        helper.click(translateElements.toEnLang);
        helper.inputValue("тест", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertEquals("test", helper.getValue(translateElements.resultArea));
    }

    //Проверка перевода Русский -> Русский
    @Test
    public void Ru_Ru_TranslateTest() throws InterruptedException {
        helper.click(translateElements.fromRuLang);
        //helper.click(translateElements.toRuLang);
        helper.inputValue("тест", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertEquals("тест", helper.getValue(translateElements.resultArea));
    }

    //Проверка перевода Автоопределение языка -> Русский
    @Test
    public void Auto_Ru_TranslateTest() throws InterruptedException {
        helper.click(translateElements.defineLang);
        helper.click(translateElements.toRuLang);
        helper.inputValue("test", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertEquals("тестовое задание", helper.getValue(translateElements.resultArea));
    }

    //Проверка перевода Английский -> Русский
    @Test
    public void En_Ru_TranslateTest() throws InterruptedException {
        helper.click(translateElements.fromEnLang);
     //   helper.click(translateElements.toRuLang);
        helper.inputValue("test", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertEquals("тестовое задание", helper.getValue(translateElements.resultArea));
    }

    //Проверка перевода Английский -> Английский
    @Test
    public void En_En_TranslateTest() throws InterruptedException {
        helper.click(translateElements.fromEnLang);
        helper.click(translateElements.toEnLang);
        helper.inputValue("test", translateElements.sourceArea);
        translateElements.sourceArea.sendKeys(Keys.RETURN);
        helper.wait(translateElements.resultArea);
        Assert.assertEquals("test", helper.getValue(translateElements.resultArea));
    }






 }

