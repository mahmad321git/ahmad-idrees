package com.monefy.tests;

import com.monefy.pages.DashboardPage;
import com.monefy.pages.TransactionPage;
import com.monefy.utils.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddExpenseTest {
    
    private AppiumDriver driver;
    private final String EXPENSE_AMOUNT = "200";
    private final String EXPENSE_CATEGORY = "Food";

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        new DashboardPage(driver);
    }

    @Test(description = "Verify adding new expense transaction")
    public void testAddExpenseFlow() {
        // Execute expense transaction
        new DashboardPage(driver)
            .clickAddExpense()
            .selectCategory(EXPENSE_CATEGORY)
            .enterAmount(EXPENSE_AMOUNT)
            .confirmTransaction();

        // Verify balance update
        String actualExpense = new DashboardPage(driver).getExpenseBalance();
        Assert.assertEquals(actualExpense, EXPENSE_AMOUNT, 
            "Expense amount mismatch after transaction");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.resetApp();
    }
}