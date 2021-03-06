package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class SharePanel extends BaseMenus {

    @FindBy(css=".iherb-header-primary.branded-header .branded-header-end .iherb-header-share.share-page .share-content.row .share-social .share-facebook .icon-facebook")//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-social .share-facebook .icon-facebook")
    private WebElement facebookIcon;

    @FindBy(css=".iherb-header-primary.branded-header .branded-header-end .iherb-header-share.share-page .share-content.row .share-social .share-twitter .icon-twitter")//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-social .share-twitter .icon-twitter")
    private WebElement twitterIcon;

    @FindBy(css=".iherb-header-primary.branded-header .branded-header-end .iherb-header-share.share-page .share-content.row .share-social .share-pinterest .icon-pinterest")//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-social .share-pinterest .icon-pinterest")
    private WebElement pinterestIcon;

    @FindBy(css=".iherb-header-primary.branded-header .branded-header-end .iherb-header-share.share-page .share-page-arrow .icon-exit.share-close.share-i")//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-page-arrow .icon-exit.share-close.share-i")
    private WebElement closeButton;

    @FindBy(css=".iherb-header-primary.branded-header .branded-header-end .iherb-header-share.share-page .share-content.row .shorten-container.not-signed-in [type='checkbox']")//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .shorten-container.not-signed-in .check-shorturl [type=checkbox]")
    private WebElement shortenUrlCheckbox;

    @FindBy(css="#share-url")//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-content.row #share-url")
    private WebElement urlWindow;

    @FindBy(css=".iherb-header-primary.branded-header .branded-header-end .iherb-header-share.share-page .share-content.row .btn.btn-full.copy-link.btn-default")//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-content.row .btn.btn-full.copy-link.btn-default")
    private WebElement copyButton;

    public SharePanel(WebDriver driver) {
        super(driver);
    }

    public boolean verifyFacebookIconIsDisplayed() {
        return isElementDisplayedDisplayed(facebookIcon);
    }

    public boolean verifyTwitterIconIsDisplayed() {
        return isElementDisplayedDisplayed(twitterIcon);
    }

    public boolean verifyPinterestIconIsDisplayed() {
        return isElementDisplayedDisplayed(pinterestIcon);
    }

    public void clickShortenUrlCheckbox() {
        click(shortenUrlCheckbox);
    }

    public void clickCopyUrlButton() {
        click(copyButton);
    }

    public void closeSharePanel() {
        click(closeButton);
    }

    public String getFromClipboard() {
        click(copyButton);
        try {
            return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (IOException | UnsupportedFlavorException fe) {
            System.out.println("Extraction failed due to : \n" + fe);
        }
        return null;
    }
}
