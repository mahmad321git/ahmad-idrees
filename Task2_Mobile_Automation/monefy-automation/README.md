# Monefy App Automation Suite


### Selected E2E User Flows

Based on the exploratory session, the three critical flows chosen are:

1. **Transaction Entry Flow (Income/Expense)**
   - Adding Income Test, Adding Expense Test, and Balance Verification Test.

### **Is the solution easy to maintain and scale?**  
Yes, the framework is designed for long-term maintainability and horizontal scaling.

### **How I achieve this?**  
1. **Modular Architecture**  
   - Page Object Model (POM) pattern separates UI elements from test logic  
   - Atomic test cases with single responsibility principle  
   - Reusable utility classes (`DriverManager`, `Config`)  

2. **Configuration Management**  
   - Externalized capabilities (`capabilities.json`)  
   - Parameterized test data (`testdata.properties`)  
   - Environment-friendly Docker setup  

3. **Scalability Features**  
   - Thread-safe parallel execution ready  
   - Cloud device farm compatible (BrowserStack/Sauce Labs)  
   - CI/CD pipeline integration hooks  

4. **Update Resilience**  
   - Centralized element locators  
   - Version-controlled dependencies (Gradle/Maven)


## Tech Stack Justification, Why I have choose this?:

| Component       | Choice          | Rationale                                                                 |
|-----------------|-----------------|---------------------------------------------------------------------------|
| **Automation**  | Appium          | Cross-platform support, active community
| **Language**    | Java + Kotlin   | Type safety, Android ecosystem alignment, hybrid POM implemenation |
| **Framework**   | TestNG          | Parallel execution, flexible test grouping, rich reporting              |
| **Container**   | Docker          | Environment consistency, dependency isolation, cloud-native execution   |
| **Build Tool**  | Gradle          | Faster builds, Android Studio compatibility, declarative configuration  |

## Prerequisites
- Java 11+
- Node.js 16+
- Android SDK
- Appium 2.x

## Setup & Run test cases
1. Clone repository
2. Install dependencies:
   ```bash
   ./gradlew build
   npm install -g appium