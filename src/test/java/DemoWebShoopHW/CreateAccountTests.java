package DemoWebShoopHW;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateAccountTests extends TestBase {


    @Test
    public void createNewAccPositiveTest() {
        driver.findElement(By.cssSelector("[href='/register']")).click();
        //
        driver.findElement(By.cssSelector("[for='gender-male']")).click();
        //
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Dmitriy");
        //
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Khramov");
        //
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("dimahr@gm.com");
        //
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Password1234!");
        //
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Password1234!");
        //
        driver.findElement(By.name("register-button")).click();
        //
        Assert.assertTrue(isElementPresent(By.cssSelector(".master-wrapper-page:nth-child(4)")));
    }
}
