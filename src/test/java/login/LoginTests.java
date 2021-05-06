package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullogin(){
        LoginPage loginPage=homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        assertEquals(secureAreaPage.getAlertText(),
                "You logged into a secure area!\n" +
                        "×",
                "You can't login");
    }
}
