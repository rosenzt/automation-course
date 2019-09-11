package tests;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BaseMenus;


public class HeaderTest extends BaseTest {


    //@Test
    public void selectCategory() {
        BaseMenus baseMenus = new BaseMenus(driver);
        Assert.assertTrue(baseMenus.selectAndClickHeaderCategory("Beauty"));
    }

    //@Test
    public void secondaryHeader() {
        BaseMenus baseMenus = new BaseMenus(driver);
        baseMenus.getSecondaryHeaderMenuItem("Supplements");
    }

    @Test
    public void testLink(){
        BaseMenus baseMenus = new BaseMenus(driver);
        baseMenus.testHoverMenu("Supplements");
    }
}
