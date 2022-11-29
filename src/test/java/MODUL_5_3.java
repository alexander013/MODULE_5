import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MODUL_5_3 {
    private WebDriver driver;

    @Before
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void TestModul_5_3()
    {
        driver.navigate().to("http://qajava.skillbox.ru/module05/auth/index.html/");
        var DivFooterWrapperBaseContainerLocator = By.cssSelector("div.footer__wrapper.baseContainer > div");
        var ElementPosleMainLocator = By.cssSelector("main[class='content auth'] > section");
        var FormTitle_1 = By.cssSelector("div.form-wrapper > h3.form-title + *");
        var FormTitle_2 = By.cssSelector("div.form-wrapper > h3.form-title ~ *");
        var TegElementPosleFooterLocator_1 = By.cssSelector("div.footer__contactItem.descriptionText + *");
        var TegElementPosleFooterLocator_2 = By.cssSelector("div.footer__contactItem.descriptionText ~ *");

    }
}
