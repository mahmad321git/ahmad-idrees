# Pet Store API Automation

## Features
- CRUD operations for Pet endpoints
- Allure test reporting
- Dockerized execution
- Environment configuration

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

# Docker
docker-compose up --build