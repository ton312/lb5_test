import org.openqa.selenium.By;

public class MainPage {
    public static By instrumentiLogo = By.xpath("//img[@alt='ВсеИнструменты.ру']");
    public static By textSearch = By.xpath("//span[@class='NbRMR7']");
    public static By searchPanel = By.xpath("//div[@class='tA3gok main-container']");
    public static By headPanel = By.xpath("//div[@class='_1P59Yz']");
    public static By firstPanel = By.xpath("//div[@class='const-widgets-holder col-12']");
    public static By secondPanel= By.xpath("//div[@class='product-spinner -month']");
    public static By actionPanel= By.xpath("//div[@class='advantages-box box']");
    public static By popularCategoty= By.xpath("//h1[contains(text(), 'Популярные категории')]");
}
