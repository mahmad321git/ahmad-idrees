package com.monefy.tests;

import com.monefy.pages.DashboardPage;
import com.monefy.utils.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddIncomeTest {
    private AppiumDriver driver;
    
    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        new DashboardPage(driver);
    }

    @Test(description = "Verify successful income addition")
    public void testAddIncome() {
        String amount = "1000";
        String category = "Salary";
        
        new DashboardPage(driver)
            .clickAddIncome()
            .selectCategory(category)
            .enterAmount(amount)
            .confirmTransaction();

        String actualBalance = new DashboardPage(driver).getBalance();
        Assert.assertEquals(actualBalance, amount, "Balance mismatch after income addition");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.resetApp();
    }
}