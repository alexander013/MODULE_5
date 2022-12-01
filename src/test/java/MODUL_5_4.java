import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MODUL_5_4 {
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


//    Задание № 1
    @Test
    public void TestKnijnMagazin()
    {
        driver.navigate().to("http://qajava.skillbox.ru/index.html");
//        Локаторы на главной странице для элемента <a href="" test-info="about-us">О магазине</a>.
//        Осуществите поиск только по атрибуту test-info, равному about-us.
        var O_MagazineElementLocator = By.cssSelector("[test-info='about-us']");
//        Локатор на главной странице для всех элементов с тегом a
//        и с атрибутом href с пустым значением, то есть равным «».
        var Teg_A_hrefElementLocator = By.cssSelector("a[href='']");
//        Локатор на главной странице для элемента <div class="book-price">.
//        Осуществите поиск одновременно по тегу и классу, равному book-price.
        var BookPriceElementLocator = By.cssSelector("div[class='book-price']");
//        Локатор на главной странице  для всех элементов с тегом button и с атрибутом class, начинающимся на book.
        var ButtonElementLocator = By.cssSelector("button[class^='book']");
//        Локатор на главной странице для всех элементов, у которых атрибут class заканчивается на main.
        var MainendElementLocator = By.cssSelector("[class$='main']");
//        Локатор на главной странице для всех элементов с тегом a и с атрибутом class, содержащим в себе слово menu.
        var VezdeMainElementLocator = By.cssSelector("[class*='menu']");
    }

    @Test
    public void TestKnijnMagazinSearch()
    {
        driver.navigate().to("http://qajava.skillbox.ru/search.html");
//        Локатор на странице поиска для всех элементов с тегом option
//        и с атрибутом selected. Осуществите поиск только по атрибуту selected.
        var OptionElementLocator = By.cssSelector("[selected]");
    }


//    Задание № 2
    @Test
    public void TestKnijnMagazin_2()
    {
        driver.navigate().to("http://qajava.skillbox.ru/index.html");
//        На главной странице найдите все теги div,
//        которые являются дочерними элементами первого уровня у элемента <footer id="footer">.
        var TegDivElementLocator = By.cssSelector("footer#footer > div");
//        На главной странице найдите любой тег, который расположен сразу после <li id="genres">.
        var TegPosleGenres = By.cssSelector("li#genres + *");
    }

    @Test
    public void TestKnijnMagazinSearch_2()
    {
        driver.navigate().to("http://qajava.skillbox.ru/search.html");
//        На странице поиска найдите любые теги,
//        которые расположены после <div class="filter-container"> (необязательно ближайший сосед).
        var TegiPosleFilterContainer_3 = By.cssSelector("div[class='filter-container'] ~ *");
    }

//    Задание № 3
    @Test
    public void TestClubNoskov()
    {
        driver.navigate().to("http://qajava.skillbox.ru/module05/auth/index.html/");
//        Первый тег h1, находящийся сразу на первом уровне вложенности внутри
//        <section class="important-section-block" for="main-header-page">.
//        Используйте поиск по первому child.
        var Teg_1_H_ElementLocator = By.cssSelector("section.important-section-block[for='main-header-page'] > *:nth-child(1)");
//        Последний тег p, находящийся сразу на первом уровне вложенности внутри <form class="form" id="login-form">.
//        Используйте поиск по child.
        var Teg_P_poslednijElementLocator = By.cssSelector("form.form#login-form > p:last-child");
//        Любой тег, который является третьим дочерним элементом первого уровня тега <body>. Используйте поиск по child.
        var TegBodyLocator = By.cssSelector("body > *:nth-child(3)");
//        Все элементы с тегом <a>, которые являются первым элементом своего родителя <div class="footer__menuList">.
//        Используйте поиск по type.
        var VseTegiAElementLocator = By.cssSelector("div.footer__menuList > a:nth-of-type(1)");



//        По желанию: найдите элемент с тегом <a>, который является первым дочерним элементом данного типа
//        у своего родителя <div class="footer__menuList">, при этом <div class="footer__menuList">
//        является первым дочерним элементом у своего родителя <div class="footer__menu">.
//        Составленный поиск должен вернуть ровно один найденный элемент.
        var Teg_A_ElementLocator = By.cssSelector("div.footer__menu > div.footer__menuList:nth-of-type(1) > a:nth-of-type(1)");
    }
}
