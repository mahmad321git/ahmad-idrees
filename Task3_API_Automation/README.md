# Pet Store API Automation

## Features
- CRUD operations for Pet endpoints


## Is the Solution easy to Maintain & Scale?
Yes, I have choose the framework in such a way that it will help to maintain & scale the project needs dynamically, I will explain it further how:

### Easy to Maintain
- **Modular Structure:**  
  Each CRUD operation is encapsulated in separate test methods within a dedicated test class. This separation makes it easy to locate, update, or extend tests without impacting unrelated areas.
- **Centralized Configuration:**  
  Common settings, such as the base URI and content type, are defined in a centralized `@BeforeClass` , `@afterClass` annotations, this reduces duplication and simplifies configuration updates.
- **Maven Dependency Management:**  
  Using Maven allows for straightforward management and upgrading of dependencies. With version control in the `pom.xml`, the project remains consistent and up-to-date.

### Scalability
- **Separation of Concerns:**  
  The clear division of test cases for create, read, update, and delete operations ensures that new test cases can be added as the API expands, without interference with existing tests.
- **CI/CD Integration:**  
  The standard Maven project structure facilitates seamless integration into continuous integration pipelines, supporting increased testing needs as the project grows.
- **Advanced Reporting:**  
  Integration with Allure provides detailed and easily digestible reports. This not only improves the identification of issues but also scales well as the number of test cases increases.


## Tech Stack
| Component       | Technology       | Reason                           |
|-----------------|------------------|----------------------------------|
| API Testing     | RestAssured      | Declarative API testing          |
| Test Runner     | JUnit 5          | Modern annotations/parallel exec |
| Reporting       | Allure           | Rich HTML reports                |
| Build Tool      | Maven            | Dependency management            |
| Containerization| Docker           | Environment consistency          |

## Run Tests
```bash
# Local
mvn test -Dbase.url=http://localhost:8080/v2

# Clone, Build the project and run the tests
mvn clean test

# Docker
docker-compose up --build