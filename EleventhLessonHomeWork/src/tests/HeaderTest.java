package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Header;


public class HeaderTest extends BaseTest {



    //@Test
    public void selectCategory(){
        Header header = new Header(driver);
       Assert.assertTrue(header.selectAndClickHeaderCategory("Beauty"));
    }

    @Test
    public void secondaryHeader(){
        Header header = new Header(driver);
        header.getSecondaryHeaderMenuItem("Supplements");
    }
}
