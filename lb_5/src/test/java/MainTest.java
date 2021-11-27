import org.openqa.selenium.By;

public class MainTest {
    public static By input = By.xpath("//input[@placeholder='Поиск среди 500 тысяч товаров. Введите запрос']");
    public static By wait = By.xpath("//span[contains(text(), 'Болгарки')]");
    public static By prov1 = By.xpath("//a[@itemprop='url']");
    public static By prov2 = By.xpath("//a[@data-behavior='cart-product-name']");
    public static By clik = By.xpath("//div[@class='buttons']");
    public static By kors = By.xpath("//a[contains(text(), 'Перейти в корзину')]");
}
