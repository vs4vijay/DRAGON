# Dragon

## Installation

```shell
mvn install
```

## Running

```shell
# For Maven based project
mvn spring-boot:run

# For Gradle based project
gradle bootRun
```

- Application is running on: http://localhost:8888/dragons 
- H2 Console is running on: http://localhost:8888/h2-console 

---

## Packaging

```shell
mvn clean install

# *.jar file will be in ./target folder
# java -jar dragon-*.jar
```

---

### Development Notes

```shell


curl localhost:8888/dragons

curl -H 'Content-Type: application/json' -d '{"name": "vijay", "power": "fire"}' localhost:8888/dragons

export MAVEN_OPTS=-Xmx1024m


@RepositoryRestResource(path = "students", collectionResourceRel = "students")


spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Change H2 Storage
spring.datasource.url=jdbc:h2:file:/data/demo


```
