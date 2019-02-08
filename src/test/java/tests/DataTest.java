package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.TranslateElements;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DataTest extends Base{
    private String sourceValue;
    private String result;

    public DataTest(String sourceValue, String result) {
        this.sourceValue = sourceValue;
        this.result = result;
    }

    //Проверка возможности работы с данными
    @Test
    public void dataTest() {
        helper.inputValue(sourceValue,translateElements.sourceArea);
        Assert.assertEquals(result, helper.getValue(TranslateElements.resultArea));
    }


    @Parameterized.Parameters(name = "Inputs: sourceValue ={0}; result = {1}")
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {"1 + 5", "1 + 5"},
                {"!@#$%^&*()_+","!@#$%^&*()_+"},
                {"        .","."},
        });
    }

}
