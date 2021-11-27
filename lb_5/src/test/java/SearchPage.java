import org.openqa.selenium.By;

public class SearchPage {
    public static By searchPanel = By.xpath("//div[@class='wrapper-wide -header-top-color']");
    public static By headPanel = By.xpath("//div[@class='wrapper-wide -header-bottom-color']");
    public static By namePanel = By.xpath("//div[@class='content-heading']");
    public static By top = By.xpath("//div[@data-behavior = 'carousel-month-block']");
    public static By secondPanel= By.xpath("//div[@class='listing-grid -rows']");
    public static By actionPanel= By.xpath("//aside[@class='col-3 sidebar']");
    public static By text= By.xpath("//h1[contains(text(), 'Болгарки (УШМ)')]");
    public static By kors = By.xpath("//div[@class='consumables']");
    public static By first = By.xpath("//strong[contains(text(), 'Товар добавлен в корзину')]");
    public static By ada = By.xpath("//div[@class='buttons']");
}
