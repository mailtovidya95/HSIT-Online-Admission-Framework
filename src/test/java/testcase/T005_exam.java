package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T005_exam extends T001_logintest{

    @Test
    public void exam()
    {
        driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div[1]/ul/li[4]/a")).click();
        String exp=driver.getTitle();
        String act="Examination";
        Assert.assertEquals(act,exp);
    }
}
