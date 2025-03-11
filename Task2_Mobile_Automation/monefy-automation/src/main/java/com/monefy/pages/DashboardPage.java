public class DashboardPage extends BasePage {
    private final By incomeButton = MobileBy.id("com.monefy.app.lite:id/income_button");
    private final By expenseButton = MobileBy.id("com.monefy.app.lite:id/expense_button");
    private final By balanceAmount = MobileBy.id("com.monefy.app.lite:id/balance_amount");

    public DashboardPage(AppiumDriver driver) {
        super(driver);
    }

    public TransactionPage clickAddIncome() {
        wait.until(ExpectedConditions.elementToBeClickable(incomeButton)).click();
        return new TransactionPage(driver);
    }
    public String getTotalBalance() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(totalBalance)).getText();
    }

    public String getIncomeBalance() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(incomeAmount)).getText();
    }

    public String getExpenseBalance() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(expenseAmount)).getText();
    }

    public DashboardPage resetTransactions() {
        // Implementation to reset transactions between tests
        return this;
    }


}