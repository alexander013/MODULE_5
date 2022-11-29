import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MODUL_5_2 {
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
    public void TestModul_5_2_1()
    {
        driver.navigate().to("http://qajava.skillbox.ru/module05/auth/index.html/");
        var EmailElementDataLocator = By.cssSelector("[data='email']");
        var EmailElemenrRequiredLocator = By.cssSelector("[required='']");
        var EmailElementImportant = By.cssSelector("[important='']");
        var PasswordElementDataLocator = By.cssSelector("[data='password one']");
        var PasswordElementRequiredLocator = By.cssSelector("[required='true']");
        var EmailLabelElementLocator_1 = By.cssSelector("label.form-label[for='email']");
        var EmailLabelElementLocator_2 = By.cssSelector("label[class='form-label'][for='email']");
        var MainHeaderPageElementLocator_1 = By.cssSelector("[class*='section']");
        var MainHeaderPageElementLocator_2 = By.cssSelector("[for='main-header-page']");
        var HrefElementLocator_1 = By.cssSelector("a[href^='http']");
        var HrefElementLocator_2 = By.cssSelector("a[href^='mailto']");
        var ImgElementLocator = By.cssSelector("srs$='.png");
        var FormTitleLocator = By.cssSelector("h3[class*='title']");
        var ClassElementLocator = By.cssSelector("[class$='header']");
    }
}
