package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T002_Dashboard extends T001_logintest {

    @Test
    public void dashborad()
    {
        driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[2]/center/h3/a")).click();
    }
}
