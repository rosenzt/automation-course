package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BaseMenus;
import pageobjects.SharePanel;

public class SocialPanelTest extends BaseTest {

    private String initialUrl;
    private String shortenUrl;

    @Test
    public void test1isFacebookIconDisplayed() {
        BaseMenus baseMenus = new BaseMenus(driver);
        baseMenus.clickShareButton();
        sleep(2000);
        SharePanel sharePanel = new SharePanel(driver);
        Assert.assertTrue(sharePanel.verifyFacebookIconIsDisplayed());
    }

    @Test
    public void test2isTwitterIconDisplayed() {
        SharePanel sharePanel = new SharePanel(driver);
        Assert.assertTrue(sharePanel.verifyTwitterIconIsDisplayed());
    }

    @Test
    public void test3isPinterestIconDisplayed() {
        SharePanel sharePanel = new SharePanel(driver);
        Assert.assertTrue(sharePanel.verifyPinterestIconIsDisplayed());
    }

    @Test
    public void test4testInitialUrl() {
        SharePanel sharePanel = new SharePanel(driver);
        System.out.println("Current URL: " + sharePanel.getUrl());
        System.out.println("Shareable URL: " + sharePanel.getFromClipboard());
        Assert.assertEquals(sharePanel.getUrl(),sharePanel.getFromClipboard());
    }

    @Test
    public void test5testShortenUrls(){
        SharePanel sharePanel = new SharePanel(driver);
        initialUrl = sharePanel.getFromClipboard();
        sharePanel.clickShortenUrlCheckbox();
        sleep(1000);
        shortenUrl = sharePanel.getFromClipboard();
        System.out.println("Initail URL: " + initialUrl + "\nShorten URL: " + shortenUrl);
        Assert.assertNotEquals(initialUrl, shortenUrl);
    }

    @Test
    public void test6closeSharePanel(){
        SharePanel sharePanel = new SharePanel(driver);
        sharePanel.closeSharePanel();
        sleep(1000);
        Assert.assertFalse(sharePanel.verifyFacebookIconIsDisplayed());
    }

    @Test
    public void test7pasteUrl() {
        SharePanel sharePanel = new SharePanel(driver);
        openNewTab();
        goToUrl(shortenUrl);
        sleep(2000);
        Assert.assertEquals(initialUrl,sharePanel.getUrl());

    }
}
