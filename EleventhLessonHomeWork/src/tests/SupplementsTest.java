package tests;

        import org.testng.Assert;
        import org.testng.annotations.Test;
        import pageobjects.Supplements;

public class SupplementsTest extends BaseTest {

    @Test
    public void test1MoveToSupplements() {
        Supplements supplements = new Supplements(driver);
        supplements.selectAndClickHeaderCategory("Supplements");
        Assert.assertEquals("https://il.iherb.com/c/supplements", supplements.getUrl());
    }

    @Test
    public void test2PriceFilter() {
        Supplements supplements = new Supplements(driver);
        supplements.clickPriceFilter();
        supplements.selectedFixedPriceRange("Filter$50+5");
        sleep(2000);
        supplements.getPrices();
    }
}
