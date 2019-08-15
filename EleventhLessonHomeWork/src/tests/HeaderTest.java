package tests;

import org.testng.annotations.Test;
import pageobjects.Header;


public class HeaderTest extends BaseTest {



    @Test
    public void selectCategory(){
        Header header = new Header(driver);
        header.selectHeaderCategory("Brands");
    }
}
