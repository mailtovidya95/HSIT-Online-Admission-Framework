package testbase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class basetest {
    public static WebDriver driver;
    public Properties p;

    @BeforeClass

    public void setDriver()throws Throwable {
        
    	
    	FileReader file=new FileReader(".//src//test//java//resources//config.properties");
        p=new Properties();
        p.load(file);
        
        driver = new ChromeDriver();
        driver.get(p.getProperty("url"));
        driver.manage().window().maximize();
        
        //driver = new ChromeDriver();
        //driver.get("https://hsit.ac.in/admission/admin/admlogin.php");
    }

    
    public String captureScreen(String tname) throws IOException
    {
        String timeStamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        TakesScreenshot takesScreenshot=(TakesScreenshot)  driver;
        File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" +tname+ "_" +timeStamp+ ".png";
        File targetFile=new File(targetFilePath);
        sourceFile.renameTo(targetFile);
        return targetFilePath;
    }
    
    
    @AfterClass
    public void close()
    {
        driver.close();
    }

}
