package questions;

import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import page.MainPage;

        //import static main.Utils.randomString;
public class ScooterQuestions {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void checkAllText() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.open(); // открываем ссылку
        mainPage.clickCookie(); // закрываем куки
        mainPage.scrollHowMuch(); // скролл
        mainPage.clickHowMuch(); // клик 1й вопрос
        mainPage.IsAnswerHowMuch();
        mainPage.clickWantSeveralScooters();
        mainPage.IsAnswerSeveralScooters();
        mainPage.clickHowRentalTimeCalculated();
        mainPage.IsAnswerHowRentalTimeCalculated();
        mainPage.clickTodayOrder();
        mainPage.IsAnswerTodayOrder();
        mainPage.clickExtendOrder();
        mainPage.IsAnswerExtendOrder();
        mainPage.clickCharging();
        mainPage.IsAnswerCharging();
        mainPage.clickCanOrderCancellation();
        mainPage.IsAnswerCanOrderCancellation();
        mainPage.clickLiveOutsideMoscow();
        mainPage.IsAnswerLiveOutsideMoscow();
    }

}

