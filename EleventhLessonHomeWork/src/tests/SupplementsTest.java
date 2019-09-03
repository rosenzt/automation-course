package tests;

        import org.testng.Assert;
        import org.testng.annotations.Test;
        import pageobjects.Supplements;

public class SupplementsTest extends BaseTest {

    @Test
    public void test1MoveToSupplements() {
        Supplements supplements = new Supplements(driver);
        supplements.selectAndClickHeaderCategory("Supplements");
        Assert.assertEquals("iherb.com/c/supplements", supplements.getUrl().substring(supplements.getUrl().length()-23));
    }

    //@Test
    public void test2PriceFilter() {
        Supplements supplements = new Supplements(driver);
        supplements.clickPriceFilter();
        supplements.selectedFixedPriceRange("Filter$50+5");
        sleep(2000);
        Assert.assertTrue(supplements.validatePrices("bigger", 50,null));
    }

    @Test
    public void test3ExclusiveFilter(){
        Supplements supplements = new Supplements(driver);
        supplements.exclusiveFilter();
    }
}
