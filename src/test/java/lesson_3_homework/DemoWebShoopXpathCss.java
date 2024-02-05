package lesson_3_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DemoWebShoopXpathCss {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        // Максимизация окна браузера
        driver.manage().window().maximize();
        // Открытие тестируемой страницы
        driver.get("https://demowebshop.tricentis.com");
    }

    @Test
    public void testFindByCssSelector() {
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".master-wrapper-content"));
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector(".header-links-wrapper"));
        driver.findElement(By.cssSelector(".flyout-cart"));
        driver.findElement(By.cssSelector(".search-box"));
        driver.findElement(By.cssSelector(".tax-display-type-selector"));
        driver.findElement(By.cssSelector(".currency-selector"));
        driver.findElement(By.cssSelector(".language-selector"));
    }

    @Test
    public void testFindByXPath() {
        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-content']"));
        driver.findElement(By.xpath("//*[@class='header']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@class='header-links-wrapper']"));
        driver.findElement(By.xpath("//*[@class='flyout-cart']"));
        driver.findElement(By.xpath("//*[@class='search-box']"));
        driver.findElement(By.xpath("//*[@class='tax-display-type-selector']"));
        driver.findElement(By.xpath("//*[@class='currency-selector']"));
        driver.findElement(By.xpath("//*[@class='language-selector']"));
    }

    @AfterClass
    public void tearDown() {
        // Закрытие браузера после завершения тестов
        driver.quit();
    }
}
