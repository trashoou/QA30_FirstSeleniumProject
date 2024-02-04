package DemoWebShoopHW;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{
    @Test
    public void isHomeComponentPresentTest() {
        Assert.assertTrue(isHomeComponentPresent());
    }

    public boolean isHomeComponentPresent() {
        return driver.findElements(By.cssSelector("div:nth-child(2)>div>div>h1")).size()>0;
    }
}
