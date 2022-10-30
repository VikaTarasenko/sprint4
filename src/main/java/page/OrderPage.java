package page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
public class OrderPage {
    private final String url = "https://qa-scooter.praktikum-services.ru/"; // url входа
    private final By buttonUpOrder = By.xpath(".//button[@class='Button_Button__ra12g']"); // кнопка Заказать вверху страницы
    private final By buttonDownOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private WebDriver driver;
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() { //переход по ссылке
        driver.get(url);
    }
    public void clickCookie() { //закрываем куки
        driver.findElement(By.id("rcc-confirm-button")).click();
    }
    public void clickButtonUpOrder() {    //кликаем Заказать
        driver.findElement(buttonUpOrder).click();
    }

    public void clickButtonDownOrder() {    // кликаем Заказать внизу страницы
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END); //скролл страницы
        driver.findElement(buttonDownOrder).click();
    }
    public boolean IsOrderPageOpen() { // проверка открытия формы заказа, "Для кого заказ"
        return driver.findElements(By.xpath(".//div[@class='Order_Header__BZXOb']")).size() > 0;
    }
    public void sendName() { // заполняем поле Имя
        driver.findElement(By.cssSelector("input[placeholder='* Имя']")).sendKeys("Ангелина");
    }
    public void sendSurnameName() {  // заполняем поле Фамилия
        driver.findElement(By.cssSelector("input[placeholder='* Фамилия']")).sendKeys("Ангелинова");
    }
    public void sendAdress() {  // заполняем поле Адрес
        driver.findElement(By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']")).sendKeys("Фряново");
    }
    public void clickMetro() {      //выбор метро
        driver.findElement(By.cssSelector("input[placeholder='* Станция метро']")).sendKeys("Бульвар Рокоссовского", Keys.ARROW_DOWN, Keys.ENTER);
    }
    public void sendPhoneNumber() {  // заполняем поле номер телефона
        driver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")).sendKeys("79001112233");
    }
    public void clickButtonNext() {          // клик кнопки Далее
        driver.findElement(By.xpath(". //button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
    }
    public boolean IsSecondOrderPageOpen() { // проверка открытия формы заказа, "Про аренду"
        return driver.findElements(By.xpath(".//div[@class='Order_Header__BZXOb']")).size() > 0;
    }
    public void clickWhenBringOrder() {   // клик на календарь
        driver.findElement(By.xpath("//input[@placeholder='* Когда привезти самокат']")).click();
    }
    public void choiceWhenBringOrder() {   // выбор даты доставки заказа
        driver.findElement(By.xpath(".//button[@aria-label='Next Month']")).click();
        driver.findElement(By.xpath(".//div[contains(@aria-label, 'Choose')]")).click();
    }
    public void choiceDateRent() {   // выбор срока аренды
        driver.findElement(By.xpath(".//div[@class='Dropdown-placeholder']")).click();
        driver.findElement(By.xpath(".//div[contains(@class, 'Dropdown-option')]")).click();
    }
    public void choiceColor() {   // выбор цвета
        driver.findElement(By.xpath(".//input[@id='black']")).click();
    }
    public void comment() {   // комментарий курьеру
        driver.findElement(By.xpath(".//input[@placeholder='Комментарий для курьера']")).sendKeys("длопдпавпвар ыпрыапоыапрыпи ыерп");
    }
    public void clickToOrder() {   // кликнуть заказать, оформить
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
    }
    public void clickYes() {   // кликнуть Да
        driver.findElement(By.xpath(".//button[contains(text(),'Да')] ")).click();
    }
    public boolean IsThirdOrderPageOpen() { // проверка открытия окна подтверждения заказа
       return driver.findElements(By.className("Order_ModalHeader")).size() > 0;
    }
}