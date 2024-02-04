package comAitQa30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class lesson3Homework {

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
        // Поиск элементов по cssSelector
        List<WebElement> elements = driver.findElements(By.cssSelector("div"));
        // Вывод количества найденных элементов
        System.out.println("Number of elements found by cssSelector: " + elements.size());
    }

    @Test
    public void testFindByXPath() {
        // Поиск элементов по XPath
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(.,'o')]"));
        // Вывод количества найденных элементов
        System.out.println("Number of elements found by XPath: " + elements.size());
    }

    @AfterClass
    public void tearDown() {
        // Закрытие браузера после завершения тестов
        driver.quit();
    }
}
