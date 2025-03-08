This repository contains my submission for the Senior Quality Engineer take-home challenge.

## Tasks
1. **[Task 1: Exploratory Testing Report](Task1_Exploratory_Testing.md)**  
2. **[Task 2: Mobile Automation](Task2_Mobile_Automation)**  
3. **[Task 3: API Automation](Task3_API_Automation)**  

# Pet Store API Automation

## Features
- CRUD operations for Pet endpoints
- Surefire test reporting
- Dockerized execution
- Environment configuration

## Tech Stack
| Component       | Technology       | Reason                           |
|-----------------|------------------|----------------------------------|
| API Testing     | RestAssured      | Declarative API testing          |
| Test Runner     | JUnit 5          | Modern annotations/parallel exec |
| Reporting       | SureFire         | Rich HTML reports                |
| Build Tool      | Maven            | Dependency management            |
| Containerization| Docker           | Environment consistency          |

## Run Tests
```bash
# Local
mvn test -Dbase.url=http://localhost:8080/v2

# Docker
docker-compose up --build