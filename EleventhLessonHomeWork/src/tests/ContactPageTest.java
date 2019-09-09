package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BaseMenus;
import pageobjects.ContactPage;

public class ContactPageTest extends BaseTest {

    @Test
    public void test1OpenContactPage() {
        BaseMenus baseMenus = new BaseMenus(driver);
        baseMenus.clickHelpButton();
        sleep(1000);
        ContactPage contactPage = new ContactPage(driver);
        Assert.assertEquals(contactPage.getUrl(), "https://secure.iherb.com/info/Contact?livechat=en-US");
    }

    @Test
    public void test2VerifyPageTitle() {
        ContactPage contactPage = new ContactPage(driver);
        Assert.assertEquals(contactPage.getTitle(), "How can we help you?");
    }

    @Test
    public void test3VerifySearchFieldPlaceholder() {
        ContactPage contactPage = new ContactPage(driver);
        Assert.assertEquals(contactPage.getSearchFieldPlaceholder(), "Type your question here");
    }

    @Test
    public void test4VerifySearchSuggestions() {
        ContactPage contactPage = new ContactPage(driver);
        contactPage.enterInputToSearchField("iHerb");
    }
}
