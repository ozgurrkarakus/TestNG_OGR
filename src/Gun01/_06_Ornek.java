package Gun01;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_Ornek extends BaseDriver {

    @Test
    public void LoginTest() {
        System.out.println("Login Test başladı");
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        Tools.Bekle(2);
        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("ozgurkarakus@gmail.com");
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("Ozgur0234");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();wait.until(ExpectedConditions.titleIs("My Account"));
        Assert.assertTrue(driver.getTitle().equals("My Account"));
        System.out.println("Login Test bitti");


    }

}




