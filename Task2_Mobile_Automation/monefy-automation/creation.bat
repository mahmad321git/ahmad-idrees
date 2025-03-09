:: Create directories
mkdir src\main\java\com\monefy\pages
mkdir src\main\java\com\monefy\utils
mkdir src\test\java\com\monefy\tests
mkdir config
mkdir test-data
mkdir reports

:: Create page objects
type nul > src\main\java\com\monefy\pages\BasePage.java
type nul > src\main\java\com\monefy\pages\DashboardPage.java
type nul > src\main\java\com\monefy\pages\TransactionPage.java

:: Create utilities
type nul > src\main\java\com\monefy\utils\DriverManager.java
type nul > src\main\java\com\monefy\utils\Config.java

:: Create test files
type nul > src\test\java\com\monefy\tests\AddIncomeTest.java
type nul > src\test\java\com\monefy\tests\AddExpenseTest.java
type nul > src\test\java\com\monefy\tests\BalanceVerificationTest.java

:: Create config files
type nul > config\capabilities.json
type nul > test-data\testdata.properties

:: Create root files
type nul > Dockerfile
type nul > docker-compose.yml
type nul > README.md