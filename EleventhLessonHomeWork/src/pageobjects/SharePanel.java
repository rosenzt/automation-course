package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SharePanel extends BaseMenus {

    @FindBy(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-social .share-facebook .icon-facebook")
    private WebElement facebookIcon;

    @FindBy(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-social .share-twitter .icon-twitter")
    private WebElement twitterIcon;

    @FindBy(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-social .share-pinterest .icon-pinterest")
    private WebElement pinterestIcon;

    @FindBy(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-page-arrow .icon-exit.share-close.share-i")
    private WebElement closeButton;

    @FindBy(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .shorten-container.not-signed-in .check-shorturl [type=checkbox]")
    private WebElement shortenUrlCheckbox;

    @FindBy(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-content.row #share-url")
    private WebElement urlWindow;

    @FindBy(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .share-wrapper #share-page-container .share-content.row .btn.btn-full.copy-link.btn-default")
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

    public String getShareableUrl() {
        return getText(urlWindow);
    }

    public void clickShortenUrlCheckbox() {
        click(shortenUrlCheckbox);
    }

    public void clickCopyUrlButton() {
        click(copyButton);
    }

    public void closeSharePanel(){
        click(closeButton);
    }
}
