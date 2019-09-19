package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BaseMenus;
import pageobjects.ContactPage;

public class ContactPageSearchTest extends BaseTest {

    @Test
    public void test1OpenContactPage() {
        BaseMenus baseMenus = new BaseMenus(driver);
        baseMenus.clickHelpButton();
        sleep(1000);
        ContactPage contactPage = new ContactPage(driver);
        Assert.assertEquals(contactPage.getUrl(), "https://secure.iherb.com/info/contact?livechat=en-US");
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
        Assert.assertTrue(contactPage.verifySearchSuggestions("iHerb"));
    }

    @Test
    public void test5VerifySearchSuggestionValidity() {
        ContactPage contactPage = new ContactPage(driver);
        contactPage.clickSearchSuggestion("What is iHerb?");
    }

    @Test
    public void test6VerifySelectedAnswerTitle(){
        ContactPage contactPage = new ContactPage(driver);
        Assert.assertEquals(contactPage.getSearchAnswerTitle(),"What is iHerb?");
    }

    @Test
    public void test7VerifyKeyboardSearchClicking(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.enterAndClickSearchField("iHerb");
        Assert.assertTrue(contactPage.verifySuggestionIsDisplayed());
    }

    @Test
    public void test8VerifyTitleIsClickable(){
        ContactPage contactPage = new ContactPage(driver);
        contactPage.suggestions();
        contactPage.clickAnswerTitle("What is iHerb?");
    }
 }
