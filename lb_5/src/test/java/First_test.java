import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class First_test {

    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Тест сайта пошёл.");

        //driver.get("https://www.google.ru/");
    }

    @Test
    public void testfirst(){
        driver.get("https://www.vseinstrumenti.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Интернет-магазин ВсеИнструменты.ру - электроинструмент и оборудование: климатическое, садовое, клининговое, автогаражное"));
        try {
            driver.findElement(MainPage.searchPanel);
            driver.findElement(MainPage.headPanel);
            driver.findElement(MainPage.instrumentiLogo);
            driver.findElement(MainPage.headPanel);
            driver.findElement(MainPage.textSearch);
            driver.findElement(MainPage.firstPanel);
            driver.findElement(MainPage.secondPanel);
            driver.findElement(MainPage.actionPanel);
            driver.findElement(MainPage.popularCategoty);
        } catch (Exception e){
            Assert.assertTrue(false);
        }
    }

    @Test
    public void testWindowSearch() throws InterruptedException {
        driver.get("https://spb.vseinstrumenti.ru/instrument/shlifmashiny/bolgarka_ushm/");
        try {
            WebElement input = driver.findElement(SearchPage.searchPanel);
            input = driver.findElement(SearchPage.headPanel);
            input = driver.findElement(SearchPage.namePanel);
            input = driver.findElement(SearchPage.text);
            input = driver.findElement(SearchPage.actionPanel);
            input = driver.findElement(SearchPage.top);
            input = driver.findElement(SearchPage.secondPanel);
        } catch (Exception e){
            Assert.assertTrue(false);
        }
    }

    @Test
    public void testSelectCart() throws InterruptedException {
        driver.get("https://spb.vseinstrumenti.ru/instrument/shlifmashiny/bolgarka_ushm/");
        driver.findElements(SearchPage.ada).get(11).click();
        Thread.sleep(3000);
        try {
            WebElement input = driver.findElement(SearchPage.kors);
            input = driver.findElement(SearchPage.first);
        } catch (Exception e){
            Assert.assertTrue(false);
        }
    }

    @Test
    public void testSearch() throws InterruptedException {
        driver.get("https://www.vseinstrumenti.ru/");
        WebElement input = driver.findElement(MainTest.input);

        input.sendKeys("болгарка");
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(3)).until(
                ExpectedConditions.presenceOfElementLocated(MainTest.wait)
        ));
        element.click();

        String prov = driver.findElement(MainTest.prov1).getText();
        System.out.println(prov);
        // норм
        Thread.sleep(3000);
        driver.findElements(MainTest.clik).get(12).click();
        Thread.sleep(3000);
        driver.findElement(MainTest.kors).click();
        Thread.sleep(1000);
        try {
            String f = driver.findElement(MainTest.prov2).getText();
            System.out.println(f);
            Assert.assertTrue(f.equals(prov));
        } catch (Exception e){
            Assert.assertTrue(false);
        }
        Thread.sleep(3000);
    }

    @After
    public void close(){
        driver.quit();
        System.out.println("Где пошло там и сдохло");
    }
}
