package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends Basepage {

    public loginpage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@placeholder='Enter Username']")
    WebElement enterUsername;
    @FindBy(xpath = "//input[@placeholder='ENTER PASSWORD']")
    WebElement eNTERPASSWORD;
    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/table/tbody/tr[3]/th/input")
    WebElement submit;

    public void setEnterUsername(String usr)
    {
        enterUsername.sendKeys(usr);

    }

    public void seteNTERPASSWORD(String pwd)
    {
        eNTERPASSWORD.sendKeys(pwd);
    }

    public void setSubmit()
    {
        submit.click();
    }


}
