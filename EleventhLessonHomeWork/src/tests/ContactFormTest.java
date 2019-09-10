package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BaseMenus;
import pageobjects.ContactPage;

public class ContactFormTest extends BaseTest{

    @Test
    public void test1OpenContactPage() {
        BaseMenus baseMenus = new BaseMenus(driver);
        baseMenus.clickHelpButton();
        sleep(1000);
        ContactPage contactPage = new ContactPage(driver);
        Assert.assertEquals(contactPage.getUrl(), "https://secure.iherb.com/info/Contact?livechat=en-US");
    }

    @Test
    public void test2VerifyChatWithUsForm(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.selectChatWithUs();
        Assert.assertTrue(contactPage.verifyChatTabContent());
    }

    public void test3FillEmailUsForm(){ //"Commented out" in order avoid harassing iHrb
        ContactPage contactPage = new ContactPage(driver);
        contactPage.selectEmailUsTab();
        contactPage.fillContactUsForm("ABC", "ABC@ABC.com","Where's my Order?", "123456789", "Hi");
        contactPage.submitMessage();
        Assert.assertEquals(contactPage.getSuccessMessage(),"Thank you for your message. iHerb customer service will respond to you shortly.");
    }


    @Test
    public void test4VerifyEmailAddress(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactUsForm("","", "","","");
        contactPage.submitMessage();
        contactPage.getErrorMessages();
    }
}
