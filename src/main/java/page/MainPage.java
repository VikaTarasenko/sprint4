package page;
import org.openqa.selenium.*;

import static java.lang.Thread.sleep;

//import static main.Utils.randomString;

public class MainPage {

    private final String url = "https://qa-scooter.praktikum-services.ru/"; // url входа
    private final By howMuch = By.xpath(".//div[@id='accordion__heading-0']");// 1й вопрос списка
    private final By answerHowMuch = By.id("accordion__panel-0"); // ответ на 1й вопрос
    private final By wantSeveralScooters = By.xpath(".//div[@id='accordion__heading-1']"); // 2й вопрос списка
    private final By answerSeveralScooters = By.id("accordion__panel-1"); // ответ на 2й вопрос
    private final By howRentalTimeCalculated = By.xpath(".//div[@id='accordion__heading-2']"); // 3й вопрос списка
    private final By answerHowRentalTimeCalculated = By.id("accordion__panel-2"); // ответ на 3й вопрос
    private final By todayOrder = By.xpath(".//div[@id='accordion__heading-3']"); // 4й вопрос списка
    private final By answerTodayOrder = By.id("accordion__panel-3"); // ответ на 4й вопрос
    private final By extendOrder = By.xpath(".//div[@id='accordion__heading-4']"); // 5й вопрос списка
    private final By answerExtendOrder = By.id("accordion__panel-4"); // ответ на 5й вопрос
    private final By charging = By.xpath(".//div[@id='accordion__heading-5']");// 6й вопрос списка
    private final By answerCharging = By.id("accordion__panel-5");// ответ на 6й вопрос
    private final By canOrderCancellation = By.xpath(".//div[@id='accordion__heading-6']"); // 7й вопрос списка
    private final By answerCanOrderCancellation = By.id("accordion__panel-6"); // ответ на 7й вопрос
    private final By liveOutsideMoscow = By.xpath(".//div[@id='accordion__heading-7']"); // 8й вопрос списка
    private final By answerLiveOutsideMoscow = By.id("accordion__panel-7"); // ответ на 8й вопрос
    //private final By buttonUpOrder = By.xpath(".//button[@class='Button_Button__ra12g']"); // кнопка Заказать вверху страницы

    // private final By goButton = By.xpath(".//button[text() ='Go!']"); */
    private WebDriver driver;
    //private static final String RANDOM_ORDER_NUMBER = randomString();
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() { //переход по ссылке
        driver.get(url);
    }
    public void clickCookie() { //закрываем куки
        driver.findElement(By.id("rcc-confirm-button")).click();
    }


    public void scrollHowMuch() { // скролл вниз
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END); //скролл страницы
    }
    public void clickHowMuch() { //клик на 1й вопрос
        driver.findElement(howMuch).click();
    }
    public boolean IsAnswerHowMuch() { // проверка наличия текста в ответе на 1й вопрос
        return driver.findElements(answerHowMuch).size() > 0;
    }
    public void clickWantSeveralScooters() { //клик на 2й вопрос
        driver.findElement(wantSeveralScooters).click();
    }
    public boolean IsAnswerSeveralScooters() { // проверка наличия текста в ответе на 2й вопрос
        return driver.findElements(answerSeveralScooters).size() > 0;
    }
    public void clickHowRentalTimeCalculated() { //клик на 3й  вопрос
        driver.findElement(howRentalTimeCalculated).click();
    }
    public boolean IsAnswerHowRentalTimeCalculated() { // проверка наличия текста в ответе на 3й вопрос
        return driver.findElements(answerHowRentalTimeCalculated).size() > 0;
    }
    public void clickTodayOrder() { //клик на 4й  вопрос
        driver.findElement(todayOrder).click();
    }
    public boolean IsAnswerTodayOrder() { // проверка наличия текста в ответе на 4й вопрос
        return driver.findElements(answerTodayOrder).size() > 0;
    }
    public void clickExtendOrder() { //клик на 5й  вопрос
        driver.findElement(extendOrder).click();
    }
    public boolean IsAnswerExtendOrder() { // проверка наличия текста в ответе на 5й вопрос
        return driver.findElements(answerExtendOrder).size() > 0;
    }
    public void clickCharging() { //клик на 6й  вопрос
        driver.findElement(charging).click();
    }
    public boolean IsAnswerCharging() { // проверка наличия текста в ответе на 6й вопрос
        return driver.findElements(answerCharging).size() > 0;
    }
    public void clickCanOrderCancellation() { //клик на 7й  вопрос
        driver.findElement(canOrderCancellation).click();
    }
    public boolean IsAnswerCanOrderCancellation() { // проверка наличия текста в ответе на 7й вопрос
        return driver.findElements(answerCanOrderCancellation).size() > 0;
    }
    public void clickLiveOutsideMoscow() { //клик на 8й  вопрос
        driver.findElement(liveOutsideMoscow).click();
    }
    public boolean IsAnswerLiveOutsideMoscow() { // проверка наличия текста в ответе на 8й вопрос
        return driver.findElements(answerLiveOutsideMoscow).size() > 0;
    }

    public OrderPage orderPage() {
        return new OrderPage(driver);
    }
}
