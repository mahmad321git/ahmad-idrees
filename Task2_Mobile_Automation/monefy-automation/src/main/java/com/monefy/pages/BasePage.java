public class BasePage {
    protected AppiumDriver driver;
    protected final WebDriverWait wait;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
}