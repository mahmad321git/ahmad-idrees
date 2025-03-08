FROM maven:3.8.6-openjdk-11

WORKDIR /app
COPY . .

RUN mvn clean package

CMD ["mvn", "test", "-Dbase.url=http://petstore:8080/v2"]