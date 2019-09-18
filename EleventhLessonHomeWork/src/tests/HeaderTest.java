package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.BaseMenus;


public class HeaderTest extends BaseTest {


    @Test
    public void selectCategory() {
        BaseMenus baseMenus = new BaseMenus(driver);
        Assert.assertTrue(baseMenus.selectAndClickHeaderCategory("Deals"));
    }

    @Test
    public void testLink(){
        BaseMenus baseMenus = new BaseMenus(driver);
        baseMenus.testHoverMenu("Shop", "Sleep");
    }
}
