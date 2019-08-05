package com.tests;

import com.pageobjects.HomePage;
import org.testng.annotations.Test;

public class TestProductSelection extends BaseTest{

    @Test
    public void selectProduct(){
        HomePage homePage = new HomePage(driver);
        homePage.searchBoxForProduct("Aloe Vera");
        homePage.selectProduct("Now Foods, Aloe Vera Gels, 250 Softgels");
    }
}
