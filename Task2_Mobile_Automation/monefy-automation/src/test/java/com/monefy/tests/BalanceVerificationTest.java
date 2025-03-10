package com.monefy.tests;

import com.monefy.pages.DashboardPage;
import com.monefy.utils.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BalanceVerificationTest {
    
    private AppiumDriver driver;
    private final String INCOME_AMOUNT = "1500";
    private final String EXPENSE_AMOUNT = "300";
    private final String EXPECTED_BALANCE = "1200";

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        new DashboardPage(driver).resetTransactions();
    }

    @Test(description = "Verify correct balance calculation after multiple transactions")
    public void testBalanceCalculation() {
        DashboardPage dashboard = new DashboardPage(driver);
        
        // Perform transactions
        dashboard.addIncome(INCOME_AMOUNT, "Salary")
                 .addExpense(EXPENSE_AMOUNT, "Transportation");

        // Verify balances
        Assert.assertEquals(dashboard.getTotalBalance(), EXPECTED_BALANCE,
            "Total balance calculation incorrect");
            
        Assert.assertEquals(dashboard.getIncomeBalance(), INCOME_AMOUNT,
            "Income balance not matching");
            
        Assert.assertEquals(dashboard.getExpenseBalance(), EXPENSE_AMOUNT,
            "Expense balance not matching");
    }
    
    @AfterMethod
    public void tearDown() {
        DriverManager.resetApp();
    }
}