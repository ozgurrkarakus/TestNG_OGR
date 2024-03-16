package Gun02;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _02_EditAccount extends BaseDriver {

    @Test
    public void EditAccount(){
        WebElement editLink=driver.findElement(By.linkText("Edit Account"));
        editLink.click();

        WebElement txtFirstName=driver.findElement(By.id("input-firstname"));
        txtFirstName.clear();
        txtFirstName.sendKeys("Özgür 2");

        WebElement txtLastName=driver.findElement(By.id("input-lastname"));
        txtLastName.clear();
        txtLastName.sendKeys("Karakuş 2");

        WebElement btnSubmit=driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

        Tools.SuccessMessageValidation();
    }
}
