public class TransactionPage extends BasePage {
    private final By amountField = MobileBy.id("com.monefy.app.lite:id/amount_text_view");
    private final By categoryButton = MobileBy.xpath("//*[@text='Category Name']");
    private final By keyboardButton = MobileBy.id("com.monefy.app.lite:id/buttonKeyboard1");

    public TransactionPage(AppiumDriver driver) {
        super(driver);
    }

    public TransactionPage enterAmount(String amount) {
        // Implement numeric keyboard handling
        return this;
    }
}