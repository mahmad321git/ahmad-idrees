public class DriverManager {
    private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    
    public static synchronized AppiumDriver getDriver() {
        if (driver.get() == null) {
            initializeDriver();
        }
        return driver.get();
    }

    private static void initializeDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:app", Config.APP_PATH);
        // Add other capabilities
        
        driver.set(new AndroidDriver(Config.APPIUM_SERVER_URL, caps));
    }
}