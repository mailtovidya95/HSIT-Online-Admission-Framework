package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T004_personal extends T001_logintest{
    @Test
    public void personal()
    {
       driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div[1]/ul/li[3]/a")).click();
       //driver.findElement(By.xpath("//*[@id=\"mybtn\"]")).click();
       String exp=driver.getTitle();

        String act="Student Basic Information";
        Assert.assertEquals(act,exp);
        driver.findElement(By.xpath("//*[@id=\"mybtn\"]")).click();
        String exp1=driver.getTitle();
        String act1="Examination";
        Assert.assertEquals(act1,exp1);
    }
}
