public class DashboardPage extends BasePage {
    // Element locators
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
}