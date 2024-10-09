package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class T003_students extends T001_logintest{

    @Test
    public void student() {
        driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div[1]/ul/li[2]/a")).click();
        List<WebElement> count = driver.findElements(By.xpath("//tbody/tr/td[1]"));
        System.out.println("num of students are " + count.size());
        int cs=0,cv=0,ec=0,ee=0,me=0;
        for (int i = 1; i <= 4; i++) {
            List<WebElement> cscount = driver.findElements(By.xpath("//*[contains(text(), '2HN2" + i + "CS')]"));
            System.out.println("num of cs students at year 202"+i+ " is " + cscount.size());
            cs=cs+cscount.size();
            List<WebElement> cVcount = driver.findElements(By.xpath("//*[contains(text(), '2HN2"+i+"CV')]"));
            System.out.println("num of cV students at year 202"+i+ " is "  + cVcount.size());
            cv=cv+cVcount.size();
            List<WebElement> eccount = driver.findElements(By.xpath("//*[contains(text(), '2HN2"+i+"EC')]"));
            System.out.println("num of ec students at year 202"+i+ " is " + eccount.size());
            ec=ec+eccount.size();
            List<WebElement> eecount = driver.findElements(By.xpath("//*[contains(text(), '2HN2"+i+"EE')]"));
            System.out.println("num of ee students at year 202"+i+ " is " + eecount.size());
            ee=ee+eecount.size();
            List<WebElement> MEcount = driver.findElements(By.xpath("//*[contains(text(), '2HN2"+i+"ME')]"));
            System.out.println("num of ME students at year 202"+i+ " is " + MEcount.size());
            me=me+MEcount.size();

        }
        System.out.println("total num of cs students are "+cs);
        System.out.println("total num of cv students are "+cv);
        System.out.println("total num of ec students are "+ec);
        System.out.println("total num of ee students are "+ee);
        System.out.println("total num of me students are "+me);

    }

}

