package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Supplements;

public class SupplementsTest extends BaseTest {

    private String initialTotalProducts;
    private String filteredTotalProducts;

    @Test
    public void test1MoveToSupplements() {
        Supplements supplements = new Supplements(driver);
        //supplements.selectAndClickHeaderCategory("Supplements");
        //supplements.headerMenu("Shop");
        //supplements.selectHeaderCategory("Supplements");
        supplements.testNewMenu("Shop","Supplements", "Supplements" );
        initialTotalProducts = supplements.getLastPaginationValue();
        Assert.assertEquals("iherb.com/c/supplements", supplements.getUrl().substring(supplements.getUrl().length() - 23));
    }

    @Test
    public void test2PriceFilter() {
        Supplements supplements = new Supplements(driver);
        initialTotalProducts = supplements.getLastPaginationValue();
        supplements.clickPriceFilter();
        supplements.selectedFixedPriceRange("Filter$50+5");
        sleep(2000);
        Assert.assertTrue(supplements.validatePrices("bigger", 50, null));
    }

    @Test
    public void test3verifyFilterEffectiveness() {
        Supplements supplements = new Supplements(driver);
        filteredTotalProducts = supplements.getLastPaginationValue();
        Assert.assertTrue(Integer.valueOf(filteredTotalProducts) < Integer.valueOf(initialTotalProducts));
    }

    @Test
    public void test4ExclusiveToolTipAppearance() {
        Supplements supplements = new Supplements(driver);
        supplements.exclusiveToolTip();
        Assert.assertTrue(supplements.verifyToolTipAppears());
    }

    @Test
    public void test5ExclusiveToolTipTitle() {
        Supplements supplements = new Supplements(driver);
        Assert.assertEquals(supplements.getToolTipTitle(), "Exclusive");
    }

    @Test
    public void test6ExclusiveToolTipContent() {
        Supplements supplements = new Supplements(driver);
        Assert.assertEquals(supplements.getToolTipContent(), "Products sold exclusively through iHerb.");
    }

    @Test
    public void test7ExclusiveToolTipClosing() {
        Supplements supplements = new Supplements(driver);
        supplements.closeToolTip();
        Assert.assertFalse(supplements.verifyToolTipAppears());
    }

    @Test
    public void test8ExclusiveFilter() {
        Supplements supplements = new Supplements(driver);
        supplements.addExclusiveFilter();
        Assert.assertTrue(supplements.verifyAppliedFilters("Exclusive"));
    }

    @Test
    public void test9AppliedFilters() {
        Supplements supplements = new Supplements(driver);
        supplements.closeAppliedFilter("$50+");
        Assert.assertFalse(supplements.verifyAppliedFilters("$50+"));
    }
}
