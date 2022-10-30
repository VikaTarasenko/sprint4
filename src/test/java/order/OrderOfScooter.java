package order;

import main.BrowserRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.OrderPage;

public class OrderOfScooter {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    public void checkUpOrder() { //проверка заказа через кнопку Заказать вверху главной страницы
        OrderPage orderPage = new OrderPage(browserRule.getDriver());
        orderPage.open();
        orderPage.clickCookie(); // закрываем куки
        orderPage.clickButtonUpOrder();
        orderPage.IsOrderPageOpen();
        //Assert.assertTrue(String.valueOf(true), orderPage.IsOrderPageOpen());
        orderPage.sendName();
        orderPage.sendSurnameName();
        orderPage.sendAdress();
        orderPage.clickMetro();
        orderPage.clickMetro();
        orderPage.sendPhoneNumber();
        orderPage.clickButtonNext();
        orderPage.IsSecondOrderPageOpen();
        orderPage.clickWhenBringOrder();
        orderPage.choiceWhenBringOrder();
        orderPage.choiceDateRent();
        orderPage.choiceColor();
        orderPage.comment();
        orderPage.clickToOrder();
        orderPage.clickYes();
        orderPage.IsThirdOrderPageOpen();
    }
    @Test
    public void checkDownOrder() { //проверка заказа через кнопку Заказать внизу главной страницы
        OrderPage orderPage = new OrderPage(browserRule.getDriver());
        orderPage.open();
        orderPage.clickCookie(); // закрываем куки
        orderPage.clickButtonDownOrder(); // скроллим и кликаем Заказать внизу
        orderPage.IsOrderPageOpen();
       // Assert.assertTrue(String.valueOf(true), orderPage.IsOrderPageOpen());
        orderPage.sendName();
        orderPage.sendSurnameName();
        orderPage.sendAdress();
        orderPage.clickMetro();
        orderPage.clickMetro();
        orderPage.sendPhoneNumber();
        orderPage.clickButtonNext();
        orderPage.IsSecondOrderPageOpen();
        orderPage.clickWhenBringOrder();
        orderPage.choiceWhenBringOrder();
        orderPage.choiceDateRent();
        orderPage.choiceColor();
        orderPage.comment();
        orderPage.clickToOrder();
        orderPage.clickYes();
        orderPage.IsThirdOrderPageOpen();
    }
}