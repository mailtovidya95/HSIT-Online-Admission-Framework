package testcase;

import org.testng.annotations.Test;

import pageobject.loginpage;
import testbase.basetest;

//import static testbase.basetest.driver;

public class T001_logintest extends basetest {


    @Test
    public void logincheck() {
        loginpage hm = new loginpage(driver);
        hm.setEnterUsername("ADMIN");
        hm.seteNTERPASSWORD("7119");
        hm.setSubmit();
    }
}
