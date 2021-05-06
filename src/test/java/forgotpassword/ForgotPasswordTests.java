package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.RetrivePasswordPage;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void forgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        RetrivePasswordPage retrivePasswordPage= forgotPasswordPage.EnterEmail("tau@gmail.com");
        assertEquals(retrivePasswordPage.getMessage(),"Your e-mail's been sent!");


    }


}
