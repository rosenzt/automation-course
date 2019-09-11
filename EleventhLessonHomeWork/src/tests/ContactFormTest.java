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
        contactPage.fillContactUsForm("ABC", "ABC@ABC.com","order__where_is_my_order", "123456789", "Hi");
        contactPage.submitMessage();
        Assert.assertEquals(contactPage.getSuccessMessage(),"Thank you for your message. iHerb customer service will respond to you shortly.");
    }


    @Test
    public void test4VerifyNoEmailAddressError(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactUsForm("","", "","","");
        contactPage.submitMessage();
        Assert.assertEquals(contactPage.getErrorMessages(),"Email Required");
    }

    @Test
    public void test5VerifyInvalidEmailAddress(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactUsForm("","123", "","","");
        contactPage.submitMessage();
        Assert.assertEquals(contactPage.getErrorMessages(),"Invalid Email Address.");
    }

    @Test
    public void test6VerifyInvalidEmailAddress(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactUsForm("","123", "","","");
        contactPage.submitMessage();
        Assert.assertEquals(contactPage.getErrorMessages(),"Invalid Email Address.");
    }

    @Test
    public void test7VerifyCategoryErrorMessage(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactUsForm("","abc@abc.com", "","","");
        contactPage.submitMessage();
        Assert.assertEquals(contactPage.getErrorMessages(),"");
    }

    @Test
    public void test8VerifyMessageFieldErrorMessage(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactUsForm("","abc@abc.com", "account_admin","","");
        contactPage.submitMessage();
        Assert.assertEquals(contactPage.getErrorMessages(),"Message Required");
    }
}
